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


	public class serviceDash_View implements ActionListener {
		JFrame frame;
		JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
		JLabel logoLabel,phoneLabel,menuLabel,reservationLabel;
		
		JTextField serviceidField,servicenameField,noofserviceField,priceField,serviceCatField,custidField; 
		
		JLabel serviceidLabel,servicenameLabel,noofserviceLabel,priceLabel,serviceCatLabel,custidLabel;
		JButton updateBtn,deleteBtn,checkBtn,backBtn;
		serviceDash_View() {
			frame = new JFrame();
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
	        mainPanel.setBackground(Color.white);
	        mainPanel.setLayout(null);
	        
	        subPanel.setBounds(450,150,400,400);
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
	       
	       
	        
	       serviceidLabel = new JLabel("ServiceId");
	       serviceidLabel.setBounds(20,30,100,40);
	       serviceidLabel.setForeground(Color.white);
	       serviceidLabel.setFont(new Font("Times new roman",Font.BOLD,20));
	       sideBarPanel.add(serviceidLabel);
	       
	       
	       
	       serviceidField = new JTextField();
	       serviceidField.setBounds(175,30,100,30);
	       serviceidField.setBackground(Color.white);
	       sideBarPanel.add(serviceidField);
	       
	       
	       
	       
	       
	       
	       servicenameLabel = new JLabel("Name");
	       servicenameLabel.setBounds(20,100,200,40);
	       servicenameLabel.setForeground(Color.white);
	       servicenameLabel.setFont(new Font("Times new roman",Font.BOLD,20));
	       sideBarPanel.add(servicenameLabel);
	       
	       
	       servicenameField = new JTextField();
	       servicenameField.setBounds(175,100,100,30);
	       servicenameField.setBackground(Color.white);
	       sideBarPanel.add(servicenameField);
	       
	       
	       
	       
	      noofserviceLabel = new JLabel("Total number");
	      noofserviceLabel.setBounds(20,170,200,40);
	      noofserviceLabel.setForeground(Color.white);
	      noofserviceLabel.setFont(new Font("Times new roman",Font.BOLD,20));

	       sideBarPanel.add(noofserviceLabel);
	       
	       
	       noofserviceField = new JTextField();
	       noofserviceField.setBounds(175,170,100,30);
	       noofserviceField.setBackground(Color.white);
	       sideBarPanel.add(noofserviceField);
	       
	       
	       
	       
	       priceLabel = new JLabel("Total Price");
	       priceLabel.setBounds(20,230,200,40);
	       priceLabel.setForeground(Color.white);
	       priceLabel.setFont(new Font("Times new roman",Font.BOLD,20));

	       sideBarPanel.add(priceLabel);
	       
	       
	       priceField = new JTextField();
	       priceField.setBounds(175,230,100,30);
	       priceField.setBackground(Color.white);
	       sideBarPanel.add(priceField);
	       
	       
	       
	       serviceCatLabel = new JLabel("Category");
	       serviceCatLabel.setBounds(20,300,200,40);
	       serviceCatLabel.setForeground(Color.white);
	       serviceCatLabel.setFont(new Font("Times new roman",Font.BOLD,20));

	       sideBarPanel.add(serviceCatLabel);
	       
	       
	       serviceCatField = new JTextField();
	       serviceCatField.setBounds(175,300,100,30);
	       serviceCatField.setBackground(Color.white);
	       sideBarPanel.add(serviceCatField);
	       
	       
	       
	       
	       custidLabel = new JLabel("CustomerId");
	       custidLabel.setBounds(20,370,200,40);
	       custidLabel.setForeground(Color.white);
	       custidLabel.setFont(new Font("Times new roman",Font.BOLD,20));
	       sideBarPanel.add(custidLabel);
	       
	       custidField = new JTextField();
	       custidField.setBounds(175,370,100,30);
	       custidField.setBackground(Color.white);
	       sideBarPanel.add(custidField);
	       
	       
	       
	       updateBtn = new JButton("Update");
	       updateBtn.setBounds(20,450,80,30);
	       sideBarPanel.add(updateBtn);
	       
	       deleteBtn = new JButton("Delete");
	       deleteBtn.setBounds(110,450,80,30);
	       sideBarPanel.add(deleteBtn);
	       
	       checkBtn = new JButton("Check");
	       checkBtn.setBounds(200,450,80,30);
	       sideBarPanel.add(checkBtn);
	       
	       
	       backBtn = new JButton("<-Back to Dashboard");
	       backBtn.addActionListener(this);
	       backBtn.setBounds(20,620,250,40);
	       sideBarPanel.add(backBtn);

	       
	       
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
	        new serviceDash_View();
	    }
	    @Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== backBtn) {
				frame.dispose();
				new Staff_Veiw();
			}
			
			
		}
	}




