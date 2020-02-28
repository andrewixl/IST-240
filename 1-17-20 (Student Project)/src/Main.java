import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Initializes Student 1-3 with the Given and Family Name
		Student student1 = new Student("Andrew", "Burger");
		Student student2 = new Student("Samantha", "Dearolf");
		Student student3 = new Student("Jaxon", "McLendon");
		
		//Sets Student 1-3 Ages
		student1.setAge(19);
		student2.setAge(20);
		student3.setAge(18);
		
		//Sets Student 1-3 GPAs
		student1.setGpa(3.6f);
		student2.setGpa(3.9f);
		student3.setGpa(3.2f);
		
		//Creates Array List to Store 3 Unique Student GPAs
		ArrayList<Float> gpalist = new ArrayList<>();
		gpalist.add(student1.getGpa());
		gpalist.add(student2.getGpa());
		gpalist.add(student3.getGpa());
		
		//Checks if Student 1 has the lowest GPA
		if(gpalist.get(0) < gpalist.get(1) && gpalist.get(0) < gpalist.get(2)) {
			System.out.println(student1.getGivenName() + " " + student1.getFamilyName() + " has the Lowest GPA");
		}
		//Checks if Student 1 has the highest GPA
		if(gpalist.get(0) > gpalist.get(1) && gpalist.get(0) > gpalist.get(2)) {
			System.out.println(student1.getGivenName() + " " + student1.getFamilyName() + " has the Highest GPA");
		}
		//Checks if Student 2 has the lowest GPA
		if(gpalist.get(1) < gpalist.get(0) && gpalist.get(1) < gpalist.get(2)) {
			System.out.println(student2.getGivenName() + " " + student2.getFamilyName() + " has the Lowest GPA");
		}
		//Checks if Student 2 has the highest GPA
		if(gpalist.get(1) > gpalist.get(0) && gpalist.get(1) > gpalist.get(2)) {
			System.out.println(student2.getGivenName() + " " + student2.getFamilyName() + " has the Highest GPA");
		}
		//Checks if Student 3 has the lowest GPA
		if(gpalist.get(2) < gpalist.get(1) && gpalist.get(2) < gpalist.get(0)) {
			System.out.println(student3.getGivenName() + " " + student3.getFamilyName() + " has the Lowest GPA");
		}
		//Checks if Student 3 has the highest GPA
		if(gpalist.get(2) > gpalist.get(1) && gpalist.get(2) > gpalist.get(0)) {
			System.out.println(student3.getGivenName() + " " + student3.getFamilyName() + " has the Highest GPA");
		}
	}
}
