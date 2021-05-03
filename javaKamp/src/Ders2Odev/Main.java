package Ders2Odev;

public class Main {
	public static void main(String[] args) {
		Course course1 =new Course("Java","Engin DEMIRDOG","kamp bilgileri",10);
		Course course2 =new Course("C#","Engin DEMIRDOG","kamp bilgileri",10);
		
		Course courses[]= {course1,course2};
		
		CourseManager courseManager=new CourseManager();
		
		courseManager.addCourse(course1);
		
		courseManager.allCourses(courses);
		
		
		
		
	}

}
