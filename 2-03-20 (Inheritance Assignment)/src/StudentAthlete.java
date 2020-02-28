import java.util.ArrayList;
import java.util.List;

public class StudentAthlete extends Student{
	private List<String> sports = new ArrayList<>();
	private int ranking;
	
	public StudentAthlete(String firstName, String lastName, int age, String hometown, int id, String major, double gpa, int ranking) {
		super(firstName, lastName, age, hometown, id, major, gpa);
		this.ranking = ranking;
	}

	public List<String> getSports() {
		return sports;
	}

	public void setSports(ArrayList<String> sports) {
		this.sports = sports;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public void addSports(String c) {
		sports.add(c);
	}
	
	@Override
	public String getInfo() {
		StringBuilder sb = new StringBuilder(getFirstName());
		sb.append(" ").append(getLastName());
		sb.append(" ").append(getAge());
		sb.append(" ").append(getHometown());
		sb.append(" ").append(getId());
		sb.append(" ").append(getMajor());
		sb.append(" ").append(getGpa());
		sb.append(" ").append(sports);
		sb.append(" ").append(ranking);
		return sb.toString();
	}
}
