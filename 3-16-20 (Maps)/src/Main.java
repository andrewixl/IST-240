import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
  public static void main(String [] args) {
	  Map<Sport, List<TeamMember>> teams = new HashMap<>();
	  
	  addFootball(Sport.FOOTBALL, teams);
	  addRugby(Sport.RUGBY, teams);
	  addGolf(Sport.GOLF, teams);
	  
	  
	  for (Map.Entry<Sport, List<TeamMember>> me : teams.entrySet()) {
		  System.out.println("The" + me.getKey().name() + " team has players");
		  for (TeamMember tm : me.getValue()) {
			  System.out.println("====> " + tm.getGivenName() + " " + tm.getFamilyName());
		  }
	  }
  }
  
  public static void addFootball(Sport sport, Map<Sport, List<TeamMember>> teams) {
	  List<TeamMember> members = new ArrayList<>();
	  members.add(new TeamMember("John", "Doe", LocalDate.of(1999, 10, 03), "Kinesiology", Student.Level.SOPHOMORE, "Linebacker"));
	  members.add(new TeamMember("Jane", "Doe", LocalDate.of(1999, 10, 03), "IST", Student.Level.SENIOR, "Quarterback"));
	  
	  teams.put(sport, members);
  }
  
  public static void addRugby(Sport sport, Map<Sport, List<TeamMember>> teams) {
	  List<TeamMember> members = new ArrayList<>();
	  members.add(new TeamMember("John", "Doe", LocalDate.of(1999, 10, 03), "Kinesiology", Student.Level.SOPHOMORE, "Linebacker"));
	  members.add(new TeamMember("Jane", "Doe", LocalDate.of(1999, 10, 03), "IST", Student.Level.SENIOR, "Quarterback"));
	  
	  teams.put(sport, members);
  }
  
  public static void addGolf(Sport sport, Map<Sport, List<TeamMember>> teams) {
	  List<TeamMember> members = new ArrayList<>();
	  members.add(new TeamMember("John", "Doe", LocalDate.of(1999, 10, 03), "Kinesiology", Student.Level.SOPHOMORE, "Linebacker"));
	  members.add(new TeamMember("Jane", "Doe", LocalDate.of(1999, 10, 03), "IST", Student.Level.SENIOR, "Quarterback"));
	  
	  teams.put(sport, members);
  }
}
