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

	public class Resturant_View implements ActionListener {
		JFrame frame;
		JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
		JLabel logoLabel,phoneLabel,menuLabel,reservationLabel,side_Homelabel,side_Roomslabel,side_Aboutuslabel,side_Servicelabel,side_Booklabel;
		JLabel restroImglabel,restroImg1label,restroImg2label,restroImg3label;
		JTextField restroSearch;
		JPanel restroPanel1,restroPanel2,restroPanel3;
		JLabel panelLabel,restro1Label,restro2Label,restro3Label;
		JButton searchBtn,restro1Btn,restro2Btn,restro3Btn,nextBtn;
		JButton side_Button;
		
		Resturant_View() {
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
	        ImageIcon restroImg = new ImageIcon("img/resturant.jpg");
	        restroImglabel = new JLabel(restroImg);
	        restroImglabel.setIcon(restroImg);
	        restroImglabel.setBounds(10,0,1000,200);
	        mainPanel.add(restroImglabel);
	        
	        restroSearch = new JTextField();
	        restroSearch.setBounds(240,150,500,40);
	        restroSearch.setBackground(Color.BLACK);
	        restroSearch.setForeground(Color.WHITE);
	        restroImglabel.add(restroSearch);
	        
	        
	        searchBtn = new JButton("Search");
	        searchBtn.setBackground(Color.BLACK);
	        searchBtn.setForeground(Color.WHITE);
	        searchBtn.setBounds(780,150,120,40);
	        restroImglabel.add(searchBtn);
	        
	        
	        panelLabel = new JLabel("Top Dishes");
	        panelLabel.setBounds(60,220,300,50);
	        panelLabel.setFont(new Font("Pacifico", Font.BOLD, 30));
			
	        mainPanel.add(panelLabel);
	        
	        
	        nextBtn= new JButton("Menu");
	        nextBtn.setBackground(Color.BLACK);
	        nextBtn.setForeground(Color.WHITE);
	        nextBtn.setBounds(850,220,120,50);
	         mainPanel.add(nextBtn);
	        
	        
	         
	         
	         
	         restroPanel1 = new JPanel();
	         restroPanel1.setBackground(new Color(196,189,189));
	         restroPanel1.setBounds(70,290,290,370);

	         restroPanel2 = new JPanel();
	         restroPanel2.setBackground(new Color(196,189,189));
	         restroPanel2.setBounds(370,290,290,370);
	         
	         restroPanel3 = new JPanel();
	         restroPanel3.setBackground(new Color(196,189,189));
	         restroPanel3.setBounds(670,290,290,370);
	         
	        
	         
	         
	         
	         
	         
	         ImageIcon restroImg1 = new ImageIcon("img/food1.png");
	        
	         restroImg1label = new JLabel(restroImg1);
	         restroImg1label.setIcon(restroImg1);
	         restroImg1label.setBounds(90,0,200,100);
	         restroPanel1.add(restroImg1label);
	         
	         restro1Label = new JLabel("Kimchi Fried Rice            60$");
	         restro1Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
	         restro1Label.setBounds(10,1990,200,100);
	         restroPanel1.add(restro1Label);
	         
	         
	         restro1Btn= new JButton("Order Now");
	         restro1Btn.setBackground(Color.BLACK);
	         restro1Btn.setForeground(Color.WHITE);
	         restro1Btn.setBounds(60,10,170,90);
	         restro1Btn.addActionListener(this);
	          restroPanel1.add(restro1Btn);
	         
	          
	          ImageIcon restroImg2 = new ImageIcon("img/food4.jpg");
	          restroImg2label = new JLabel(restroImg2);
	          restroImg2label.setIcon(restroImg2);
	          restroImg2label.setBounds(90,0,200,200);
	          restroPanel2.add(restroImg2label);
	          
	          
	          restro2Label = new JLabel("Cheese Stick                30$");
	          restro2Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
	          restro2Label.setBounds(90,1990,200,100);
	          restroPanel2.add(restro2Label);
	          
	          
	          restro2Btn= new JButton("Order Now");
	          restro2Btn.setBackground(Color.BLACK);
	          restro2Btn.setForeground(Color.WHITE);
	          restro2Btn.setBounds(60,1980,170,90);
	          restro2Btn.addActionListener(this);
	           restroPanel2.add(restro2Btn);
	           
	           
	           
	  
	           
	           ImageIcon restroImg3 = new ImageIcon("img/food3.png");
	           restroImg3label = new JLabel(restroImg3);
	           restroImg3label.setIcon(restroImg3);
	           restroImg3label.setBounds(90,0,200,100);
	           restroPanel3.add(restroImg3label);
	           
	           
	           restro3Label = new JLabel("Spicy Wings              80$");
	           restro3Label.setFont(new Font("Pacifico", Font.PLAIN, 20));
	           restro3Label.setBounds(90,1990,200,100);
	           restroPanel3.add(restro3Label);
	           
	           
	           restro3Btn= new JButton("Order Now");
	           restro3Btn.setBackground(Color.BLACK);
	           restro3Btn.setForeground(Color.WHITE);
	           restro3Btn.setBounds(60,1980,170,90);
		         restro3Btn.addActionListener(this);

	            restroPanel3.add(restro3Btn);
	           
	            
	        
	        

	         mainPanel.add(restroPanel1);
	         mainPanel.add(restroPanel2);
	         mainPanel.add(restroPanel3);
	       
	         
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
	        new Resturant_View();
	    }
	    @Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==side_Button) {
				frame.dispose();
			}
			if (e.getSource()== restro1Btn) {
				new order_View();
			}
			if (e.getSource()== restro2Btn) {
				new order_View();
			}
			if (e.getSource()== restro3Btn) {
				new order_View();
			}
			
		}
	}

