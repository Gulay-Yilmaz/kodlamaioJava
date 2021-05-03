package Ders3Odev;

public class StudentManager extends UserManager {
	


	public void add(Student student) {
		System.out.println("Ogrenci eklendi.");
		System.out.println("Isim: " + student.getName());
		System.out.println("Soyisim: " + student.getSurname());
	}
	

	@Override
	public void delete() {
		System.out.println("Ogrenci silindi.");
	}

	public void newCourse(String course)
	{
		System.out.println("Kurs alindi: : "+course);
	}

}
