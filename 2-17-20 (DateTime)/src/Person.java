import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDateTime dateOfBirth;
	
	public Person(String firstName, String lastName, LocalDateTime dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

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

	public long getAgeYears() {
		LocalDateTime now = LocalDateTime.now();
		long age = ChronoUnit.YEARS.between(dateOfBirth, now);
		return age;
	}
	
	public long getAgeWeeks() {
		LocalDateTime now = LocalDateTime.now();
		long age = ChronoUnit.WEEKS.between(dateOfBirth, now);
		return age;
	}
	
	public long getAgeDays() {
		LocalDateTime now = LocalDateTime.now();
		long age = ChronoUnit.DAYS.between(dateOfBirth, now);
		return age;
	}
	
	public long getAgeHours() {
		LocalDateTime now = LocalDateTime.now();
		long age = ChronoUnit.HOURS.between(dateOfBirth, now);
		return age;
	}
	
	public long getAgeMinutes() {
		LocalDateTime now = LocalDateTime.now();
		long age = ChronoUnit.MINUTES.between(dateOfBirth, now);
		return age;
	}
}
