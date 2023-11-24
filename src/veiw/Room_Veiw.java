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
import javax.swing.JTextField;

public class Room_Veiw implements ActionListener {
	JFrame frame;
	JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
	JLabel logoLabel,phoneLabel,menuLabel,reservationLabel,side_Homelabel,side_Roomslabel,side_Aboutuslabel,side_Servicelabel,side_Booklabel;
	JLabel roomImglabel,roomImg1label,roomImg2label,roomImg3label,roomImg4label,roomImg5label,roomImg6label;
	JTextField roomSearch;
	JPanel roomPanel1,roomPanel2,roomPanel3,roomPanel4,roomPanel5,roomPanel6;
	JLabel panelLabel,room1Label,room2Label,room3Label,room4Label,room5Label,room6Label;
	JButton searchBtn,room1Btn,room2Btn,room3Btn,room4Btn,room5Btn,room6Btn,nextBtn;
	JButton side_Button;
	
	Room_Veiw() {
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
       //mainPanel
        
        panelLabel = new JLabel("Room Catalogue");
        panelLabel.setBounds(400,0,400,100);
        panelLabel.setFont(new Font("Times new roman",Font.BOLD,40));
        
        
        
        
         
         
         
         roomPanel1 = new JPanel();
         roomPanel1.setBackground(new Color(196,189,189));
         roomPanel1.setBounds(30,100,290,250);

         roomPanel2 = new JPanel();
         roomPanel2.setBackground(new Color(196,189,189));
         roomPanel2.setBounds(355,100,290,250);
         
         roomPanel3 = new JPanel();
         roomPanel3.setBackground(new Color(196,189,189));
         roomPanel3.setBounds(680,100,290,250);
         
         
         
         roomPanel4 = new JPanel();
         roomPanel4.setBackground(new Color(196,189,189));
         roomPanel4.setBounds(30,390,290,250);

         roomPanel5 = new JPanel();
         roomPanel5.setBackground(new Color(196,189,189));
         roomPanel5.setBounds(355,390,290,250);
         
         roomPanel6 = new JPanel();
         roomPanel6.setBackground(new Color(196,189,189));
         roomPanel6.setBounds(680,390,290,250);
         
        
         
         
         
         
         
         ImageIcon roomImg1 = new ImageIcon("img/images.jpg");
        
         roomImg1label = new JLabel(roomImg1);
         roomImg1label.setIcon(roomImg1);
         roomImg1label.setBounds(90,0,200,100);
         roomPanel1.add(roomImg1label);
         
         room1Label = new JLabel("Master Bedroom            230$");
         room1Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
         room1Label.setBounds(90,1990,200,100);
         roomPanel1.add(room1Label);
         
         
         room1Btn= new JButton("Book Room");
         room1Btn.setBackground(Color.BLACK);
         room1Btn.setForeground(Color.WHITE);
         room1Btn.setBounds(60,10,170,90);
          roomPanel1.add(room1Btn);
         
          
          ImageIcon roomImg2 = new ImageIcon("img/img.jpg");
          roomImg2label = new JLabel(roomImg2);
          roomImg2label.setIcon(roomImg2);
          roomImg2label.setBounds(90,40,200,200);
          roomPanel2.add(roomImg2label);
          
          
          room2Label = new JLabel("Seaveiw Bedroom           300$");
          room2Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
          room2Label.setBounds(90,1990,200,100);
          roomPanel2.add(room2Label);
          
          
          room2Btn= new JButton("Book Room");
          room2Btn.setBackground(Color.BLACK);
          room2Btn.setForeground(Color.WHITE);
          room2Btn.setBounds(60,10,170,90);
           roomPanel2.add(room2Btn);
           
           
           
  
           
           ImageIcon roomImg3 = new ImageIcon("img/images.jpg");
           roomImg3label = new JLabel(roomImg3);
           roomImg3label.setIcon(roomImg3);
           roomImg3label.setBounds(90,0,200,100);
           roomPanel3.add(roomImg3label);
           
           
           room3Label = new JLabel("Royal Bedroom           290$");
           room3Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
           room3Label.setBounds(90,90,200,100);
           roomPanel3.add(room3Label);
           
           
           room3Btn= new JButton("Book Room");
           room3Btn.setBackground(Color.BLACK);
           room3Btn.setForeground(Color.WHITE);
           room3Btn.setBounds(60,10,170,90);
            roomPanel3.add(room3Btn);
           
            
            roomImg4label = new JLabel(roomImg1);
            roomImg4label.setIcon(roomImg1);
            roomImg4label.setBounds(90,0,200,100);
            roomPanel4.add(roomImg4label);
            
            room4Label = new JLabel("Double Bedroom            230$");
            room4Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
            room4Label.setBounds(10,90,200,100);
            roomPanel4.add(room4Label);
            
            
            room4Btn= new JButton("Book Room");
            room4Btn.setBackground(Color.BLACK);
            room4Btn.setForeground(Color.WHITE);
            room4Btn.setBounds(60,10,170,90);
             roomPanel4.add(room4Btn);
            
             
             roomImg5label = new JLabel(roomImg2);
             roomImg5label.setIcon(roomImg2);
             roomImg5label.setBounds(90,0,200,200);
             roomPanel5.add(roomImg5label);
             
             
             room5Label = new JLabel("Single Bedroom           300$");
             room5Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
             room5Label.setBounds(90,90,200,90);
             roomPanel5.add(room5Label);
             
             
             room5Btn= new JButton("Book Room");
             room5Btn.setBackground(Color.BLACK);
             room5Btn.setForeground(Color.WHITE);
             room5Btn.setBounds(60,10,170,90);
             room5Btn.addActionListener(this);
              roomPanel5.add(room5Btn);
              
              
              
     
              
              roomImg6label = new JLabel(roomImg3);
              roomImg6label.setIcon(roomImg3);
              roomImg6label.setBounds(90,0,200,100);
              roomPanel6.add(roomImg6label);
              
              
              room6Label = new JLabel("Premium Bedroom           290$");
              room6Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
              room6Label.setBounds(90,1990,200,100);
              roomPanel6.add(room6Label);
              
              
              room6Btn= new JButton("Book Room");
              room6Btn.setBackground(Color.BLACK);
              room6Btn.setForeground(Color.WHITE);
              room6Btn.setBounds(60,10,170,90);
              room6Btn.addActionListener(this);
               roomPanel6.add(room6Btn);
              
               
           
        
        
         mainPanel.add(panelLabel);
         mainPanel.add(roomPanel1);
         mainPanel.add(roomPanel2);
         mainPanel.add(roomPanel3);
         mainPanel.add(roomPanel4);
         mainPanel.add(roomPanel5);
         mainPanel.add(roomPanel6);
       
       
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
         room1Btn.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Add code to execute when the booknow button  is clicked
                 frame.dispose();
                 new Booking_View();
             }
         });
         
         
         
         room2Btn.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Add code to execute when the booknow button  is clicked
                 frame.dispose();
                 new Booking_View();
             }
         });
         
         room3Btn.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Add code to execute when the booknow button  is clicked
                 frame.dispose();
                 new Booking_View();
             }
         });
         
         room4Btn.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Add code to execute when the booknow button  is clicked
                 frame.dispose();
                 new Booking_View();
             }
         });
         
         
         room5Btn.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Add code to execute when the booknow button  is clicked
                 frame.dispose();
                 new Booking_View();
             }
         });
         
         
         
         
         
         
         room6Btn.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Add code to execute when the booknow button  is clicked
                 frame.dispose();
                 new Booking_View();
             }
         });
         
         
        
         
         
         
         
         
         
         

        
        // Add header panel to frame
        frame.add(mainPanel);
        frame.add(headerPanel);
        frame.add(sideBarPanel);  
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new Room_Veiw();
    }
    @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==side_Button) {
			frame.dispose();
		}
		
		
		
	}
}