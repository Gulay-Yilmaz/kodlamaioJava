package Ders3Odev;

public class Instructor extends User{
	
	private Student studentList[];

	public Instructor() {

	}

	public Instructor(String name, String surname, String password, String email) {
		super(name, surname, password, email);
		// TODO Auto-generated constructor stub
	}

	public Student[] getStudentList() {
		return studentList;
	}

	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}



	
	
	

	

}
