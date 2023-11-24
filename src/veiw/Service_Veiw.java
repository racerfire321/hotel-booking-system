package veiw;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JPopupMenu;




import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Service_Veiw implements ActionListener {
	JFrame frame;
	JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
	JLabel logoLabel,phoneLabel,menuLabel,reservationLabel,side_Homelabel,side_Roomslabel,side_Aboutuslabel,side_Servicelabel,side_Booklabel;
	JButton side_Button,roomServiceButton,orderNowButton,orderNowBarButton;
	JLabel restaurantLabel,barLabel,roomServiceLabel,BarLabel,restaurantLabelRestaurant,labelRoomService;
	
	Service_Veiw() {
		// Create a new JFrame
				frame = new JFrame("Hotel Luton");
				frame.setSize(1200,875);
		        frame.setLayout(null);
		        frame.setResizable(false);
		        frame.setLocationRelativeTo(null);
		        restaurantLabel= new JLabel();
		        barLabel = new JLabel();
		        roomServiceLabel = new JLabel();
		        BarLabel = new JLabel();
		        restaurantLabelRestaurant = new JLabel();
		        labelRoomService= new JLabel();
				
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
		        mainPanel.setBounds(0, 90, 1000, 785);

		     // Create a grid layout with 3 rows and 2 columns
		     GridLayout gridLayout = new GridLayout(3, 1);
		        mainPanel.setLayout(gridLayout);
		        
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
        //mainpanel
		        
		        
        ImageIcon resImg = new ImageIcon("img/resturant.jpg");
        restaurantLabel = new JLabel();
        mainPanel.add(restaurantLabel);
        
        
        ImageIcon barImg = new ImageIcon("img/bar.jpg");
        barLabel = new JLabel();
        barLabel.setIcon(barImg);
        mainPanel.add(barLabel);

        ImageIcon roomImg = new ImageIcon("img/roomService.jpg");
        roomServiceLabel = new JLabel();
        roomServiceLabel.setIcon(roomImg);
        mainPanel.add(roomServiceLabel);
       
        restaurantLabel.setBackground(Color.WHITE);
        restaurantLabel.setIcon(resImg);
        
        
        BarLabel.setText("Bar");
        BarLabel.setFont(new Font("Aril", Font.BOLD, 60));
        BarLabel.setBounds(200,90,2000,50);
        BarLabel.setBackground(Color.black);
        BarLabel.setForeground(Color.orange);
       
       
        orderNowBarButton = new JButton("Order now");
        orderNowBarButton.setBounds(800,100,180,50);
        orderNowBarButton.setFocusable(false);
        orderNowBarButton.setFont(new Font("Pacifico", Font.BOLD, 22));
        orderNowBarButton.setBackground(Color.white);
        orderNowBarButton.setBorder(null);
        orderNowBarButton.setForeground(Color.black);
        orderNowBarButton.addActionListener(this);

        
        orderNowBarButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	orderNowBarButton.setBackground(new Color(197, 197, 170));
            	orderNowBarButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            	orderNowBarButton.setForeground(Color.black);
            }
            
	}
	);
        
        restaurantLabelRestaurant.setText("Restaurant");
        restaurantLabelRestaurant.setFont(new Font("Aril", Font.BOLD, 60));
        restaurantLabelRestaurant.setBounds(200,90,2000,50);
        restaurantLabelRestaurant.setBackground(Color.black);
        restaurantLabelRestaurant.setForeground(Color.yellow);
       
        orderNowButton = new JButton("Order now");
        orderNowButton.setBounds(800,100,180,50);
        orderNowButton.setFocusable(false);
        orderNowButton.setFont(new Font("Pacifico", Font.BOLD, 22));
        orderNowButton.setBackground(Color.white);
        orderNowButton.setBorder(null);
        orderNowButton.setForeground(Color.black);
        orderNowButton.addActionListener(this);

        orderNowButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	orderNowButton.setBackground(new Color(197, 197, 170));
            	orderNowButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            	orderNowButton.setForeground(Color.black);
            }
          
	}
	);
        
        labelRoomService = new JLabel();
        labelRoomService.setText("Room Service");
        labelRoomService.setFont(new Font("Aril", Font.BOLD, 55));
        labelRoomService.setBounds(100,90,500,50);
        labelRoomService.setForeground(Color.orange);
        
        roomServiceButton = new JButton("Book Now");
        roomServiceButton.setBounds(800,100,180,50);
        roomServiceButton.setFocusable(false);
        roomServiceButton.setFont(new Font("Pacifico", Font.BOLD, 22));
        roomServiceButton.setBackground(Color.white);
        roomServiceButton.setBorder(null);
        roomServiceButton.setForeground(Color.black);
        roomServiceButton.addActionListener(this);
        
        roomServiceButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
            	roomServiceButton.setBackground(new Color(197, 197, 170));
            	roomServiceButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
            	roomServiceButton.setForeground(Color.white);
            }
           
	}
	);
        
       
      
        
        roomServiceLabel.add(labelRoomService);
        restaurantLabel.add(restaurantLabelRestaurant);
        barLabel.add(orderNowBarButton);
        barLabel.add(BarLabel);
        roomServiceLabel.add(roomServiceButton);
        restaurantLabel.add(orderNowButton);
        
        mainPanel.add(restaurantLabel);
        mainPanel.add(barLabel);
        mainPanel.add(roomServiceLabel);
    
        
        
       
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
        new Service_Veiw();
    }
    @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== roomServiceButton) {
			 JOptionPane.showMessageDialog(null, "Dear,Customer This service is  currently unavailable ", null,
						JOptionPane.INFORMATION_MESSAGE);
		}
		else if (e.getSource()== orderNowBarButton) {
			frame.dispose();
			new Bar_View();
		}
		else if (e.getSource()== orderNowButton) {
			frame.dispose();
			new Resturant_View();
		}
		else if(e.getSource()== side_Button) {
			frame.dispose();
		}
		
	}
}