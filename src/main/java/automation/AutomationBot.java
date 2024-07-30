package automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AutomationBot {

    private static final String WFM_DB_URL = "jdbc:oracle:thin:@wfm_db_url:1521:xe";
    private static final String ESP_DB_URL = "jdbc:oracle:thin:@esp_db_url:1521:xe";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        try {
            // Step 3.03 - 3.06: Ensure data is imported into WFM
            ensureDataImported();

            // Step 3.07: Load shift type team
            loadShiftTypeTeam();

            // Step 3.08: Add AHS STANDARD DAY PARTS to AHS ROOT team
            addStandardDayParts();

            // Step 3.09: Make sure shift labels are global
            ensureShiftLabels();

            // Step 3.10: Extract employee mapping and save to CSV
            extractEmployeeMapping();

            // Step 3.11: Extract employee number to WFM user mapping
            extractUserMapping();

            // Step 3.12: Extract historical schedule information
            extractScheduleInformation();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void ensureDataImported() throws Exception {
        // Implementation to check data import status
        System.out.println("Ensure the AHS App Support team has imported data into WFM.");
    }

    private static void loadShiftTypeTeam() throws IOException {
        // Implementation to load shift type team CSV
        System.out.println("Load the file named shift_type_team.csv.");
    }

    private static void addStandardDayParts() throws Exception {
        try (Connection conn = DriverManager.getConnection(WFM_DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
             
            String sql = "INSERT INTO TEAM_DAY_PART_SET (TMDP_ID,WBT_ID,DPSET_ID,TMDP_APL_SUBTM,TMDP_FLAG1,TMDP_FLAG2,TMDP_FLAG3,TMDP_FLAG4,TMDP_FLAG5) " +
                         "VALUES (seq_tmdp_id.nextval, (SELECT wbt_id FROM workbrain_team WHERE wbt_name = '999999'), " +
                         "(SELECT dpset_id FROM day_part_set WHERE dpset_name = 'AHS STANDARD DAY PARTS'), 'Y', 'N', 'N', 'N', 'N', 'N')";
                         
            stmt.executeUpdate(sql);
            conn.commit();
            System.out.println("Added AHS STANDARD DAY PARTS to AHS ROOT team.");
        }
    }

    private static void ensureShiftLabels() throws Exception {
        try (Connection conn = DriverManager.getConnection(WFM_DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
             
            String sql = "INSERT INTO ES_SHIFT_team (esshtm_id, esshift_id, wbt_id, ESSHTM_EFF_START_DATE, ESSHTM_EFF_END_DATE) " +
                         "SELECT seq_esshtm_id.nextval, s.esshift_id, child_wbt_id, '1900-01-01', '3000-01-01' " +
                         "FROM es_shift s, SEC_WB_TEAM_CHILD_PARENT t " +
                         "WHERE s.wbt_id IN (SELECT wbt_id FROM workbrain_team WHERE wbt_name IN ('999999')) " +
                         "AND parent_wbt_id = s.wbt_id " +
                         "AND child_wbt_id != s.wbt_id";
                         
            stmt.executeUpdate(sql);
            conn.commit();
            System.out.println("Ensured shift labels are global.");
        }
    }

    private static void extractEmployeeMapping() throws Exception {
        try (Connection conn = DriverManager.getConnection(WFM_DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             FileWriter csvWriter = new FileWriter("employee_map.csv")) {
             
            String sql = "SELECT * FROM employee_mapping";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                csvWriter.append(rs.getString("employee_number"))
                         .append(",")
                         .append(rs.getString("primary_record_number"))
                         .append("\n");
            }
            csvWriter.flush();
            System.out.println("Extracted employee mapping to employee_map.csv.");
        }
    }

    private static void extractUserMapping() throws Exception {
        try (Connection conn = DriverManager.getConnection(WFM_DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             FileWriter csvWriter = new FileWriter("launchN_emp_to_wfm_user_mapping.csv")) {
             
            String sql = "SELECT * FROM user_mapping";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                csvWriter.append(rs.getString("employee_number"))
                         .append(",")
                         .append(rs.getString("wfm_user_name"))
                         .append("\n");
            }
            csvWriter.flush();
            System.out.println("Extracted user mapping to launchN_emp_to_wfm_user_mapping.csv.");
        }
    }

    private static void extractScheduleInformation() throws Exception {
        try (Connection conn = DriverManager.getConnection(WFM_DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             FileWriter csvWriter = new FileWriter("launchN_employees_to_extract_schedule_details_for.csv")) {
             
            String sql = "SELECT * FROM schedule_information";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                csvWriter.append(rs.getString("employee_number"))
                         .append("\n");
            }
            csvWriter.flush();
            System.out.println("Extracted schedule information to launchN_employees_to_extract_schedule_details_for.csv.");
        }
    }
}
