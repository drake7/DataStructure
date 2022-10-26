package dsAssignment1;


public class Student {

	private String name;
	private int StudentId;
	private String email;
	private String major;
	private Double cgpa;
	private LinkedList course;

  
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStudentId() {
		return StudentId;
	}


	public void setStudentId(int studentId) {
		StudentId = studentId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public Student(String name, int studentId, String email, String major, Double cgpa, LinkedList course) {
		super();
		this.name = name;
		StudentId = studentId;
		this.email = email;
		this.major = major;
		this.cgpa = cgpa;
		this.course = course;
	}


	public Double getCgpa() {
		return cgpa;
	}



	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}


	public LinkedList getCourse() {
		return course;
	}


	public void setCourse(LinkedList course) {
		this.course = course;
	}

	@Override
	public String toString() {
		System.out.print( "Student [name=" + this.name + ", StudentId=" + this.StudentId + ", email=" + this.email + ", major=" + this.major
				+ ", cgpa=" + this.cgpa + ", course=[ " + "");
		this.course.printList();
		System.out.println("]");
		return "";
	}




	
	
	
	
}
