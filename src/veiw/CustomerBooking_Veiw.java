
	package veiw;

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


	public class CustomerBooking_Veiw implements ListSelectionListener, ActionListener {
		JFrame frame;
		JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
		JLabel logoLabel,phoneLabel,menuLabel,reservationLabel,side_Homelabel,side_Roomslabel,side_Aboutuslabel,side_Servicelabel,side_Booklabel;
		 JLabel checkinLabel ,checkoutLabel,adultLabel,childrenLabel,roomtypeLabel;
		 JTextField checkinField,checkoutField,adultField,childrenField,roomtypeField,bookingidField,roomnoField,roomidField;
		JButton side_Button,updateBtn,deleteBtn;
		JTable table1;
	   	DefaultTableModel tableModel;
	   	JScrollPane scroll;
		JLabel header;
		
		CustomerBooking_Veiw() {
			// Create a new JFrame
			frame = new JFrame("Hotel Luton");
			frame.setSize(1200,875);
	        frame.setLayout(null);
	        frame.setResizable(false);
	        frame.setLocationRelativeTo(null);
			
			// Create the header panel and set its size, position and layout
	        headerPanel = new JPanel();
	        headerPanel.setBounds(0,0,1185,90);
	        headerPanel.setBackground(Color.white);
	        headerPanel.setLayout(null);
	        
	        // Create the sidebar panel and set its size, position and layout
	        sideBarPanel = new JPanel();
	        sideBarPanel.setBounds(1000,90,185,785);
	        sideBarPanel.setBackground(Color.white);
	        sideBarPanel.setLayout(null);
			
			// Create the main panel and set its size, position and layout
	        mainPanel = new JPanel();
	        mainPanel.setBounds(0,90,1000,785);
	        mainPanel.setLayout(null);
	        
	        // Create the sub panel and set its size, position and layout
	        subPanel = new JPanel();
	        subPanel.setBounds(450,150,400,400);
	        subPanel.setBackground(Color.white);
	        subPanel.setLayout(null);

	        // Create hotel logo label and set its position and icon
	        logoLabel = new JLabel();
	        ImageIcon hotelLogo = new ImageIcon("img/hotellogo.png");        
	        logoLabel.setIcon(hotelLogo);
	        logoLabel.setBounds(5,5,310,80);
	        
	        // Create reservation phone number label and set its position and icon
	        reservationLabel = new JLabel();
	        ImageIcon reservationImg = new ImageIcon("img/reservation.jpg");
	        reservationLabel.setIcon(reservationImg);
	        reservationLabel.setBounds(700,30,250,30);

	        // Create phone number label and set its position and icon
	        phoneLabel = new JLabel();
	        ImageIcon phoneImg = new ImageIcon("img/phonenumber.jpg");
	        phoneLabel.setIcon(phoneImg);
	        phoneLabel.setBounds(850,30,250,30);
	        
	        // Create menu label and set its position and icon
	        menuLabel = new JLabel();
	        ImageIcon menuImg = new ImageIcon("img/doubleline.jpg");
	        menuLabel.setIcon(menuImg);
	        menuLabel.setBounds(1050,15,60,60);
	        
	        // Add various Swing components to the header panel
	        headerPanel.add(menuLabel);
	        headerPanel.add(phoneLabel);
	        headerPanel.add(reservationLabel);
	        headerPanel.add(logoLabel);
	        
	        // Create sidebar labels for various pages and set their position and font
	        side_Homelabel = new JLabel("Home");
	        side_Homelabel.setBounds(25,60,200,50);
	        side_Homelabel.setFont(new Font("Pacifico", Font.BOLD, 20));
	      
	        // Create a label for the "Rooms" button and set its properties
	        side_Roomslabel = new JLabel("Rooms");
	        side_Roomslabel.setBounds(25,150,200,50);
	        side_Roomslabel.setFont(new Font("Pacifico", Font.BOLD, 20));

	        // Create a label for the "About Us" button and set its properties
	        side_Aboutuslabel = new JLabel("About Us");
	        side_Aboutuslabel.setBounds(25,450,200,50);
	        side_Aboutuslabel.setFont(new Font("Pacifico", Font.BOLD, 20));

	        // Create a label for the "Service" button and set its properties
	        side_Servicelabel = new JLabel("Service");
	        side_Servicelabel.setBounds(25,350,200,50);
	        side_Servicelabel.setFont(new Font("Pacifico", Font.BOLD, 20));

	        // Create a label for the "Book Now" button and set its properties
	        side_Booklabel = new JLabel("Book Now");
	        side_Booklabel.setBounds(25,250,200,50);
	        side_Booklabel.setFont(new Font("Pacifico", Font.BOLD, 20));

	        // Create a button for closing the sidebar and set its properties
	        side_Button = new JButton("Close");
	        side_Button.setForeground(Color.white);
	        side_Button.setBackground(Color.black);
	        side_Button.addActionListener(this);
	        side_Button.setBounds(25,550,100,50);

	        // Add the labels and button to the sidebar panel
	        sideBarPanel.add(side_Homelabel);
	        sideBarPanel.add(side_Roomslabel);
	        sideBarPanel.add(side_Aboutuslabel);
	        sideBarPanel.add(side_Servicelabel);
	        sideBarPanel.add(side_Booklabel);
	        sideBarPanel.add(side_Button);
	        
	        
	        
	       header = new JLabel("My Booking");
	       header.setFont(new Font("ariel",Font.BOLD,40));
	       header.setBounds(400,10,600,200);
	        frame.add(header);
	        
	        checkinLabel = new JLabel("CheckIn");
			checkinLabel.setBounds(20, 60, 200, 40);
			checkinLabel.setForeground(Color.black);
			checkinLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
			mainPanel.add(checkinLabel);

			 checkinField = new JTextField();
			checkinField.setBounds(130, 60, 150, 30);
			checkinField.setBackground(Color.white);
			mainPanel.add(checkinField);

			 checkoutLabel = new JLabel("CheckOut");
			checkoutLabel.setBounds(300, 60, 200, 30);
			checkoutLabel.setForeground(Color.black);
			checkoutLabel.setFont(new Font("Times new roman", Font.BOLD, 20));
			mainPanel.add(checkoutLabel);

			checkoutField = new JTextField();
			checkoutField.setBounds(400, 60, 150, 30);
			checkoutField.setBackground(Color.white);
			mainPanel.add(checkoutField);

			roomtypeLabel = new JLabel("RoomType");
			roomtypeLabel.setBounds(580, 60, 200, 40);
			roomtypeLabel.setForeground(Color.black);
			roomtypeLabel.setFont(new Font("Times new roman", Font.BOLD, 20));

			mainPanel.add(roomtypeLabel);

			roomtypeField = new JTextField();
			roomtypeField.setBounds(700, 60, 150, 30);
			roomtypeField.setBackground(Color.white);
			mainPanel.add(roomtypeField);

			 roomidField = new JTextField();
		       roomidField.setBounds(0,0,0,0);
		       roomidField.setBackground(Color.white);
		       sideBarPanel.add(roomidField);
			
			adultLabel = new JLabel("Adults");
			adultLabel.setBounds(20, 130, 200, 50);
			adultLabel.setForeground(Color.black);
			adultLabel.setFont(new Font("Times new roman", Font.BOLD, 20));

			mainPanel.add(adultLabel);

			adultField = new JTextField();
			adultField.setBounds(120, 130, 100, 30);
			adultField.setBackground(Color.white);
			mainPanel.add(adultField);

			childrenLabel = new JLabel("Children");
			childrenLabel.setBounds(350, 130, 200, 40);
			childrenLabel.setForeground(Color.black);
			childrenLabel.setFont(new Font("Times new roman", Font.BOLD, 20));

			mainPanel.add(childrenLabel);

			childrenField = new JTextField();
			childrenField.setBounds(500, 130, 100, 30);
			childrenField.setBackground(Color.white);
			mainPanel.add(childrenField);
 
			 bookingidField = new JTextField();
		       bookingidField.setBounds(0,0,0,0);
		       bookingidField.setBackground(Color.white);
		       sideBarPanel.add(bookingidField);
		       
		       roomnoField = new JTextField();
		       roomnoField.setBounds(0,0,0,0);
		       roomnoField.setBackground(Color.white);
		       sideBarPanel.add(roomnoField);
			

			updateBtn = new JButton("Update");
			updateBtn.setForeground(Color.white);
			updateBtn.setBackground(Color.black);
			updateBtn.setBounds(650, 140, 100, 30);
			updateBtn.addActionListener(this);
			mainPanel.add(updateBtn);

			deleteBtn = new JButton("Delete");
			deleteBtn.setForeground(Color.white);
			deleteBtn.setBackground(Color.black);
			deleteBtn.addActionListener(this);
			deleteBtn.setBounds(800, 140, 100, 30);
			mainPanel.add(deleteBtn);

		

	        
	        String[] columnNames = {"Bookingid","firstName","roomid", "checkIn", "checkOut","adults","children","RoomNo", "RoomType", "price"};

	        tableModel = new DefaultTableModel();
	        tableModel.setColumnIdentifiers(columnNames);
	        table1 = new JTable(tableModel);
	        table1.getSelectionModel().addListSelectionListener((ListSelectionListener) this);
			table1.setDefaultEditor(Object.class, null);
	        table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	        table1.setFillsViewportHeight(true);
	        scroll = new JScrollPane(table1);

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "root", "");
	            String sql = "SELECT  booking.bookingid, booking.adults,booking.children, booking.checkIn, booking.checkOut, roomType.roomname,roomType.RoomNo, customer.firstName,room.roomid, room.price FROM booking " +
	                         "INNER JOIN room ON booking.roomid = room.roomid " +
	                         "INNER JOIN customer ON booking.customerid = customer.customerid " +
	                         "INNER JOIN roomType ON room.RoomNo= roomType.RoomNO WHERE customer.CustomerID = ?";
	            PreparedStatement pstat = conn.prepareStatement(sql);
	            pstat.setInt(1,LoginTest.userId);
	            ResultSet rs = pstat.executeQuery();
	            while (rs.next()) {
	            	int bookingid = rs.getInt("bookingid");
	            	 int roomid = rs.getInt("roomid");
	                String firstName = rs.getString("firstName");
	                String checkIn = rs.getString("checkIn");
	                
	                String checkOut = rs.getString("checkOut");
	                int adults = rs.getInt("adults");
	                int children = rs.getInt("children");
	            	int roomno = rs.getInt("roomno");
      
	                String roomType = rs.getString("roomname");
	                int price = rs.getInt("price");
	                tableModel.addRow(new Object[]{ bookingid,roomid,firstName, checkIn, checkOut,adults,children,roomno, roomType, price});
	            }
	            rs.close();
	            pstat.close();
	            conn.close();
	        } catch (Exception ex) {
	            System.out.println("Error: " + ex.getMessage());
	        }

	        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scroll.setBounds(70, 190, 900, 450);
	        mainPanel.add(scroll);

	   		
	   		
	   		
	   		
	     // Create mouse listeners for the sidebar labels
            reservationLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Add code to execute when the reservation button is clicked
                    frame.dispose();
                    new CustomerBooking_Veiw();
                }
            });

            side_Homelabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Add code to execute when the home button is clicked
                    frame.dispose();
                    new Homepage_Veiw();
                }
            });

            side_Roomslabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Add code to execute when the rooms button is clicked
                    frame.dispose();
                    new Room_Veiw();
                }
            });

            side_Aboutuslabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Add code to execute when the about us button is clicked
                    frame.dispose();
                    new Aboutus_View();
                }
            });

            side_Servicelabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Add code to execute when the services button is clicked
                    frame.dispose();
                    new Service_Veiw();
                }
            });

            side_Booklabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Add code to execute when the book button is clicked
                    frame.dispose();
                    new Booking_View();
                }
            });

            // Create popup menu for the menu label
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem login = new JMenuItem("Login");
            JMenuItem register = new JMenuItem("Register");
            JMenuItem signOut = new JMenuItem("Sign out");
            popupMenu.add(login);
            popupMenu.add(register);
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

            register.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Add code to execute when the Register menu item is clicked
                    frame.dispose();
                    new Register_View();
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
	        new CustomerBooking_Veiw();
	    }
	    @Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==updateBtn) {
				UpdateBooking ub = new UpdateBooking();
				int bid = Integer.parseInt(bookingidField.getText());
				String checkin = checkinField.getText();
				String checkout = checkoutField.getText();

				int adult = Integer.parseInt(adultField.getText());
				int children = Integer.parseInt(childrenField.getText());

				
				int rno = Integer.parseInt(roomnoField.getText());
				String roomName = roomtypeField.getText();
				
				booking_Model book= new booking_Model(bid,checkin,checkout,adult,children);
				
				RoomType_Model roomtype = new RoomType_Model(rno,roomName);
				ub.bookingTable1(book);
				ub.roomTypeTable(roomtype);
				
				new CustomerBooking_Veiw();
				frame.dispose();
			}
			if(e.getSource()== side_Button) {
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

				new CustomerBooking_Veiw();
				frame.dispose();
				
			}
	    }
	
		public void valueChanged(ListSelectionEvent event) {
			// TODO Auto-generated method stub
			
	    		if (event.getValueIsAdjusting()) {
	    			return;
	    		}

	    		int selectedRow = table1.getSelectedRow();

	    		if (selectedRow == -1) {
	    			return;
	    		}

	    		DefaultTableModel model = (DefaultTableModel) table1.getModel();
	    		
	    		Object checkIn = model.getValueAt(selectedRow, 3);
	    		Object checkOut = model.getValueAt(selectedRow, 4);
	    		Object children = model.getValueAt(selectedRow, 6);
	    		Object  adult= model.getValueAt(selectedRow, 5);
	    		Object roomtype = model.getValueAt(selectedRow, 8);
	    		Object roomid = model.getValueAt(selectedRow, 1);

	    		Object bookingid = model.getValueAt(selectedRow, 0);
	    		Object roomno = model.getValueAt(selectedRow, 7);


	    		bookingidField.setText(bookingid.toString());
	    		roomidField.setText(roomid.toString());
	    		roomnoField.setText(roomno.toString());
	    		checkinField.setText(checkIn.toString());
	    		checkoutField.setText(checkOut.toString());
	    		roomtypeField.setText(roomtype.toString());
	    		childrenField.setText(children.toString());
	    		adultField.setText(adult.toString());
	    	
		}


	}

		

