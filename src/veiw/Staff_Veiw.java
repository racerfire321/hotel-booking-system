 
	package veiw;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
	
import javax.swing.JPopupMenu;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;



	import java.awt.Color;
	import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;


	public class Staff_Veiw implements ActionListener {
		JFrame frame;
		JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
		JLabel logoLabel,phoneLabel,menuLabel,reservationLabel,side_Homelabel,side_Roomslabel,side_Aboutuslabel,side_Servicelabel,side_Booklabel;
		JButton side_Button;
		JLabel customerImglabel,bookingImglabel,serviceImglabel,billImglabel,customerTextlabel,bookingTextlabel,seviceTextlabel,billTextlabel;
		
		Staff_Veiw() {
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
	        
	        sideBarPanel.setBounds(1000,90,185,785);
	        sideBarPanel.setBackground(Color.white);
	        sideBarPanel.setLayout(null);
			
	        mainPanel.setBounds(0,90,1000,785);
	        mainPanel.setBackground(Color.white);
	        Border border = new LineBorder(Color.BLACK, 2); // create a black border with a thickness of 1 pixel
	        mainPanel.setBorder(border);
	       
	        mainPanel.setLayout(new GridLayout(2,2));
	        
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
	        
	        
	        
	        
	      
	       //mainpanel
	        ImageIcon customerImg = new ImageIcon("img/customer.jpg");
	        customerImglabel = new JLabel(customerImg);
	        customerImglabel.setIcon(customerImg);
	        customerImglabel.setBorder(border);
	        mainPanel.add(customerImglabel);
	        
	        customerTextlabel = new JLabel("Customer Dashboard");
	        customerTextlabel.setFont(new Font("Aril", Font.BOLD, 30));
	        customerTextlabel.setBounds(40,50,400,200);
	        frame.add(customerTextlabel);
	        
	        
	        
	        ImageIcon bookingImg = new ImageIcon("img/booking.jpg");
	        bookingImglabel = new JLabel(bookingImg);
	        bookingImglabel.setIcon(bookingImg);
	        bookingImglabel.setBorder(border);
	        mainPanel.add(bookingImglabel);
	        
	        
	        bookingTextlabel = new JLabel("Booking Dashboard");
	        bookingTextlabel.setFont(new Font("Aril", Font.BOLD, 30));
	        bookingTextlabel.setBounds(580,50,400,200);
	        frame.add(bookingTextlabel);
	        
	        ImageIcon serviceImg = new ImageIcon("img/service.jpg");
	        serviceImglabel = new JLabel(serviceImg);
	        serviceImglabel.setIcon(serviceImg);
	        serviceImglabel.setBorder(border);

	        mainPanel.add(serviceImglabel);
	        
	        
	        seviceTextlabel = new JLabel("Service Dashboard");
	        seviceTextlabel.setFont(new Font("Aril", Font.BOLD, 30));
	        seviceTextlabel.setBounds(40,430,400,200);

	        frame.add(seviceTextlabel);
	        
	        
	        ImageIcon billImg = new ImageIcon("img/bill.jpg");
	        billImglabel = new JLabel(billImg);
	        billImglabel.setIcon(billImg);
	        billImglabel.setBorder(border);

	        mainPanel.add(billImglabel);
	        
	        billTextlabel = new JLabel("Bill Dashboard");
	        billTextlabel.setFont(new Font("Aril", Font.BOLD, 30));
	        billTextlabel.setBounds(580,430,400,200);
	        
	        frame.add(billTextlabel);
	        
	        

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
	        

	        
	        


	    
	       
	        //Add mouse listener to BookingDashboard
	        bookingImglabel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
                   frame.dispose();
                   new bookingDash_View();
                   
	            
	            }
	        });
	        
	        

	        // Add mouse listener to CustomerDashBoard
	        customerImglabel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	               frame.dispose();
	               new customerDash_View();
	            }
	        });
	        
	        
	        // Add mouse listener to CustomerDashBoard
	         serviceImglabel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	               frame.dispose();
	               new serviceDash_View();
	               JOptionPane.showMessageDialog(null, "This is currently under maintenance");

	            }
	        });
	         
	         
	         // Add mouse listener to billDashBoard
	         billImglabel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	               frame.dispose();
	               JOptionPane.showMessageDialog(null, "This is currently under maintenance");
	            

	              
	            }
	        });
	         
	         
	         
	         

	        
	        
	        // Add header panel to frame
	        frame.add(mainPanel);
	        frame.add(headerPanel);
	        frame.add(sideBarPanel);  
	        frame.setVisible(true);
	    }

	    public static void main(String args[]) {
	        new Staff_Veiw();
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == side_Button) {
				frame.dispose();
			}
		}
	    
	}

