package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.StaffLogin;
import model.UserLogin;


public class JdbcLogin {
	public UserLogin login(UserLogin user) {
		String sql = "SELECT * FROM customer WHERE Email = ? AND Password=?";
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagementsystem", "root","");
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, user.getEmail());
			pstat.setString(2, user.getPassword());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				user.setCustomerID(rs.getInt("CustomerID"));
			}
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return user;
	}
	
	public StaffLogin login1(StaffLogin staff) {
		String sql = "SELECT * FROM staff WHERE Email = ? AND Password=?";
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagementsystem", "root","");
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, staff.getEmail());
			pstat.setString(2, staff.getPassword());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				staff.setStaffId(rs.getInt("StaffID"));
			}
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return staff;
	}
}