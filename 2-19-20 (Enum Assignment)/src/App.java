import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("Samantha", "Dearolf", 20, "New Jersey", 43284, "SMEAL", 3.77);
		StudentAthlete sa1 = new StudentAthlete("Andrew", "Burger", 19, "Seattle", 32149, "IST", 3.64, "Baseball", 1);
		
		s1.addAddress(new Address("684 Fondles Ave.", "Melborne", "Australia", 18239, AddressType.LOCAL));
		s1.addAddress(new Address("1121 Daffoldil Lane", "New Jersey", "USA", 16392, AddressType.PERMANENT));
		sa1.addAddress(new Address("323 Curry Hall", "University", "USA", 16802, AddressType.LOCAL));
		sa1.addAddress(new Address("23285 SE 34th Pl", "Sammamish", "USA", 98075, AddressType.PERMANENT));
		
		for (Address address  : s1.getAddressList()) {
			if(address.getAddressType().equals(AddressType.LOCAL))
				System.out.println(address.getInfo());
        }
		
		for (Address address  : sa1.getAddressList()) {
			if(address.getAddressType().equals(AddressType.LOCAL))
				System.out.println(address.getInfo());
        }

	}
}
