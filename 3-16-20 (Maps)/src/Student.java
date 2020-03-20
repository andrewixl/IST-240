import java.time.LocalDate;

public class Student extends Person {
	public enum Level {
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}

	private String major;
	private float gpa;
	private Level level;

	public Student(String givenName, String familyName, LocalDate dob, String major, Level level) {
		super(givenName, familyName, dob);
		this.major = major;
		this.level = level;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
}
