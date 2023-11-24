package veiw;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Jdbcbooking_Controller;
import model.RoomType_Model;
import model.Room_Model;
import model.booking_Model;

public class Booking_View extends JFrame implements ActionListener{
	JFrame frame;
	JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
	JLabel logoLabel,phoneLabel,menuLabel,reservationLabel,side_Homelabel,side_Roomslabel,side_Aboutuslabel,side_Servicelabel,side_Booklabel;
	JButton side_Button;
	   
	    private JLabel backgroundImglabel,titleLabel, bedLabel,balconyLabel,adultLabel,childLabel, roomtypeLabel,checkinLabel,checkoutLabel,price;
	    private JTextField  adultField,childField, txtPrice;
	    private JButton submitButton;
	    private JComboBox<?> roomType;
	    JComboBox bedsField,balconyField;
	    JDateChooser checkinDate,checkoutDate;
	    
	    /**
	     * 
	     */
	    public Booking_View() {
			// Create a new JFrame
	    	// Create a new JFrame
			frame = new JFrame("Hotel Luton");
			frame.setSize(1200,835);
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

	    
	       
	        
	       
	        // Set up UI components
	        
	        ImageIcon backGround = new ImageIcon("img/reservation (3).png");
	        
	          backgroundImglabel = new JLabel(backGround);
	         backgroundImglabel.setIcon(backGround);
		         backgroundImglabel.setBounds(00,00,1200,700);
		        

	        /* backgroundImglabel.setBounds(0,0,2500,1000);*/
	       
	         
	    	
	        titleLabel = new JLabel("Make a Booking");
	        titleLabel.setBounds(390,30,600,50);
	        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
	        titleLabel.setForeground(Color.WHITE);
	        
	        
	        checkinLabel = new JLabel("Checkin:");
	        checkinLabel.setBounds(350,130,200,40);
	        checkinLabel.setFont(new Font("Arial", Font.BOLD, 28));
	        checkinLabel.setForeground(Color.white);


	        checkinDate = new JDateChooser();
	        checkinDate.setBounds(530,130,170,30);
	        
	        checkoutLabel = new JLabel("Checkout:");
	        checkoutLabel.setBounds(350,200,200,30);
	        checkoutLabel.setFont(new Font("Arial", Font.BOLD, 28));
	        checkoutLabel.setForeground(Color.white);



	        checkoutDate = new JDateChooser();
	        checkoutDate.setBounds(530,200,170,30);
	       

	        balconyLabel = new JLabel("Balcony ");
	        balconyLabel.setForeground(Color.white);
	        balconyLabel.setBounds(350,250,200,30);
	        balconyLabel.setFont(new Font("Arial", Font.BOLD, 28));

	        String balcony[] = {"Yes","NO",};
			balconyField = new JComboBox(balcony);
			balconyField.setBounds(530,250,100,30);
			balconyField.addActionListener(this);
			balconyField.setEditable(false);
        
	       
	       adultField = new JTextField();
	       adultField.setBounds(470,300,90,30);
	       mainPanel.add(adultField);
	       
	       
	       adultLabel = new JLabel("Adults");
	       adultLabel.setForeground(Color.white);
	       adultLabel.setFont(new Font("Arial", Font.BOLD, 30));
	       adultLabel.setBounds(350,300,100,30);
	      mainPanel.add(adultLabel);
	      
	     childField = new JTextField();
	     childField.setBounds(740,300,90,30);
	     mainPanel.add(childField);
	      
	      
	      childLabel = new JLabel("Children");
	      childLabel.setBounds(600,300,200,30);
	      childLabel.setFont(new Font("Arial", Font.BOLD, 30));
	      childLabel.setForeground(Color.white);
	     mainPanel.add(childLabel);
	     
	     
	     
	       bedLabel = new JLabel("No. of beds:");
	        bedLabel.setBounds(350,380,250,30);
	        bedLabel.setFont(new Font("Arial", Font.BOLD, 30));
	        bedLabel.setForeground(Color.white);

	        
	        String noOfBedsBox[] = {"1","2","3"};
	        bedsField = new JComboBox(noOfBedsBox);
	       bedsField.setBounds(590,380,170,30);
	     
	      
	        roomtypeLabel = new JLabel("Room Type");
	        roomtypeLabel.setForeground(Color.white);
	        roomtypeLabel.setBounds(350,450,200,30);
	        roomtypeLabel.setFont(new Font("Arial", Font.BOLD, 30));

	        String room[] = {"Delux Room","SuperDelux Room","Royal Bedroom","Double Bedroom","Seaveiw Bedroom","Premium Bedroom"};
			roomType = new JComboBox(room);
			roomType.setBounds(590,450,170,40);
			roomType.addActionListener(this);
			roomType.setEditable(false);
			   
			price = new JLabel("Price without VAT");
			price.setForeground(Color.white);

			price.setBounds(350,540,300,30);
			price.setFont(new Font("Arial", Font.BOLD, 30));
			
			txtPrice = new JTextField();
			txtPrice.setBounds(650,540,150,40);
			txtPrice.setText("14000");
			
			
	        
	        
	    
	        
	        submitButton = new JButton("Submit Booking");
	        submitButton.setBackground(Color.black);
	        submitButton.setForeground(Color.white);
	        submitButton.setBounds(680,600,150,40);
	        submitButton.addActionListener(this);
	        
	        // Set up layout
	
	        mainPanel.add(titleLabel);
	        mainPanel.add(new JLabel(""));
	        mainPanel.add(bedLabel);
	        mainPanel.add(bedsField);
	        mainPanel.add(checkinLabel);
	        mainPanel.add(checkinDate);
	        mainPanel.add(checkoutLabel);
	        mainPanel.add(checkoutDate);
	           
	        mainPanel.add(balconyLabel);
	        mainPanel.add(balconyField);
	        
	        mainPanel.add(roomtypeLabel);
	        mainPanel.add(roomType);
	        mainPanel.add(txtPrice);
	        mainPanel.add(price);
	       
	        mainPanel.add(new JLabel(""));
	        mainPanel.add(submitButton);
	        mainPanel.add(backgroundImglabel);
	        
	        
	        // Set up window
	        // Add header panel to frame
	        frame.add(mainPanel);
	        frame.add(headerPanel);
	        frame.add(sideBarPanel);  
	        frame.setVisible(true);
	        
	        
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
	         
	        
	    }
	    
	   
	    public static void main(String[] args) {
	    	new Booking_View();
	    	
	        
	    }


		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==roomType) {
				if (roomType.getSelectedIndex()==0) {
					int price = 14000;
					String unitPrice = price+"";
					txtPrice.setText(unitPrice);
					
				}
				
				else if (roomType.getSelectedIndex()==1) {
					int price = 2330;
					String unitPrice = price+"";
					txtPrice.setText(unitPrice);
					
				}
				else if (roomType.getSelectedIndex()==2) {
					int price = 4000;
					String unitPrice = price+"";
					txtPrice.setText(unitPrice);
					
				}
				else if (roomType.getSelectedIndex()==3) {
					int price = 1340;
					String unitPrice = price+"";
					txtPrice.setText(unitPrice);
					
				}
				else if (roomType.getSelectedIndex()==4) {
					int price = 4000;
					String unitPrice = price+"";
					txtPrice.setText(unitPrice);
					
				}
				else if (roomType.getSelectedIndex()==5) {
					int price =  5000;
					String unitPrice = price+"";
					txtPrice.setText(unitPrice);
					
				} 
			}
			else if(e.getSource()==submitButton) {
				
				
				    Date selectedCheckInDate1 = checkinDate.getDate();
				    String checkIn1 = null;
				    if (selectedCheckInDate1 != null) {
				        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				        checkIn1= dateFormat.format(selectedCheckInDate1);
				    } else {
				        JOptionPane.showMessageDialog(frame, "Please select a check-in date.");
				        return;
				    }

				    Date selectedCheckOutDate1 = checkoutDate.getDate();
				    String checkOut1 = null;
				    if (selectedCheckOutDate1 != null) {
				        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				        checkOut1 = dateFormat.format(selectedCheckOutDate1);
				    } else {
				        JOptionPane.showMessageDialog(frame, "Please select a check-out date.");
				        return;
				    }

				    int adults1 = 0;
				    try {
				        adults1 = Integer.parseInt(adultField.getText());
				    } catch (NumberFormatException ex) {
				        JOptionPane.showMessageDialog(frame, "Please enter a valid number for adults.");
				        return;
				    }

				   

				   

				   

				    // rest of the code
				

				Date selectedCheckInDate = checkinDate.getDate();
				String checkIn = null;
				if (selectedCheckInDate != null) {
				    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				    checkIn = dateFormat.format(selectedCheckInDate);
				}
				
				Date selectedCheckOutDate = checkoutDate.getDate();
				String checkOut = null;
				if (selectedCheckOutDate != null) {
				    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				    checkOut = dateFormat.format(selectedCheckOutDate);
				}
				int adults = Integer.parseInt(adultField.getText());
				int childrens = Integer.parseInt(childField.getText());
				int staffId = 3;
				String bookingStatus = "Booking Pending";
				
				int roomPrice = Integer.parseInt(txtPrice.getText());
				String roomAvailability = "Room Available";
			
				String Type = roomType.getSelectedItem().toString();
				int noOfBeds = Integer.parseInt(bedsField.getSelectedItem().toString());
				String balcony = balconyField.getSelectedItem().toString();
				int floorNo = 6;
				
				RoomType_Model type = new RoomType_Model();
				Room_Model room = new Room_Model();
				booking_Model book = new booking_Model();
				Jdbcbooking_Controller jdbc = new Jdbcbooking_Controller();
				
				
				room.setRoomPrice(roomPrice);
				room.setRoomAvailability(roomAvailability);
				
				book.setCheckIn(checkIn);
				book.setCheckOut(checkOut);
				book.setBookingStatus(bookingStatus);
				book.setAdults(adults);
				book.setChildrens(childrens);
				
				type.setBalcony(balcony);
				type.setFloorNo(floorNo);
				type.setNoOfBeds(noOfBeds);
				
				type.setRoomName(Type);
				
				
				boolean result = jdbc.room(type, room ,book);
				if(result) {
					JOptionPane.showMessageDialog(frame, "Booking Successful.");
					new Booking_View();
					frame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(frame, "Record not saved");
				}
			

			}
			else if(e.getSource()== side_Button) {
                 frame.dispose();
			
		}
		}
}


