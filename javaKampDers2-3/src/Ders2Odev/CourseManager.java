package Ders2Odev;

public class CourseManager {
	
	public CourseManager()
	{
		
	}
	
	public void addCourse(Course course)
	{
		System.out.println(course.name+" kursu eklendi!");
	}
	public void allCourses(Course courses[])
	{
		System.out.println("Tum kurslar: ");
		for(int i=0;i<courses.length;i++)
		{
			System.out.println((i+1)+")"+courses[i].name);
		}
	}

}
