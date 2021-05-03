package Ders3Odev;

public class User {
	private String name;
	private String surname;
	private String password;
	private String email;
	private String coursesList[];

	
	public User()
	{
		
	}

	public User(String name, String surname, String password, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getCoursesList() {
		return coursesList;
	}

	public void setCoursesList(String[] coursesList) {
		this.coursesList = coursesList;
	}




}
