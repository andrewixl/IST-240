import java.util.List;

public class Professor extends Person{

	private String highestLevelOfEducation;
	private Boolean tenured;
	private String areaOfResearch;
	
	public Professor() {
		
	}
	
	public Professor(String firstName, String lastName, String dateOfBirth, String hometown, String highestLevelOfEducation, Boolean tenured, String areaOfResearch) {
		super(firstName, lastName, dateOfBirth, hometown);
		this.highestLevelOfEducation = highestLevelOfEducation;
		this.tenured = tenured;
		this.areaOfResearch = areaOfResearch;
	}
	
	public String getHighestLevelOfEducation() {
		return highestLevelOfEducation;
	}
	
	public void setHighestLevelOfEducation(String highestLevelOfEducation) {
		this.highestLevelOfEducation = highestLevelOfEducation;
	}
	
	public Boolean getTenured() {
		return tenured;
	}
	
	public void setTenured(Boolean tenured) {
		this.tenured = tenured;
	}
	public String getAreaOfResearch() {
		return areaOfResearch;
	}
	
	public void setAreaOfResearch(String areaOfResearch) {
		this.areaOfResearch = areaOfResearch;
	}
	
	public String toString() { 
        return super.toString() + " " + highestLevelOfEducation + " " + tenured + " " + areaOfResearch; 
    } 
	
}
