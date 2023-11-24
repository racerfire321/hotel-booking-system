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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controller.DeleteBooking;
import controller.UpdateBooking;
import model.RoomType_Model;
import model.Room_Model;
import model.booking_Model;


	public class bookingDash_View implements ListSelectionListener, ActionListener{
		JFrame frame;
		JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
		JLabel logoLabel,phoneLabel,menuLabel,reservationLabel;
		
		JTextField AvailabilityField,checkinField,checkoutField,roomnoField,roomField,bookingstatusField,bookingidField,roomidField; 
		JTable table1;
	   	DefaultTableModel tableModel;
	   	JScrollPane scroll;
		JLabel AvailabilityLabel,checkinLabel,checkoutLabel,roomnoLabel,roomLabel,bookingstatusLabel;
		JButton updateBtn,deleteBtn,checkBtn,backBtn;
		bookingDash_View() {
			frame = new JFrame("Hotel Luton");
	        headerPanel = new JPanel();
	        sideBarPanel = new JPanel();
	        mainPanel = new JPanel();
	        subPanel = new JPanel();
	        logoLabel=new JLabel();
	        phoneLabel=new JLabel();
	        menuLabel=new JLabel();
	        reservationLabel=new JLabel();

	        frame.setSize(1200,875);
	        frame.setLayout(null);
	        frame.setResizable(false);
	        frame.setLocationRelativeTo(null);
	        
	        
	        headerPanel.setBounds(0,0,1185,90);
	        headerPanel.setBackground(Color.white);
	        headerPanel.setLayout(null);
	        
	        sideBarPanel.setBounds(0,90,325,785);
	        sideBarPanel.setBackground(Color.black);
	        sideBarPanel.setLayout(null);
			
	        mainPanel.setBounds(300,90,900,785);
	        mainPanel.setBackground(Color.black);
	        mainPanel.setLayout(null);
	        
	        subPanel.setBounds(325,100,400,400);
	        subPanel.setBackground(Color.white);
	        subPanel.setLayout(null);

	        // Create hotel logo label
	        logoLabel = new JLabel();
	        ImageIcon hotelLogo = new ImageIcon("img/hotellogo.png");        
	        logoLabel.setIcon(hotelLogo);
	        logoLabel.setBounds(5,5,310,80);
	        
	        // Create reservation phone number label
	        reservationLabel = new JLabel();
	        ImageIcon reservationImg = new ImageIcon("img/reservation.jpg");
	     
	        reservationLabel.setIcon(reservationImg);
	        reservationLabel.setBounds(700,30,250,30);

	        //create phone number label
	        phoneLabel = new JLabel();
	        ImageIcon phoneImg = new ImageIcon("img/phonenumber.jpg");
	        phoneLabel.setIcon(phoneImg);
	        phoneLabel.setBounds(850,30,250,30);
	        
	        menuLabel = new JLabel();
	        ImageIcon menuImg = new ImageIcon("img/doubleline.jpg");
	        menuLabel.setIcon(menuImg);
	        menuLabel.setBounds(1050,15,60,60);
	        
	        
	        
	        
	        headerPanel.add(menuLabel);
	        headerPanel.add(phoneLabel);
	        headerPanel.add(reservationLabel);
	        headerPanel.add(logoLabel);
	       
	       
	        
	       AvailabilityLabel = new JLabel("Availability");
	       AvailabilityLabel.setBounds(20,30,200,40);
	       AvailabilityLabel.setForeground(Color.white);
	       AvailabilityLabel.setFont(new Font("Times new roman",Font.BOLD,20));
	       sideBarPanel.add(AvailabilityLabel);
	       
	       
	       
	       AvailabilityField = new JTextField();
	       AvailabilityField.setBounds(175,30,100,30);
	       AvailabilityField.setBackground(Color.white);
	       sideBarPanel.add(AvailabilityField);
	       
	       
	       
	       
	       
	       
	       checkinLabel = new JLabel("Check-In");
	       checkinLabel.setBounds(20,100,200,40);
	       checkinLabel.setForeground(Color.white);
	       checkinLabel.setFont(new Font("Times new roman",Font.BOLD,20));
	       sideBarPanel.add(checkinLabel);
	       
	       
	       checkinField = new JTextField();
	       checkinField.setBounds(175,100,100,30);
	       checkinField.setBackground(Color.white);
	       sideBarPanel.add(checkinField);
	       
	       
	       
	       
	      checkoutLabel = new JLabel("Check-Out");
	      checkoutLabel.setBounds(20,170,200,40);
	      checkoutLabel.setForeground(Color.white);
	      checkoutLabel.setFont(new Font("Times new roman",Font.BOLD,20));

	       sideBarPanel.add(checkoutLabel);
	       
	       
	       checkoutField = new JTextField();
	       checkoutField.setBounds(175,170,100,30);
	       checkoutField.setBackground(Color.white);
	       sideBarPanel.add(checkoutField);
	       
	       
	       
	       
	       roomnoLabel = new JLabel("RoomNo");
	       roomnoLabel.setBounds(20,230,200,40);
	       roomnoLabel.setForeground(Color.white);
	       roomnoLabel.setFont(new Font("Times new roman",Font.BOLD,20));

	       sideBarPanel.add(roomnoLabel);
	       
	       
	       roomnoField = new JTextField();
	       roomnoField.setBounds(175,230,100,30);
	       roomnoField.setBackground(Color.white);
	       sideBarPanel.add(roomnoField);
	       
	       
	       
	       roomLabel = new JLabel("Roomtype");
	       roomLabel.setBounds(20,300,200,40);
	       roomLabel.setForeground(Color.white);
	       roomLabel.setFont(new Font("Times new roman",Font.BOLD,20));

	       sideBarPanel.add(roomLabel);
	       
	       
	       roomField = new JTextField();
	       roomField.setBounds(175,300,100,30);
	       roomField.setBackground(Color.white);
	       sideBarPanel.add(roomField);
	       
	       
	       
	       
	       bookingstatusLabel = new JLabel("Status");
	       bookingstatusLabel.setBounds(20,370,200,40);
	       bookingstatusLabel.setForeground(Color.white);
	       bookingstatusLabel.setFont(new Font("Times new roman",Font.BOLD,20));
	       sideBarPanel.add(bookingstatusLabel);
	       
	       bookingstatusField = new JTextField();
	       bookingstatusField.setBounds(175,370,100,30);
	       bookingstatusField.setBackground(Color.white);
	       sideBarPanel.add(bookingstatusField);
	       
	       bookingidField = new JTextField();
	       bookingidField.setBounds(0,0,0,0);
	       bookingidField.setBackground(Color.white);
	       sideBarPanel.add(bookingidField);
	       
	       roomidField = new JTextField();
	       roomidField.setBounds(0,0,0,0);
	       roomidField.setBackground(Color.white);
	       sideBarPanel.add(roomidField);
	       
	       
	       updateBtn = new JButton("Update");
	       updateBtn.setBounds(20,450,80,30);
	       updateBtn.addActionListener(this);
	       sideBarPanel.add(updateBtn);
	       
	       deleteBtn = new JButton("Delete");
	       deleteBtn.setBounds(110,450,80,30);
	       deleteBtn.addActionListener(this);
	       sideBarPanel.add(deleteBtn);
	       
	       checkBtn = new JButton("Check");
	       checkBtn.setBounds(200,450,80,30);
	       sideBarPanel.add(checkBtn);
	       
	       
	       backBtn = new JButton("<-Back to Dashboard");
	       backBtn.setBounds(20,620,250,40);
	       backBtn.addActionListener(this);
	       sideBarPanel.add(backBtn);

	       String[] columnNames = {"bookingid", "Customerid", "checkIn", "roomid","checkOut", "bookingStatus", "roomNo","RoomType","Availability","NoofBeds", "price"};

	        tableModel = new DefaultTableModel();
	        tableModel.setColumnIdentifiers(columnNames);
	        table1 = new JTable(tableModel);
	        table1.getSelectionModel().addListSelectionListener(this);
			table1.setDefaultEditor(Object.class, null);
	        table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	        table1.setFillsViewportHeight(true);
	        scroll = new JScrollPane(table1);

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "root", "");
	            String sql ="SELECT booking.bookingid, booking.checkIn, booking.checkOut, booking.bookingStatus, roomType.roomname, roomType.RoomNo, roomType.NoofBeds, room.Availability, room.price,room.roomid,booking.CustomerID FROM booking INNER JOIN room ON booking.roomid = room.roomid INNER JOIN roomType ON room.RoomNo = roomType.RoomNO";
	            PreparedStatement pstat = conn.prepareStatement(sql);
	            ResultSet rs = pstat.executeQuery();
	            while (rs.next()) {
	                String bookingId = rs.getString("bookingid");
	                int customerId = rs.getInt("CustomerId");
	                int roomid = rs.getInt("roomid");

                    String checkIn = rs.getString("checkIn");
	                String checkOut = rs.getString("checkOut");
	                String bookingStatus = rs.getString("bookingStatus");
	                String roomType = rs.getString("roomname");
	                String Availability = rs.getString("Availability");
	                int roomNo = rs.getInt("RoomNo");
                    int noofBeds = rs.getInt("NoofBeds");
	                int price = rs.getInt("price");
	                tableModel.addRow(new Object[]{bookingId, customerId,roomid, checkIn, checkOut, bookingStatus,roomNo, roomType,Availability,noofBeds, price});
	            }
	            rs.close();
	            pstat.close();
	            conn.close();
	        } catch (Exception ex) {
	            System.out.println("Error: " + ex.getMessage());
	        }

	        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scroll.setBounds(0, 20,870, 600);
	        mainPanel.add(scroll);
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

	   
		

	
		
		@Override
		public void valueChanged(ListSelectionEvent event) {
			
	    		if (event.getValueIsAdjusting()) {
	    			return;
	    		}

	    		int selectedRow = table1.getSelectedRow();

	    		if (selectedRow == -1) {
	    			return;
	    		}

	    		DefaultTableModel model = (DefaultTableModel) table1.getModel();
	    		Object Availability = model.getValueAt(selectedRow, 8);
	    		Object checkIn = model.getValueAt(selectedRow, 3);
	    		Object checkOut = model.getValueAt(selectedRow, 4);
	    		Object roomType = model.getValueAt(selectedRow, 7);
	    		Object bookingid = model.getValueAt(selectedRow, 0);
	    		Object roomid = model.getValueAt(selectedRow, 2);

	    		Object roomNo = model.getValueAt(selectedRow, 6);
	    		Object status = model.getValueAt(selectedRow, 5);
	    		

	    		AvailabilityField.setText(Availability.toString());
	    		bookingidField.setText(bookingid.toString());
	    		roomidField.setText(roomid.toString());
	    		checkinField.setText(checkIn.toString());
	    		checkoutField.setText(checkOut.toString());
	    		roomField.setText(roomType.toString());
	    		roomnoField.setText(roomNo.toString());
	 	       bookingstatusField.setText(status.toString());
	    	
		}
		

		 public static void main(String args[]) {
		        new bookingDash_View();
		    }




		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==updateBtn) {
				UpdateBooking ub = new UpdateBooking();
				int bid = Integer.parseInt(bookingidField.getText());
				String checkin = checkinField.getText();
				String checkout = checkoutField.getText();
				String bkstatus = bookingstatusField.getText();
				
				int rid = Integer.parseInt(roomidField.getText());
				String availability = AvailabilityField.getText();
				
				int rno = Integer.parseInt(roomnoField.getText());
				String roomName = roomField.getText();
				
				booking_Model book= new booking_Model(bid,checkin,checkout,bkstatus);
				Room_Model room = new Room_Model(rid,availability);
				RoomType_Model roomtype = new RoomType_Model(rno,roomName);
				
				ub.bookingTable(book);
				ub.roomTable(room);
				ub.roomTypeTable(roomtype);
				new bookingDash_View();
				frame.dispose();
				
			}
			if(e.getSource()==deleteBtn) {
				DeleteBooking db = new DeleteBooking();
				int bid = Integer.parseInt(bookingidField.getText());
				
				
				int rid = Integer.parseInt(roomidField.getText());
				
				int rno = Integer.parseInt(roomnoField.getText());
				
				
				booking_Model book= new booking_Model(bid,null,null,null);
				Room_Model room = new Room_Model(rid,null);
				RoomType_Model roomtype = new RoomType_Model(rno,null);
				
				db.bookingTable1(book);
				db.roomTable1(room);
				db.roomTypeTable1(roomtype);

				new bookingDash_View();
				frame.dispose();
				
			}
			if (e.getSource()== backBtn) {
				frame.dispose();
				new Staff_Veiw();
			}
		}
		
	   
	}



