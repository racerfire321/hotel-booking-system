package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.RoomType_Model;
import model.Room_Model;
import model.booking_Model;

public class DeleteBooking {

	private static final String DB_URL = "jdbc:mysql://localhost/hotelmanagementsystem";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";

	public boolean bookingTable1(booking_Model booking) {
		boolean success = false;
		String sql = "DELETE FROM booking WHERE bookingid = ?";
		try (
				Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstat = con.prepareStatement(sql)) {
			pstat.setInt(1, booking.getBookingId());
			pstat.executeUpdate();
			success = true;

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		return success;
	}

	public boolean roomTable1(Room_Model room) {
		boolean success = false;
		String sql1 = "DELETE FROM room WHERE RoomId = ?";
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstat = con.prepareStatement(sql1)) {
			pstat.setInt(1, room.getRoomId());
			int rowsAffected = pstat.executeUpdate();
			if (rowsAffected > 0) {
				success = true;
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error deleting room: " + ex.getMessage());
		}
		return success;
	}

	public boolean roomTypeTable1(RoomType_Model roomtype) {
		boolean success = false;
		String sql1 = "DELETE FROM roomtype WHERE RoomNo = ?";
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstat = con.prepareStatement(sql1)) {
			pstat.setInt(1, roomtype.getRoomNo());
			int rowsAffected = pstat.executeUpdate();
			if (rowsAffected > 0) {
				success = true;
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error deleting room type: " + ex.getMessage());
		}
		return success;
	}

}
