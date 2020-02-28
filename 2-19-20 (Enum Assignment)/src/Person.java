import java.util.ArrayList;
import java.util.List;

public class Person {
	private String givenName;
	private String familyName;
	private int age;
	private String hometown;
	private List<Address> addressList = new ArrayList<>();
	
	public Person(String givenName, String familyName, int age, String hometown) {
		this.givenName = givenName;
		this.familyName = familyName;
		this.age = age;
		this.hometown = hometown;
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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	public void addAddress(Address address) {
		addressList.add(address);
	}
	
	public String getInfo() {
		StringBuilder sb = new StringBuilder(givenName);
		sb.append(" ").append(familyName);
		sb.append(" ").append(age);
		sb.append(" ").append(hometown);
		return sb.toString();
	}
}
