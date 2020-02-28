
public class Main {

	public static void main(String[] args) {
		Student test = new Student("Andrew", "Burger");
		test.college = "IST";
		test.year = "Sophmore";
		test.active = true;
		test.age = 19;
		
		System.out.println(test.givenName);
		System.out.println(test.familyName);
		System.out.println(test.college);
		System.out.println(test.year);
		if(test.active == true)
			System.out.println("True");
		else
			System.out.println("False");
		System.out.println(test.age);
	}
}
