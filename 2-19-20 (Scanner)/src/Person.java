import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
//	public Person(String firstName, String lastName, LocalDate dateOfBirth) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.dateOfBirth = dateOfBirth;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public long getAge() {
		LocalDate now = LocalDate.now();
		long age = ChronoUnit.YEARS.between(dateOfBirth, now);
		return age;
	}
	
	public void setDOB(String dob) {
		this.dateOfBirth = LocalDate.parse(dob);
	}
}
