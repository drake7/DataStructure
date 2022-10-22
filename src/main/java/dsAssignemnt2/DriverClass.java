package dsAssignemnt2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverClass {


	
	public static void main(String[] args) {
		//create a student list in the class
		LListApp student=new LListApp<Student>();
			
		LListApp course=new LListApp<Course>();
		course.add("Deepak");
		course.add("patricia");
		

		LListApp course1=new LListApp<Course>();
		course1.add("Deepak1");
		course1.add("patricia1");

		LListApp course2=new LListApp<Course>();
		course2.add("Deepak2");
		course2.add("patricia2");
		Student st=new Student("name",1,"emailAddress","major",2.0,course);
		Student st1=new Student("name1",1,"emailAddress","major",2.0,course1);
		Student st2=new Student("name2",1,"emailAddress","major",2.0,course2);
		
		student.add(st1);
		student.add(st2);
		student.add(st);
		
		
		
		Scanner sc=new Scanner(System.in);
		boolean runProgram=true;
		do
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
			
			try {
				
				int n=sc.nextInt();
			
				
				switch (n) {
				case 1:
					addStudent();
					runProgram=false;	
					break;
				case 2:
					searchStudentRemoveCourse(student, 1, 1);
					runProgram=false;	
					break;
				case 3:
					addStudent();
					runProgram=false;	
					break;
				case 4:
					addStudent();
					runProgram=false;	
					break;
				case 5:
					addStudent();
					runProgram=false;	
					break;
				case 6:
					addStudent();
					runProgram=false;	
					break;
				case 7:
					addStudent();
					runProgram=false;	
					break;
				case 8:
					addStudent();
					runProgram=false;	
					break;
				case 9:
					addStudent();
					runProgram=false;	
					break;
				case 0:
					addStudent();
					runProgram=false;	
					break;
				
				default:
					runProgram=false;	
					break;
				}
			}
			catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Please choose from the valid options");
				continue;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}while(runProgram);
		
	}
	
	
	
	public static void addStudent()
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
		sc.nextLine();
		System.out.println("");
		System.out.println("Please enter Student-Email Address:");
		String emailAddress=sc.nextLine();
		System.out.println("Please choose major:");
		String major=sc.nextLine();
		System.out.println("Please provide gpa:");
		Double gpa=sc.nextDouble();
		LListApp course=new LListApp<Course>();
		int courseEntryCheck=0;
		boolean courseCheck=true;
		do {
			System.out.println("Please enter course name for student:");
			String courseName=sc.nextLine();
			
			course.add(courseName);
			System.out.println("Please press 1 to add more course,anything else to finish");
			courseEntryCheck=sc.nextInt();
			if(courseEntryCheck==1)
			{
				continue;
			}
			else
			{
				break;
			}
			}
			while(courseEntryCheck!=1);
		
		
		
		Student st=new Student(name,studentID,emailAddress,major,gpa,course);
		System.out.println(st.toString());
		
		}
	}
		
		
		public static void searchStudentRemoveCourse(LListApp student,int studentPosition,int coursePosition)
		{
		
			Student st=(Student) student.getEntry(studentPosition);
			LListApp c=st.getCourse();
			c.remove(coursePosition);
			st.toString();
		}
		public static void searchStudentAddCourse(LListApp student,int studentPosition,int coursePosition)
		{
		
			Student st=(Student) student.getEntry(studentPosition);
			LListApp c=st.getCourse();
			c.remove(coursePosition);
			st.toString();
		}
		
		
	
}
