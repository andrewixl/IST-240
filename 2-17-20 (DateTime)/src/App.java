import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Andrew", "Burger", LocalDateTime.of(2000, 06, 30, 22, 30));
		System.out.println(p1.getAgeYears() + " Years");
		System.out.println(p1.getAgeWeeks() + " Weeks");
		System.out.println(p1.getAgeDays() + " Days");
		System.out.println(p1.getAgeHours() + " Hours");
		System.out.println(p1.getAgeMinutes() + " Minutes");
		
		
		
		
		
//		Sample Time Clock
//		LocalDateTime in = LocalDateTime.of(2020, 04, 13, 22, 30);
//		LocalDateTime out = LocalDateTime.of(2020, 04, 14, 4, 00);
//		
//		long hours = ChronoUnit.HOURS.between(in, out);
//		long minutes = ChronoUnit.MINUTES.between(in, out);
//		
//		minutes -= 60 * hours;
//		System.out.println("Hours: " + hours + " " + "Minutes: " + minutes);
	}
}
