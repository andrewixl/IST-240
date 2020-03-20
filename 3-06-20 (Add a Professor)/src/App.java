import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		StudentAthlete sa1 = new StudentAthlete("Andrew", "Burger", "2000-06-30", "Sammamish", 432894, "IST", 3.8, Sports.VOLLEYBALL, 3);
		sa1.addAddress(new Address("323 Curry Hall", "University Park", "USA", 16802, AddressType.LOCAL));
		Professor p1 = new Professor("Jackie", "Chan", "1991-04-20", "China", "Bachelors", true, "Martial Arts");
		p1.addAddress(new Address("323 Vairo Blvd", "University Park", "USA", 16802, AddressType.LOCAL));
		
		
		System.out.println(sa1.toString());
		System.out.println(p1.toString());
	}

}
