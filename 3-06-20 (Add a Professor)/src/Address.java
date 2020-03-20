
public class Address {
	private String streetAddress;
	private String city;
	private String country;
	private int postalCode;
	private AddressType addressType;
	
	public Address(String streetAddress, String city, String country, int postalCode, AddressType addressType) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
		this.addressType = addressType;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public AddressType getAddressType() {
		return addressType;
	}
	
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	
	public String toString() {
		return streetAddress + " " + city + " " + country + " " + postalCode + " " + addressType;
	}
}
