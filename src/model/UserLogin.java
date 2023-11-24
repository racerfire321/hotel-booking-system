package model;

public class UserLogin {
private int CustomerID;
private String Email;
private String Password;




public UserLogin(int CustomerID, String Email, String Password) {
	super();
	this.CustomerID = CustomerID;
	this.Email = Email;
	this.Password = Password;
}


public UserLogin() {
	this.CustomerID = 0;
	this.Email = "";
	this.Password = "";
}


public int getCustomerID() {
	return CustomerID;
}


public void setCustomerID(int customerID) {
	CustomerID = customerID;
}


public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}


public String getPassword() {
	return Password;
}


public void setPassword(String password) {
	Password = password;
}


@Override
public String toString() {
	return "UserLogin [CustomerID=" + CustomerID + ", Email=" + Email + ", Password=" + Password + "]";
}


public int gstStaffID(int staffid) {
	// TODO Auto-generated method stub
	return 0;
}



}