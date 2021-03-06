import java.util.ArrayList;
import java.util.List;

public class StudentAthlete extends Student{
	private String sport;
	private int ranking;
	
	public StudentAthlete(String givenName, String familyName, int age, String hometown, int id, String major, double gpa, String sport, int ranking) {
		super(givenName, familyName, age, hometown, id, major, gpa);
		this.sport = sport;
		this.ranking = ranking;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	@Override
	public String getInfo() {
		StringBuilder sb = new StringBuilder(getGivenName());
		sb.append(" ").append(getFamilyName());
		sb.append(" ").append(getAge());
		sb.append(" ").append(getHometown());
		sb.append(" ").append(getId());
		sb.append(" ").append(getMajor());
		sb.append(" ").append(getGpa());
		sb.append(" ").append(sport);
		sb.append(" ").append(ranking);
		return sb.toString();
	}
}
