
public class Student extends Person{
	private String major;
	private float gpa;
	
	//Needed to connect to the Person Class to get the information if it is required for a student
	public Student(String givenName, String familyName, int age, String major, float gpa) {
		super(givenName, familyName, age);
		this.major = major;
		this.gpa = gpa;
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
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

}
