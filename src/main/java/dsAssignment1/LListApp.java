package dsAssignment1;

/**
 * Doc comments
 * 
 * @author Deepak Kumar 
 * 		   Student ID :300357444
 * 
 * @version 1.0	22 Oct 2022
 * 
 * */
import java.util.InputMismatchException;
import java.util.Scanner;

//LList App Class
public class LListApp<T> {

	
	static LinkedList<Student> studentList=new LinkedList<Student>();
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		LinkedList<Course> courseList=new LinkedList<Course>();

		LinkedList<Course> courseList2=new LinkedList<Course>();
		LinkedList<Course> courseList3=new LinkedList<Course>();
		
		Course course1=new Course("deepak");
		Course course2=new Course("PYTI");
		
		courseList.add(course1);
		courseList.add(course2);
		

		courseList2.add(course1);
		courseList2.add(course2);
		

		courseList3.add(course1);
		courseList3.add(course2);
		
		
		Student st1=new Student("name1",1,"emailAddress","major",2.0,courseList);
		Student st2=new Student("name2",1,"emailAddress","major",2.0,courseList2);
		Student st3=new Student("name3 ",1,"emailAddress","major",2.0,courseList3);
		
		
		studentList.add(st1);

		studentList.add(st2);
		studentList.add(st3);
		boolean runProgram = true;
		int n = 1;

		while (runProgram && n != 0) {
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
			n = sc.nextInt();
			sc.nextLine();
			try {

				switch (n) {
				case 1:
					addStudent(0);
					break;
				case 2:
					// searchStudentRemoveCourse(student, 1, 1);
					addStudent(1);
					break;
				case 3:
					System.out.println("Please provide a position to remove");
					int position=sc.nextInt();
					studentList.remove(position);
					break;
				case 4:
					studentList.clear();
					System.out.println("List for Student is empty now.");
					break;
				case 5:
					studentList.printList();
					break;
				case 6:
					System.out.println("Number of the student in the System are:"+(studentList.getLength()+1));
					break;
				case 7:
					if(studentList.isEmpty())
					{
						System.out.println("Student list is empty");
					}
					else
					{
						System.out.println("Student list is not empty");
					}
					break;
				case 8:
					AddOrRemoveCourseForStudent(studentList);
					break;
				case 9:
					int countCourse=printListStudent(studentList);
					System.out.println("Total Student with given course:"+countCourse);
					
					break;
				case 0:
					System.out.println("Exiting the program.");
					System.out.println("Thanks");
					runProgram=false;
					break;

				default:
					System.out.println("Please choose from mentioned entry.");
					break;

				}

			} catch (InputMismatchException e) {
				// TODO: handle exception
				sc.next();
				System.out.println("Please choose from the valid options");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	}
	/**
	 * Method to add the student at the given position by the user.
	 * 
	 * @param positionCheck
	 * 
	 */
	public static void addStudent(int positionCheck)
		{
		
			if (positionCheck!=0) {
				boolean positionValid=true;
				while(positionValid)
				{
					System.out.println("Please provide a position where you want to add the student.");
					positionCheck=sc.nextInt();
					sc.nextLine();
					if(positionCheck>studentList.getLength())
					{
						System.out.println("Invalid position,Please enter correct position");
						continue;
					}
					positionValid=false;
						
				}
				
			}
			System.out.println("****************Enter Student Details****************");
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
			sc.nextLine();
			LinkedList<Course> course=new LinkedList<Course>();
			int courseEntryCheck=1;
			boolean courseCheck=true;
			while(courseCheck && courseEntryCheck==1) {

				System.out.println("Please enter course name for student:");
				String courseName=sc.nextLine();
				Course courseObj=new Course(courseName);
				
				System.out.println("Please press 1 to add course,and 0 to finish");
				courseEntryCheck=sc.nextInt();
				sc.nextLine();
				
				course.add(courseObj);
				
				if(courseEntryCheck==1)
				{
					//if user choose 1 then ask him again.
					
				}
				else
				{
					System.out.println("Exiting the course entry.");
				
					break;
				}
				
			}
			
			
			Student st=new Student(name,studentID,emailAddress,major,gpa,course);
			studentList.add(positionCheck,st);
			
		}

	


	/**
	 * Method to add the print a list who has taken a particular course.
	 * 
	 * @param student.
	 * @return int
	 */
	public static int printListStudent(LinkedList<Student> student) {
		System.out.println("Please enter a course to search");
		String name=sc.nextLine();
		int counter=0;
		Course courseSearch=new Course(name);
		for (int i = 0; i <=student.getLength(); i++) {
			Student st=student.getEntry(i);
			LinkedList<Course> courseList=st.getCourse();
			for (int j = 0; j <=courseList.getLength(); j++) {
			Course course=courseList.getEntry(j);
			if (course.courseName.equals(name)) {
			System.out.println(st);	
			counter+=1;
			}
			}
		
		}
	
		return counter;
	}
	

	/**
	 * Method to add or remove the course for a particular student based on  position provided by the user.
	 * 
	 * @param student
	 * 
	 */
	public static void AddOrRemoveCourseForStudent(LinkedList<Student> student) {
		
		System.out.println("Please enter Position of student you want to alter:");
		int position=sc.nextInt();
		
		while(position>(student.getLength()+1))
		{
			
			System.out.println("Please enter a valid value,Student list length is :"+(student.getLength()+1));
			position=sc.nextInt();
		}
		System.out.println("Please enter 1 for add,2 for remove");
		Student studentObj=student.getEntry(position-1);
		LinkedList<Course> courseListStudent=studentObj.getCourse();
		System.out.println(studentObj);
		
		int addRemove=sc.nextInt();
		if(addRemove==1)
		{
			System.out.println("Please enter a course Name:");
			sc.nextLine();
			String courseName=sc.nextLine();
			Course course=new Course(courseName);
			
			courseListStudent.add(course);
			return;
		}
		if(addRemove==2)
		{
			System.out.println("Please enter a position for remove:");
			int positionRemove=sc.nextInt();
			courseListStudent.remove(positionRemove);
		}
		
		
		}
	

}
