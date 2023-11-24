package controller;

import model.StaffLogin;

public class ManageLoginStaff {
	private StaffLogin staff;
	public ManageLoginStaff() {
		this.staff=new StaffLogin();
	}
	
	public ManageLoginStaff(StaffLogin staff) {
		this.staff=staff;
	}
	public StaffLogin getUser() {
		return staff;
	}
	public void setUser(StaffLogin staff) {
		this.staff = staff;
	}
	
	public void login1() {
		this.staff = new JdbcLogin().login1(this.staff);
	}

	
}
