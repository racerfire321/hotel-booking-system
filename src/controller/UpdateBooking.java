package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.RoomType_Model;
import model.Room_Model;
import model.booking_Model;

public class UpdateBooking {
	public boolean  bookingTable(booking_Model booking) {
		boolean r = false;
		String sql = "UPDATE booking SET `CheckIn`=?, `CheckOut`=?,`bookingstatus`=?  WHERE `bookingid`=? ";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagementsystem","root","");
			PreparedStatement pstat = con.prepareStatement(sql);
			pstat.setString(1 , booking.getCheckIn());
			pstat.setString(2 , booking.getCheckOut());
			pstat.setString(3 , booking.getBookingStatus());
			pstat.setInt(4 , booking.getBookingId());

			pstat.executeUpdate();
			pstat.close();
			con.close();
			r = true;
		}
		
		catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		return r;
	}
	public boolean  bookingTable1(booking_Model booking) {
	boolean r = false;
	String sql = "UPDATE booking SET `CheckIn`=?, `CheckOut`=?,`Adults`=?,`Children`=?  WHERE `bookingid`=? ";
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagementsystem","root","");
		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setString(1 , booking.getCheckIn());
		pstat.setString(2 , booking.getCheckOut());
		pstat.setInt(5 , booking.getBookingId());
		pstat.setInt(3 , booking.getAdults());
		pstat.setInt(4 , booking.getChildrens());

		pstat.executeUpdate();
		pstat.close();
		con.close();
		r = true;
	}
	
	catch(SQLException ex) {
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
	return r;
}
	
		public boolean  roomTable(Room_Model room) {
			boolean r = false;
			String sql1 = "UPDATE room SET `Availability`=? WHERE `RoomId`=? ";
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagementsystem","root","");
				PreparedStatement pstat = con.prepareStatement(sql1);
				pstat.setString(1 ,room.getRoomAvailability());
				pstat.setInt(2 , room.getRoomId());
				pstat.executeUpdate();
				pstat.close();
				con.close();
				r = true;
			}
			
			catch(SQLException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			return r;
		}
		
		public boolean  roomTypeTable(RoomType_Model roomtype) {
			boolean r = false;
			String sql2 = "UPDATE roomtype SET `RoomName`=? WHERE `RoomNo`=? ";
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagementsystem","root","");
				PreparedStatement pstat = con.prepareStatement(sql2);
				pstat.setString(1 ,roomtype.getRoomName());
				pstat.setInt(2 , roomtype.getRoomNo());
				pstat.executeUpdate();
				pstat.close();
				con.close();
				r = true;
			}
			
			catch(SQLException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			return r;
		}
	
}
