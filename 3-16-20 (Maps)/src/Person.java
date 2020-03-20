import java.time.LocalDate;

public class Person {

	private String givenName;
	private String familyName;
	private LocalDate dateOfBirth;

	public Person(String givenName, String familyName, LocalDate dob) {
		this.givenName = givenName;
		this.familyName = familyName;
		this.dateOfBirth = dob;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
