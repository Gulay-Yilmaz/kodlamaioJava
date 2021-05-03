package Ders3Odev;

public class InstructorManager extends UserManager {
	
	
	public void add(Instructor instructor) {
		System.out.println("\nEgitmen atandi");
		System.out.println("Isim: " + instructor.getName());
		System.out.println("Soyisim: " + instructor.getSurname());
	}
	
	@Override
	public void delete() {
		System.out.println("Egitmen silindi");
	}
	
	public void addNewCourse(String course)
	{
		System.out.println("Yeni bir kurs eklendi : "+course);
	}
	
	public void viewStudentList(Instructor instructor)
	{
		System.out.println("Ogrenciler:");
		Student list[]=instructor.getStudentList();	
		for(int i=0;i<instructor.getCoursesList().length;i++)
			
		     System.out.println(list[i].getName()+" "+list[i].getSurname());
	}


}
