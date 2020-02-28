
public class Student extends Person{
	private int id;
	private String major;
	private double gpa;
	
	public Student(String givenName, String familyName, int age, String hometown, int id, String major, double gpa) {
		super(givenName, familyName, age, hometown);
		this.id = id;
		this.major = major;
		this.gpa = gpa;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String getInfo() {
		StringBuilder sb = new StringBuilder(getGivenName());
		sb.append(" ").append(getFamilyName());
		sb.append(" ").append(getAge());
		sb.append(" ").append(getHometown());
		sb.append(" ").append(id);
		sb.append(" ").append(major);
		sb.append(" ").append(gpa);
		return sb.toString();
	}
}

