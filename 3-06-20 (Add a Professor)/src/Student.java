import java.util.List;

public class Student extends Person{
	private int id;
	private String major;
	private double gpa;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String dateOfBirth, String hometown, int id, String major, double gpa) {
		super(firstName, lastName, dateOfBirth, hometown);
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
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString() { 
        return super.toString() + " " + id + " " + major + " " + gpa; 
    } 
}
