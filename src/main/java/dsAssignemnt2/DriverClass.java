package dsAssignemnt2;

import java.util.Scanner;

public class DriverClass {

	
	public static void main(String[] args) {
		//create a student list in the class
		
		
		LListApp student=new LListApp<Student>();
		
		boolean runProgram=true;
		while(runProgram)
		{
			System.out.println("Please Choose your Option:");
			System.out.println("1. Add a Student.");
			System.out.println("2. Add a Student at Particular Position.");
			System.out.println("3. Remove a Student.");
			System.out.println("4. Remove All Students.");
			System.out.println("5. Retrieve and Display all the Student information.");
			System.out.println("6. Count the number of Students.");
			System.out.println("7. Check if student list is empty.");
			System.out.println("8. Add a course or remove a course for particular Student.");
			System.out.println("9. Search and display a list of students who are taking one particular course.");
			System.out.println("0. Exit");
			runProgram=false;	
		}
		
	}
	
	
	
	public static void addStudent(LListApp student)
	{
		System.out.println("Please enter Student Details");
		boolean addNext=true;
		while(addNext)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Student Name:");
		String name=sc.nextLine();
		System.out.println("Please enter Student-ID:");
		int studentID=sc.nextInt();
		System.out.println("Please enter Student-Email Address:");
		String emailAddress=sc.nextLine();
		System.out.println("Please choose major:");
		String major=sc.nextLine();
		System.out.println("Please provide gpa:");
		Double gpa=sc.nextDouble();
		LListApp course=new LListApp<Course>();
		boolean courseCheck=true;
		while(courseCheck)
		{
			System.out.println("Please enter course name for student:");
			String courseName=sc.nextLine();
			course.add(courseName);
			System.out.println("Please press 1 to add more course,anything else to finish");
			int courseEntryCheck=sc.nextInt();
			
			if(courseEntryCheck==1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		
		
		Student st=new Student(name,studentID,emailAddress,major,gpa,course);
		System.out.println(st.toString());
		
		}
		
		
	}
}
