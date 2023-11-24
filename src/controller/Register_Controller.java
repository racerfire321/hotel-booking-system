package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import model.Register_Model;

public class Register_Controller {
    
public boolean save( Register_Model custregister) {
boolean result= false;

String url = "jdbc:mysql://localhost/hotelmanagementsystem";

try {

Connection con = DriverManager.getConnection(url, "root", "");
String sqlv="INSERT INTO customer( FirstName, MiddleName, LastName, Address, Email, PhoneNumber, BirthDate, Gender, Country, PostCode,Password, Creditcard, CompanyCode, UserType) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sqlv);
pstmt.setString(1,custregister.getFirstName());
pstmt.setString(2,custregister.getMiddleName());
pstmt.setString(3,custregister.getLastName());
pstmt.setString(4,custregister.getAddress());
pstmt.setString(5,custregister.getEmail());
pstmt.setInt(6,custregister.getPhonenumLabel());
pstmt.setString(7,custregister.getDoB());
pstmt.setString(8,custregister.getGender());
pstmt.setString(9,custregister.getCountry());
pstmt.setInt(10,custregister.getPostalcode());
pstmt.setString(11,custregister.getPasswordLabel());
pstmt.setInt(12,custregister.getCreditCardlabel());
pstmt.setInt(13,custregister.getCompanyCodelabel());
pstmt.setString(14,custregister.getType());



pstmt.executeUpdate();
pstmt.close();
con.close();
result=true;

}
catch(Exception ex) {
JOptionPane.showMessageDialog(null, ex.getMessage());

}
return result;
}
}

