package veiw;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class Homepage_Veiw implements ActionListener {
  
	JFrame frame;
	JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
	JLabel logoLabel,phoneLabel,menuLabel,reservationLabel,side_Homelabel,side_Roomslabel,side_Aboutuslabel,side_Servicelabel,side_Booklabel;
	JButton side_Button,bookBtn,exploreRoom;
	JLabel frontImglabel, backImglabel,titleImglabel,headingLabel,bodyLabel1,bodyLabel2,bodyLabel3;
	
	Homepage_Veiw(){
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
		        mainPanel.setBackground(Color.white);
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
       
        //main panel
        
        ImageIcon frontImg = new ImageIcon("img/frontimg1.jpg");
        frontImglabel = new JLabel(frontImg);
        frontImglabel.setIcon(frontImg);
         frontImglabel.setBounds(400,50,550,300);
          mainPanel.add(frontImglabel);
          
          ImageIcon titleImg = new ImageIcon("img/title.jpg");
          titleImglabel = new JLabel(titleImg);
          titleImglabel.setIcon(titleImg);   
          titleImglabel.setBounds(00,50,550,300);
            mainPanel.add(titleImglabel);
    
          
          
          ImageIcon backImg = new ImageIcon("img/backimg.jpg");
          backImglabel = new JLabel(backImg);
          backImglabel.setIcon(backImg);
          backImglabel.setBounds(100,400,400,250);
            mainPanel.add( backImglabel);
            
            
            headingLabel = new JLabel("Loyalty is Royalty-Stay connected");
            headingLabel.setBounds(550,190,500,480);
            headingLabel.setFont(new Font("Pacifico", Font.BOLD, 25));

            mainPanel.add(headingLabel);
            
            
            bodyLabel1 = new JLabel("The Luton Hotel's 'Corporative Package' offers ");
            bodyLabel1.setBounds(550,240,500,480);
            bodyLabel1.setFont(new Font("Pacifico", Font.PLAIN, 20));
            
            
            bodyLabel2 = new JLabel("a discounted annual subscription and enables");
            bodyLabel2.setBounds(550,270,500,480);
            bodyLabel2.setFont(new Font("Pacifico", Font.PLAIN, 20));
            
            
            bodyLabel3 = new JLabel(" you to book a room at any point during the year.");
            bodyLabel3.setBounds(550,300,500,480);
            bodyLabel3.setFont(new Font("Pacifico", Font.PLAIN, 20));
            		
            		
            		
            		mainPanel.add(bodyLabel1);
            		mainPanel.add(bodyLabel2);
            		mainPanel.add(bodyLabel3);
            		
            		
           exploreRoom = new JButton("Explore Room");
           exploreRoom.setBackground(Color.BLACK);
           exploreRoom.setForeground(Color.WHITE);
           exploreRoom.setBounds(180,250,120,60);
           exploreRoom.addActionListener(this);
            mainPanel.add(exploreRoom);
            
            bookBtn = new JButton("Book Now");
            bookBtn.setBackground(Color.BLACK);
            bookBtn.setForeground(Color.WHITE);
            bookBtn.setBounds(680,580,120,60);
            bookBtn.addActionListener(this);
             mainPanel.add(bookBtn);
        
       
             
             
             
             
             
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
public static void main (String args[]) {
	 
	new Homepage_Veiw();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==side_Button) {
		frame.dispose();
	}
	
	else if(e.getSource()== exploreRoom) {
		System.out.println(LoginTest.email);
		frame.dispose();
		new Room_Veiw();
	}
	else if (e.getSource()==bookBtn) {
		new Booking_View();
		frame.dispose();
	}
}
	
}
