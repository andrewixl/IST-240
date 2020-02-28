import java.util.ArrayList;
import java.util.List;

public class Professor
{
    private String givenName;
    private String familyName;
    private List<String> subjectArea;
    private int age;
    private String highestLevelOfEducation;

    public Professor(String givenName, String familyName)
    {
        this.givenName = givenName;
        this.familyName = familyName;
    }
    
    //Makes a physical copy of the professor class.
//    public Professor(Professor prof) {
//    	givenName = prof.givenName;
//    }

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public List<String> getSubjectArea() {
		return subjectArea;
	}

	public void setSubjectArea(List<String> subjectArea) {
		if (this.subjectArea == null) {
			subjectArea = new ArrayList<>();
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHighestLevelOfEducation() {
		return highestLevelOfEducation;
	}

	public void setHighestLevelOfEducation(String highestLevelOfEducation) throws IllegalArgumentException {
		if (!highestLevelOfEducation.equals("M.S.")) {
			throw new IllegalArgumentException ("Invalid value passed: " + highestLevelOfEducation);
		}
		this.highestLevelOfEducation = highestLevelOfEducation;
	}
}