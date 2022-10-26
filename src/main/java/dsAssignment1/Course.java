package dsAssignment1;

public class Course {

	String courseName;
	
	Course next;
	
	Course(String courseName)
	{
		this.courseName=courseName;
		this.next=null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
			return courseName +"";
	}
	
}
