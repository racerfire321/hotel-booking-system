package model;

public class StaffLogin {
private int staffId;
private String firstName;
private String lastName;
private String email;
private String gender;
private int hotelID;
private String password;
public StaffLogin(int staffId, String firstName, String lastName, String email, String gender, int hotelID,
		String password) {
	super();
	this.staffId = staffId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.gender = gender;
	this.hotelID = hotelID;
	this.password = password;
}

public StaffLogin() {
	this.staffId = 0;
	this.firstName = "";
	this.lastName = "";
	this.email = "";
	this.gender = "";
	this.hotelID = 0;
	this.password = "";
}

public int getStaffId() {
	return staffId;
}

public void setStaffId(int staffId) {
	this.staffId = staffId;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getHotelID() {
	return hotelID;
}

public void setHotelID(int hotelID) {
	this.hotelID = hotelID;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "StaffLogin [staffId=" + staffId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", gender=" + gender + ", hotelID=" + hotelID + ", password=" + password + "]";
}




}
