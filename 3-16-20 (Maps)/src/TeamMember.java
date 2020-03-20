import java.time.LocalDate;

public class TeamMember extends Student {
	private String position;
	
	public TeamMember(String givenName, String familyName, LocalDate dob, String major, Level level) {
		super(givenName, familyName, dob, major, level);
	}

	public TeamMember(String givenName, String familyName, LocalDate dob, String major, Level level, String position) {
		super(givenName, familyName, dob, major, level);
		this.position = position;
	}
	//TeamMember should have a position, for individual sports the value should be Individual
	//Fix the code to correct the errors in this class

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
