
public class App {

	public static void main(String[] args) {
		StudentAthlete sa1 = new StudentAthlete("Andrew", "Burger", 19, "Seattle", 32149, "IST", 3.64, 1);
		sa1.addSports("Baseball");
		sa1.addSports("Volleyball");
		System.out.println(sa1.getInfo());
	}
}
