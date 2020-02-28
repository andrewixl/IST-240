import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your first name: ");
		p1.setFirstName(scanner.next());
		
		System.out.print("What is your last name: ");
		p1.setLastName(scanner.next());
		
		boolean dobValid = false;		
		do {
			System.out.print("What is your Date of Birth (YYYY-MM-DD): ");
			try {
				p1.setDOB(scanner.next());
				dobValid = true;
			}
			catch(DateTimeParseException ne){
				System.out.println("Date not Formatted Correctly");
			}
		}while(!dobValid);
		scanner.close();
		
		System.out.println("Your Name is " + p1.getFirstName() + " " + p1.getLastName() + " and your age is " + p1.getAge());
		
		
	}

}
