package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import model.RoomType_Model;
import model.Room_Model;
import model.booking_Model;
import veiw.LoginTest;



public class Jdbcbooking_Controller {

	

		public boolean room(RoomType_Model type ,Room_Model room, booking_Model book) {
			boolean r = false;
			String sql1 = "INSERT INTO `roomtype`(`RoomNo`,`RoomName`, `NoofBeds`, `Balcony`, `FloorNo`) VALUES (?,?,?,?,?);";
			String sql2 = "INSERT INTO room(`RoomId`, `Availability`, `Price`, `RoomNo`) VALUES (?,?,?,?);";
			String sql3 = "INSERT INTO booking ( `CheckIn`, `CheckOut`, `BookingStatus`, `Children`, `Adults`, `CustomerID`, `RoomId`) VALUES ( ?, ?, ?, ?, ?,?,?)";

			try {

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagementsystem", "root", "");
				
				PreparedStatement pstat = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
				pstat.setInt(1,type.getRoomNo());
				pstat.setString(2, type.getRoomName());
				pstat.setInt(3,type.getNoOfBeds());
				pstat.setString(4, type.getBalcony());
				pstat.setInt(5,type.getFloorNo());
				pstat.executeUpdate();
				
				ResultSet result = pstat.getGeneratedKeys();
				int roomNo = 0;
				if (result.next()) {

					roomNo = result.getInt(1);
				}
				
				
				PreparedStatement pstat1 = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
				pstat1.setInt(1, room.getRoomId());
				pstat1.setInt(3, room.getRoomPrice());
				pstat1.setString(2, room.getRoomAvailability());
				pstat1.setInt(4, roomNo);
				pstat1.executeUpdate();
				
				ResultSet rs = pstat1.getGeneratedKeys();
				int roomId = 0;
				if (rs.next()) {
					roomId = rs.getInt(1);
				}

			

				PreparedStatement pstat2 = con.prepareStatement(sql3);
				pstat2.setString(1, book.getCheckIn());
				pstat2.setString(2, book.getCheckOut());
				pstat2.setString(3, book.getBookingStatus());
				pstat2.setInt(4, book.getChildrens());
				pstat2.setInt(5, book.getAdults());
				pstat2.setInt(6, LoginTest.userId);
				pstat2.setInt(7, roomId);
				pstat2.executeUpdate();

				
				
				pstat.close();
				pstat1.close();
				pstat2.close();
				con.close();
				
				
				r = true;

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
				System.out.println(ex.getMessage());
		
			}

			return r;

		}

		
}

