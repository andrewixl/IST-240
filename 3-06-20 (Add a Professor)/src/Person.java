import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String hometown;
	private List<String> addressList = new ArrayList<>();
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, String dateOfBirth, String hometown) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = setDateOfBirth(dateOfBirth);
		this.hometown = hometown;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public LocalDate setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = LocalDate.parse(dateOfBirth);
		return this.dateOfBirth;
	}
	
	public long getAge(LocalDate dateOfBirth) {
		LocalDate now = LocalDate.now();
		long age = ChronoUnit.YEARS.between(dateOfBirth, now);
		return age;
	}
	
	public String getHometown() {
		return hometown;
	}
	
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	public List<String> getAddressList() {
		return addressList;
	}
	
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	public void addAddress(Address address) {
		addressList.add(address.toString());
	}
	
	public String toString() { 
        return firstName + " " + lastName + ", " + getAge(dateOfBirth) + ", " + hometown + " " + addressList.toString(); 
    } 
}
