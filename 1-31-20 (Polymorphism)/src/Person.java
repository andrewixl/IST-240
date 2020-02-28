
public class Person {
	private String givenName;
	private String familyName;
	private int age;
	
	public Person(String givenName, String familyName, int age) {
		this.givenName = givenName;
		this.familyName = familyName;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
