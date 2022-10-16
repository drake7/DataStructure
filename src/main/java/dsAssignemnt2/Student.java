package dsAssignemnt2;

public class Student {

	private String name;
	private int StudentId;
	private String email;
	private String major;
	private Double cgpa;
	private LListApp course;


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


	public Student(String name, int studentId, String email, String major, Double cgpa, LListApp course) {
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


	public LListApp getCourse() {
		return course;
	}


	public void setCourse(LListApp course) {
		this.course = course;
	}

	@Override
	public String toString() {
		
		System.out.println( "Student [name=" + name + ", StudentId=" + StudentId + ", email=" + email + ", major=" + major
				+ ", cgpa=" + cgpa + ", course=" + "");
		course.printList();
		return "";
	}




	
	
	
	
}
