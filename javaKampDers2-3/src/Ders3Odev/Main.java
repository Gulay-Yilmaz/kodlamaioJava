package Ders3Odev;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		instructor1.setSurname("Demirog");
		instructor1.setPassword("engindemirog");
		instructor1.setEmail("engindemirog@gmail.com");
		
		Student student1 = new Student();
		student1.setName("Gulay");
		student1.setSurname("Yilmaz");
		student1.setPassword("1234");
		student1.setEmail("gulay@gmail.com");
		student1.setStudentNo(1);

		Student student2 = new Student("Ayse","Sonmez","4321","ayse@gmail.com",2);
		
		Student []list= {student1,student2};
		String courselist[]= {"java","c#"};
		instructor1.setStudentList(list);
		instructor1.setCoursesList(courselist);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addNewCourse("python");
		instructorManager.viewStudentList(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.newCourse("java");
		studentManager.delete();
	
		
	}
}
