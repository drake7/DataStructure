package java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopSalaryExample {
    public static void main(String[] args) {
        // Sample data - replace this with your actual data
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 80000, 30));
        employees.add(new Employee("Alice", 90000, 28));
        employees.add(new Employee("Bob", 75000, 35));
        employees.add(new Employee("Bob", 75000, 38));
        employees.add(new Employee("depak", 75000, 55));
        employees.add(new Employee("Barks", 79000, 45));
        employees.add(new Employee("Leoniadas", 95000, 65));
        employees.add(new Employee("Rengoku", 71000, 15));
        employees.add(new Employee("Prime", 75500, 25));
        employees.add(new Employee("Curse", 69000, 95));
        employees.add(new Employee("Toji", 81000, 15));
        employees.add(new Employee("Boruto", 10000, 55));
        // Add more employee entries as needed

        // Fetch the top 3 employees based on salary
        List<Employee> top3Employees = getTopNEmployees(employees, 3);
        List<Employee> top3AgeEmployees = getTopAgeNEmployees(employees, 3);

        // Display the results
        System.out.println("Top 3 employees with the highest salaries:");
        for (int i = 0; i < top3Employees.size(); i++) {
            Employee employee = top3Employees.get(i);
            System.out.println((i + 1) + ". " + employee.getName() + " - Salary: $" + employee.getSalary());
        }
        // Display the results
        System.out.println("Top 3 employees with the highest Age:");
        for (int i = 0; i < top3AgeEmployees.size(); i++) {
            Employee employee = top3AgeEmployees.get(i);
            System.out.println((i + 1) + ". " + employee.getName() + " - Age: $" + employee.getAge());
        }
        
        
    }

    // Function to get the top N employees based on salary using Java Stream API
    private static List<Employee> getTopNEmployees(List<Employee> employees, int n) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(n)
                .collect(Collectors.toList());
    }
  
    // Function to get the top N employees based on salary using Java Stream API
    private static List<Employee> getTopAgeNEmployees(List<Employee> employees, int n) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getAge).reversed())
                .limit(n)
                .collect(Collectors.toList());
    }
    /*
     *  Question: Given a list of employees, how would you use Java Stream APIs to find the employee with the highest salary?*/
    private static Employee getTopEmployee(List<Employee> employees, int n) {
     
    	//
    	return employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
    }

    
    
    /*

		Question: Write a Java Stream expression to filter out employees who are younger than 25 from a list.

		Question: Using Java Stream APIs, transform a list of employee names to uppercase and then sort them alphabetically.

		Question: Given a list of employees, find the average age of employees in the list using Java Stream APIs.

		Question: Write a Java Stream expression to group a list of employees by their departments.

		Question: Using Java Stream APIs, concatenate all the names of employees into a single comma-separated string.

		Question: Given a list of employees, filter out those who have a salary less than $50,000 using Java Stream APIs.

		Question: Write a Java Stream expression to calculate the total salary of all employees in the list.

		Question: Given a list of employees, find the top 3 employees with the highest salaries using Java Stream APIs.

		Question: Using Java Stream APIs, find the number of employees in each department from a list of employees.
     * */
}
