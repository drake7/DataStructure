package dsAssignemnt2;

public class DriverClass {

	
	public static void main(String[] args) {
		//create a student list in the class
		
		
		LListApp student=new LListApp<Student>();
		
		addStudent();
		
	}
	
	
	
	public static void addStudent()
	{
		System.out.println("Adding a student");
		LListApp course=new LListApp<Course>();
		Student st=new Student("Deepak",1,"Deepak.kumar7v@gmail.com","CSIS",4.0,course);
		
		
		
	}
}
