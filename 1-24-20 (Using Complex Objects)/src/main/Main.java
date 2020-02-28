package main;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Initializes Student 1-3 with the Given and Family Name
		Student student1 = new Student("Andrew", "Burger");
		Student student2 = new Student("Samantha", "Dearolf");
		Student student3 = new Student("Jaxon", "McLendon");
		
		student1.addCourse(new Course("IST 240"));
		student1.addCourse(new Course("IST 210"));
		student1.addCourse(new Course("IST 261"));
		student1.addCourse(new Course("CMPSC 131"));
		student1.addCourse(new Course("CMPSC 201"));
		
		System.out.println(student1.getGivenName() + " " +  student1.getFamilyName() + " is taking:");
		
		for(Course s : student1.getCourseList()) {
			System.out.println(s.getName());
		}
	}
}
