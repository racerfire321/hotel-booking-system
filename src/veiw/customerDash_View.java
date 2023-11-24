
package veiw;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class customerDash_View implements ActionListener {
	JFrame frame;
	JPanel headerPanel, sideBarPanel, mainPanel, subPanel;
	JLabel logoLabel, phoneLabel, menuLabel, reservationLabel;

	JTextField FnameField, custidField, custaddressField, custphonenumField, custemailField, custpasswordField;
	JPanel restroPanel1, restroPanel2, restroPanel3;
	JLabel FnameLabel, custidLabel, custaddressLabel, custphonenumLabel, custemailLabel, custpasswordLabel;
	JButton updateBtn, deleteBtn, checkBtn, backBtn;
	JTable table1;
	DefaultTableModel tableModel;
	JScrollPane scroll;

	customerDash_View() {
		frame = new JFrame("Hotel Luton");
		headerPanel = new JPanel();
		sideBarPanel = new JPanel();
		mainPanel = new JPanel();
		subPanel = new JPanel();
		logoLabel = new JLabel();
		phoneLabel = new JLabel();
		menuLabel = new JLabel();
		reservationLabel = new JLabel();

		frame.setSize(1200, 875);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		headerPanel.setBounds(0, 0, 1185, 90);
		headerPanel.setBackground(Color.white);
		headerPanel.setLayout(null);

		sideBarPanel.setBounds(0, 80, 1200, 400);
		sideBarPanel.setBackground(Color.black);
		sideBarPanel.setLayout(null);

		mainPanel.setBounds(0, 250, 1200, 785);
		mainPanel.setBackground(Color.white);
		mainPanel.setLayout(null);

		// Create hotel logo label
		logoLabel = new JLabel();
		ImageIcon hotelLogo = new ImageIcon("img/hotellogo.png");
		logoLabel.setIcon(hotelLogo);
		logoLabel.setBounds(5, 5, 310, 80);

		// Create reservation phone number label
		reservationLabel = new JLabel();
		ImageIcon reservationImg = new ImageIcon("img/reservation.jpg");

		reservationLabel.setIcon(reservationImg);
		reservationLabel.setBounds(700, 30, 250, 30);

		// create phone number label
		phoneLabel = new JLabel();
		ImageIcon phoneImg = new ImageIcon("img/phonenumber.jpg");
		phoneLabel.setIcon(phoneImg);
		phoneLabel.setBounds(850, 30, 250, 30);

		menuLabel = new JLabel();
		ImageIcon menuImg = new ImageIcon("img/doubleline.jpg");
		menuLabel.setIcon(menuImg);
		menuLabel.setBounds(1050, 15, 60, 60);

		headerPanel.add(menuLabel);
		headerPanel.add(phoneLabel);
		headerPanel.add(reservationLabel);
		headerPanel.add(logoLabel);

		// sideBar

		custidLabel = new JLabel("CustomerID");
		custidLabel.setBounds(20, 40, 200, 40);
		custidLabel.setForeground(Color.white);
		custidLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
		sideBarPanel.add(custidLabel);

		custidField = new JTextField();
		custidField.setBounds(130, 40, 100, 30);
		custidField.setBackground(Color.white);
		sideBarPanel.add(custidField);

		FnameLabel = new JLabel("FirstName");
		FnameLabel.setBounds(400, 40, 100, 40);
		FnameLabel.setForeground(Color.white);
		FnameLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
		sideBarPanel.add(FnameLabel);

		FnameField = new JTextField();
		FnameField.setBounds(500, 40, 100, 30);
		FnameField.setBackground(Color.white);
		sideBarPanel.add(FnameField);

		custaddressLabel = new JLabel("Address");
		custaddressLabel.setBounds(800, 40, 200, 40);
		custaddressLabel.setForeground(Color.white);
		custaddressLabel.setFont(new Font("Times new roman", Font.BOLD, 20));

		sideBarPanel.add(custaddressLabel);

		custaddressField = new JTextField();
		custaddressField.setBounds(900, 40, 100, 30);
		custaddressField.setBackground(Color.white);
		sideBarPanel.add(custaddressField);

		custphonenumLabel = new JLabel("PhoneNo");
		custphonenumLabel.setBounds(20, 130, 200, 40);
		custphonenumLabel.setForeground(Color.white);
		custphonenumLabel.setFont(new Font("Times new roman", Font.BOLD, 20));

		sideBarPanel.add(custphonenumLabel);

		custphonenumField = new JTextField();
		custphonenumField.setBounds(120, 130, 100, 30);
		custphonenumField.setBackground(Color.white);
		sideBarPanel.add(custphonenumField);

		custemailLabel = new JLabel("Email");
		custemailLabel.setBounds(400, 130, 200, 40);
		custemailLabel.setForeground(Color.white);
		custemailLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
		sideBarPanel.add(custemailLabel);

		custemailField = new JTextField();
		custemailField.setBounds(500, 130, 100, 30);
		custemailField.setBackground(Color.white);
		sideBarPanel.add(custemailField);

		custpasswordLabel = new JLabel("Password");
		custpasswordLabel.setBounds(800, 130, 200, 40);
		custpasswordLabel.setForeground(Color.white);
		custpasswordLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
		sideBarPanel.add(custpasswordLabel);

		custpasswordField = new JTextField();
		custpasswordField.setBounds(900, 130, 100, 30);
		custpasswordField.setBackground(Color.white);
		sideBarPanel.add(custpasswordField);

		updateBtn = new JButton("Update");
		updateBtn.setBounds(1050, 40, 80, 30);
		sideBarPanel.add(updateBtn);

		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(1050, 80, 80, 30);
		sideBarPanel.add(deleteBtn);

		checkBtn = new JButton("Check");
		checkBtn.setBounds(1050, 130, 80, 30);
		sideBarPanel.add(checkBtn);

		backBtn = new JButton("<-Back to Dashboard");
		backBtn.setBounds(20, 560, 250, 40);
		sideBarPanel.add(backBtn);

	
		
		String[] columnNames = { "CustomerId", "FirstName", "MiddleName", "LastName", "Address", "Email", "PhoneNumber",
		        "BirthDate", "Gender", "Country", "Postcode", "Password", "Creditcard", "UserType" };

		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // specify the columns and initial row count
		JTable table = new JTable(tableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);


		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagementsystem", "root", "");
		    String sql = "SELECT * FROM customer";
		    PreparedStatement statement = conn.prepareStatement(sql);
		    ResultSet rs = statement.executeQuery();
		    while (rs.next()) {
		        int customerId = rs.getInt("CustomerId");
		        String firstName = rs.getString("FirstName");
		        String middleName = rs.getString("MiddleName");
		        String lastName = rs.getString("LastName");
		        String address = rs.getString("Address");
		        String email = rs.getString("Email");
		        int phoneNumber = rs.getInt("PhoneNumber");
		        String birthDate = rs.getString("BirthDate");
		        String gender = rs.getString("Gender");
		        String country = rs.getString("Country");
		        int postcode = rs.getInt("Postcode");
		        String password = rs.getString("Password");
		        int creditcard = rs.getInt("Creditcard");
		        String userType = rs.getString("UserType");
		        tableModel.addRow(new Object[] { customerId, firstName, middleName, lastName, address, email, phoneNumber,
		                birthDate, gender, country, postcode, password, creditcard, userType });
		    }
		    rs.close();
		    statement.close();
		    conn.close();
		} catch (Exception ex) {
		    System.out.println("Error : " + ex.getMessage());
		}

		scrollPane.setBounds(30, 30, 1100, 800);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);


		mainPanel.add(scrollPane);

		
		
		
		// Create popup menu for the menu label
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem login = new JMenuItem("Login");
        
        JMenuItem signOut = new JMenuItem("Sign out");
        popupMenu.add(login);
        popupMenu.add(signOut);

        // Create mouse listener for the menu label
        menuLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Show the popup menu at the mouse click location
                popupMenu.show(e.getComponent(), 30, 30);
            }
        });

        // Create action listeners for the popup menu items
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add code to execute when the Login menu item is clicked
                frame.dispose();
                new Login_Veiw();
            }
        });

        signOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add code to execute when the Sign Out menu item is clicked
                frame.dispose();
                new FrontPage_Veiw();
            }
        });
		
		
		// Add header panel to frame
		frame.add(mainPanel);
		frame.add(headerPanel);
		frame.add(sideBarPanel);
		frame.setVisible(true);
	}

	public static void main(String args[]) {
		new customerDash_View();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backBtn) {
			frame.dispose();
			new Staff_Veiw();
		} else if (e.getSource() == checkBtn) {
			frame.dispose();
			new Staff_Veiw();
		}

	}

}
