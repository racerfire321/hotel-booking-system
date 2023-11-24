package model;

public class Register_Model {
	private String firstName, middleName, lastName, gender;
	private int phonenumLabel;
	private String doB;
	private String email, address;
	private int postalcode;
	private String country;

	private String passwordLabel;
	private String usertype;
	private int companyCodelabel, creditCardlabel;

	public Register_Model() {
		super();
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.gender = "";
		this.phonenumLabel = 0;
		this.doB = "";
		this.email = "";
		this.address = "";
		this.postalcode = 0;
		this.country = "";
		this.passwordLabel = "";
		this.usertype = "";
		this.companyCodelabel = 0;
		this.creditCardlabel = 0;
	}

	public Register_Model( String firstName, String middleName, String lastName, String gender,
			int phonenumLabel, String doB, String email, String address, int postalcode, String country,
			String passwordLabel, String type, int companyCodelabel, int creditCardlabel) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.phonenumLabel = phonenumLabel;
		this.doB = doB;
		this.email = email;
		this.address = address;
		this.postalcode = postalcode;
		this.country = country;
		this.passwordLabel = passwordLabel;
		this.usertype = type;
		this.companyCodelabel = companyCodelabel;
		this.creditCardlabel = creditCardlabel;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhonenumLabel() {
		return phonenumLabel;
	}

	public void setPhonenumLabel(int phonenumLabel) {
		this.phonenumLabel = phonenumLabel;
	}

	public String getDoB() {
		return doB;
	}

	public void setDoB(String doB) {
		this.doB = doB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPasswordLabel() {
		return passwordLabel;
	}

	public void setPasswordLabel(String passwordLabel) {
		this.passwordLabel = passwordLabel;
	}

	public String getType() {
		return usertype;
	}

	public void setType(String type) {
		this.usertype = type;
	}

	public int getCompanyCodelabel() {
		return companyCodelabel;
	}

	public void setCompanyCodelabel(int companyCodelabel) {
		this.companyCodelabel = companyCodelabel;
	}

	public int getCreditCardlabel() {
		return creditCardlabel;
	}

	public void setCreditCardlabel(int creditCardlabel) {
		this.creditCardlabel = creditCardlabel;
	}

	@Override
	public String toString() {
		return "Register_Model [firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", gender=" + gender + ", phonenumLabel=" + phonenumLabel + ", doB=" + doB
				+ ", email=" + email + ", address=" + address + ", postalcode=" + postalcode + ", country=" + country
				+ ", passwordLabel=" + passwordLabel + ", type=" + usertype + ", companyCodelabel=" + companyCodelabel
				+ ", creditCardlabel=" + creditCardlabel + "]";
	}

	public int getUserID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPassword(String text) {
		// TODO Auto-generated method stub
		
	}

}