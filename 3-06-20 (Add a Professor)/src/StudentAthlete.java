import java.util.List;

public class StudentAthlete extends Student{
	private Sports sport;
	private int ranking;
	
	public StudentAthlete() {
		
	}
	
	public StudentAthlete(String firstName, String lastName, String dateOfBirth, String hometown, int id, String major, double gpa, Sports sport, int ranking) {
		super(firstName, lastName, dateOfBirth, hometown, id, major, gpa);
		this.sport = sport;
		this.ranking = ranking;
	}
	
	public Sports getSport() {
		return sport;
	}
	
	public void setSport(Sports sport) {
		this.sport = sport;
	}
	
	public int getRanking() {
		return ranking;
	}
	
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public String toString() {
		return super.toString() + " " + sport + " " + ranking;
	}
}
