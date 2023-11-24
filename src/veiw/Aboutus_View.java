package veiw;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aboutus_View implements ActionListener {
	// Declaring Variable
	JFrame frame;
	JPanel headerPanel, sideBarPanel, mainPanel, subPanel;
	JLabel logoLabel, label, phoneLabel, menuLabel, reservationLabel, side_Homelabel, side_Roomslabel, side_Aboutuslabel, side_Servicelabel, side_Booklabel;
	JLabel label2, label3, label4, label5, label6;
	JButton side_Button;
	
	// Constructor
	Aboutus_View() {
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

        // Create a label for the header text of the main panel and set its properties
        JLabel headerLabel = new JLabel("About Luton Hotel");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        headerLabel.setForeground(Color.white);
        headerLabel.setBounds(300,20,300,100);

        // Add the header label to the main panel
        mainPanel.add(headerLabel);

        // Create labels for the main content and set their properties
        label = new JLabel("Luton Hotel is a luxury hotel located in the heart of Luton, UK. We offer the best accommodations, amenities and");
        label2 = new JLabel("services to make your stay with us unforgettable.Our hotel features 200 spacious and comfortable rooms,each");
        label3 = new JLabel("equipped with a range of modern amenities to ensure your comfort.Our hotel features a range of facilities to help");
        label4 = new JLabel("you relax and unwind during your stay.These include a spa, fitness center,and indoor swimming pool.Our ");
        label5 = new JLabel("restaurant serves delicious meals and our bar is the perfect place to unwind with a drink after a long day.At ");
        label6 = new JLabel("Luton Hotel,we are range committed to providing our guests with exceptional service and hospitality. ");
        label.setBounds(20,120,1000,50);
        label.setFont(new Font("Times new roman",Font.BOLD,20));
        label.setForeground(Color.white);
        label2.setBounds(20,190,1000,50);
        label2.setFont(new Font("Times new roman",Font.BOLD,20));
        label2.setForeground(Color.white);
        label3.setBounds(20,260,1000,50);
        label3.setFont(new Font("Times new roman",Font.BOLD,20));
        
                label3.setForeground(Color.white);
                label4.setBounds(20,330,1000,50);
                label4.setFont(new Font("Times new roman",Font.BOLD,20));
                label4.setForeground(Color.white);
                label5.setBounds(20,400,1000,50);
                label5.setFont(new Font("Times new roman",Font.BOLD,20));
                label5.setForeground(Color.white);
                label6.setBounds(20,470,1000,50);
                label6.setFont(new Font("Times new roman",Font.BOLD,20));
                label6.setForeground(Color.white);
                ImageIcon mainImg = new ImageIcon("img/spa.jpg"); 
                JLabel  imgLabel = new JLabel();
                imgLabel.setIcon(mainImg);
                imgLabel.setBounds(0,0,1000,700);
                
             // Create and add labels to the main panel
                mainPanel.add(label);
                mainPanel.add(label2);
                mainPanel.add(label3);
                mainPanel.add(label4);
                mainPanel.add(label5);
                mainPanel.add(label6);
                mainPanel.add(imgLabel);

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

                // Add header panel and sidebar panel to frame
                frame.getContentPane().add(mainPanel);
                frame.add(headerPanel);
                frame.add(sideBarPanel);  

                // Set frame to visible
                frame.setVisible(true);
	}
    public static void main(String args[]) {
        new Aboutus_View();
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==side_Button) {
	        System.exit(0);

		}
		
		
	}
}