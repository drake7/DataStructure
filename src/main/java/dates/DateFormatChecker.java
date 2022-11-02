package dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatChecker {
public static void main(String[] args) throws ParseException {
	
	String format="";
	   DateFormat fmt =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	   fmt.parse("2022-10-26 00:00:00.000");
	   
	   
	   System.out.println(fmt.getCalendar());
}

}
