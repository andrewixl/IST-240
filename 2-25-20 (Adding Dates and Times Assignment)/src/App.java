import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		StudentAthlete sa1 = new StudentAthlete();
		StudentAthlete sa2 = new StudentAthlete();
		String streetName;
		String city;
		String country;
		int postalCode;
		AddressType addressType = null;
		
		Scanner scanner = new Scanner(System.in);
		
		//Start of Athlete 1
		System.out.println("Please Enter the First Student Athlete's First and Last Name:");
		sa1.setFirstName(scanner.next());
		sa1.setLastName(scanner.next());
		
		System.out.println("Please Enter the First Student Athlete's DOB (YYYY-MM-DD):");
		sa1.setDateOfBirth(scanner.next());
		
		System.out.println("Please Enter the First Student Athlete's Hometown:");
		sa1.setHometown(scanner.next());
		
		System.out.println("Please Enter the First Student Athlete's Street Name:");
		scanner.next();
		streetName = scanner.nextLine();
		
		System.out.println("Please Enter the First Student Athlete's City:");
		city = scanner.next();
		
		System.out.println("Please Enter the First Student Athlete's Country:");
		country = scanner.next();
		
		System.out.println("Please Enter the First Student Athlete's Postal Code:");
		postalCode = Integer.parseInt(scanner.next());
		
		System.out.println("Please Enter the Number Coorelating to the First Student Athlete's Address Type");
		System.out.println("1. Temporary /t 2. Permanent /t 3. Local");
		switch(scanner.next()) {
			case "1":
				addressType = AddressType.TEMPORARY;
			case "2":
				addressType = AddressType.PERMANENT;
			case "3":
				addressType = AddressType.LOCAL;
		}
		
		sa1.addAddress(streetName, city, country, postalCode, addressType);
		
		System.out.println("Please Enter the First Student Athlete's ID Number:");
		sa1.setId(Integer.parseInt(scanner.next()));
		
		System.out.println("Please Enter the First Student Athlete's Major");
		sa1.setMajor(scanner.next());
		
		System.out.println("Please Enter the First Student Athlete's GPA");
		sa1.setGpa(Double.parseDouble(scanner.next()));
		
		System.out.println("Please Enter the Number Coorelating to the First Student Athlete's Sport");
		System.out.println("1. Baseball /t 2. Football /t 3. Diving /t 4. Swimming /t 5. Wrestling /t 6. Volleyball");
		switch(scanner.next()) {
			case "1":
				sa1.setSport(Sports.BASEBALL);
				break;
			case "2":
				sa1.setSport(Sports.FOOTBALL);
				break;
			case "3":
				sa1.setSport(Sports.DIVING);
				break;
			case "4":
				sa1.setSport(Sports.SWIMMING);
				break;
			case "5":
				sa1.setSport(Sports.WRESTLING);
				break;
			case "6":
				sa1.setSport(Sports.VOLLEYBALL);
				break;
		}
		
		System.out.println("Please Enter the First Student Athlete's Rank:");
		sa1.setRanking(Integer.parseInt(scanner.next()));
		
		//Start of Athlete #2
		System.out.println("Please Enter the Second Student Athlete's First and Last Name:");
		sa2.setFirstName(scanner.next());
		sa2.setLastName(scanner.next());
		
		System.out.println("Please Enter the Second Student Athlete's DOB (YYYY-MM-DD):");
		sa2.setDateOfBirth(scanner.next());
		
		System.out.println("Please Enter the Second Student Athlete's Hometown:");
		sa2.setHometown(scanner.next());
		
		System.out.println("Please Enter the Second Student Athlete's Street Name:");
		scanner.next();
		streetName = scanner.nextLine();
		
		System.out.println("Please Enter the Second Student Athlete's City:");
		city = scanner.next();
		
		System.out.println("Please Enter the Second Student Athlete's Country:");
		country = scanner.next();
		
		System.out.println("Please Enter the Second Student Athlete's Postal Code:");
		postalCode = Integer.parseInt(scanner.next());
		
		System.out.println("Please Enter the Number Coorelating to the Second Student Athlete's Address Type");
		System.out.println("1. Temporary /t 2. Permanent /t 3. Local");
		switch(scanner.next()) {
			case "1":
				addressType = AddressType.TEMPORARY;
			case "2":
				addressType = AddressType.PERMANENT;
			case "3":
				addressType = AddressType.LOCAL;
		}
		
		sa2.addAddress(streetName, city, country, postalCode, addressType);
		
		System.out.println("Please Enter the Second Student Athlete's ID Number:");
		sa2.setId(Integer.parseInt(scanner.next()));
		
		System.out.println("Please Enter the Second Student Athlete's Major");
		sa2.setMajor(scanner.next());
		
		System.out.println("Please Enter the Second Student Athlete's GPA");
		sa2.setGpa(Double.parseDouble(scanner.next()));
		
		System.out.println("Please Enter the Number Coorelating to the Second Student Athlete's Sport");
		System.out.println("1. Baseball /t 2. Football /t 3. Diving /t 4. Swimming /t 5. Wrestling /t 6. Volleyball");
		switch(scanner.next()) {
			case "1":
				sa2.setSport(Sports.BASEBALL);
				break;
			case "2":
				sa2.setSport(Sports.FOOTBALL);
				break;
			case "3":
				sa2.setSport(Sports.DIVING);
				break;
			case "4":
				sa2.setSport(Sports.SWIMMING);
				break;
			case "5":
				sa2.setSport(Sports.WRESTLING);
				break;
			case "6":
				sa2.setSport(Sports.VOLLEYBALL);
				break;
		}
		
		System.out.println("Please Enter the Second Student Athlete's Rank:");
		sa2.setRanking(Integer.parseInt(scanner.next()));
		

		scanner.close();
		System.out.println(sa1.toString());
		System.out.println(sa2.toString());
	}

}
