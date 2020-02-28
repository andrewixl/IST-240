import java.util.ArrayList;
import java.util.List;

public class Professor
{
    private String givenName;
    private String familyName;
    private List<String> subjectArea;
    private int age;
    private LOE highestLevelOfEducation;

    public Professor(String givenNameIn, String familyNameIn)
    {
        givenName = givenNameIn;
        familyName = familyNameIn;
    }

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

	public LOE getHighestLevelOfEducation() {
		return highestLevelOfEducation;
	}

	public void setHighestLevelOfEducation(LOE highestLevelOfEducation) throws IllegalArgumentException {
		if (!highestLevelOfEducation.equals("M.S.")) {
			throw new IllegalArgumentException ("Invalid value passed: " + highestLevelOfEducation);
		}
		this.highestLevelOfEducation = highestLevelOfEducation;
	}
}