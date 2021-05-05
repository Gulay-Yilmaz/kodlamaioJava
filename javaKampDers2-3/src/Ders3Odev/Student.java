package Ders3Odev;

public class Student extends User{

	private int studentNo;

	
	public Student()
	{
	
	}

	public Student(String name, String surname, String password, String email,int studentNo) {
		super(name, surname, password, email);
		this.studentNo = studentNo;

	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}




}
