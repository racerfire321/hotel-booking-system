package veiw;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

import controller.ManageLogin;
import model.Register_Model;
import model.UserLogin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Login_Veiw implements ActionListener{

	JFrame frame;
	JPanel headerPanel,sideBarPanel,mainPanel,subPanel;
	JLabel logoLabel,phoneLabel,menuLabel,reservationLabel,side_Homelabel,side_Roomslabel,side_Aboutuslabel,side_Servicelabel,side_Booklabel;
	JButton side_Button;
	private JLabel EmailLabel, passwordLabel,headerLabel,bodyLabel,loginImglabel,staffimgLabel,staffLabel;
    public JTextField Email;
    public JPasswordField password;
    private JButton loginButton,registerButton;
	Login_Veiw() {
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
        headerLabel = new JLabel("WELCOME TO HOTEL LUTON");
        headerLabel.setBounds(20,25,380,35);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 25));
        headerLabel.setBackground(Color.pink);
       
        
        bodyLabel = new JLabel("*Please login  or register to enjoy our sevices");
        bodyLabel.setBounds(40,75,300,35);
        
        
        
     // Create the components and add them to the JFrame
        
              
        Email = new JTextField();
        Email.setBounds(120,145, 180, 35);
        
        
        EmailLabel = new JLabel("Email:");
        EmailLabel.setBounds(20, 145, 180, 35);
        
        password = new JPasswordField();
        password.setBounds(120, 215, 180, 35);
       

        
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 215, 180, 35);
       

        
        loginButton = new JButton("Login");
        loginButton.setBounds(60, 285, 100, 35);
        loginButton.setBackground(Color.black);
        loginButton.setForeground(Color.white);
        loginButton.addActionListener(this);
        
        
        registerButton = new JButton("REGISTER");
        registerButton.setBackground(Color.black);
        registerButton.setForeground(Color.white);
        registerButton.setBounds(240, 285, 100, 35);
        registerButton.addActionListener(this);
        
        
        
        
        subPanel.add(registerButton);
        subPanel.add(loginButton);
        subPanel.add(passwordLabel);
        subPanel.add(password);
        subPanel.add(Email);
        subPanel.add(EmailLabel);
        subPanel.add(headerLabel);
        subPanel.add(bodyLabel);
        
        

        
        // Set the background image of the JFrame
        
        staffimgLabel = new JLabel("Click Here to Login as Staff");
        ImageIcon staff = new ImageIcon("img/staff.png");        
        staffimgLabel.setIcon(staff);
        staffimgLabel.setBounds(30,170,400,400);
        mainPanel.add(staffimgLabel);
        
        staffLabel = new JLabel("Click Here to Login as Staff");
        staffLabel.setBounds(90,450,300,200);
        staffLabel.setForeground(Color.white);
        staffLabel.setFont(new Font("Times new roman",Font.BOLD,20));
        mainPanel.add(staffLabel);
        
        ImageIcon loginImg = new ImageIcon("img/loginimg.jpg");
        loginImglabel = new JLabel(loginImg);
        loginImglabel.setIcon(loginImg);
        loginImglabel.setBounds(0,10,1000,750);
        
        
        
        
        mainPanel.add(subPanel);
        mainPanel.add(staffimgLabel);
        mainPanel.add(loginImglabel);
        

    
     // Add mouse listener to reservation label
     		reservationLabel.addMouseListener(new MouseAdapter() {
     			@Override
     			public void mouseClicked(MouseEvent e) {
     				// Add code to execute when the reservation button is clicked
     				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login to have your reservation ", null,
     						JOptionPane.INFORMATION_MESSAGE);
     			}
     		});

     		side_Homelabel.addMouseListener(new MouseAdapter() {
                 @Override
                 public void mouseClicked(MouseEvent e) {
     				// Add code to execute when the reservation button is clicked
     				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login to have your Dashboard ", null,
     						JOptionPane.INFORMATION_MESSAGE);
     			}
             });
             
             
             side_Roomslabel.addMouseListener(new MouseAdapter() {
                 @Override
                 public void mouseClicked(MouseEvent e) {
     				// Add code to execute when the reservation button is clicked
     				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login  ", null,
     						JOptionPane.INFORMATION_MESSAGE);
     			}
             });
             
             side_Aboutuslabel.addMouseListener(new MouseAdapter() {
                 @Override
                 public void mouseClicked(MouseEvent e) {
                     // Add code to execute when the reservation button is clicked
                	 JOptionPane.showMessageDialog(null, "Dear,Customer Please Login to enjoy our sevices ", null,
     						JOptionPane.INFORMATION_MESSAGE);
                 }
             });
             
             
             side_Servicelabel.addMouseListener(new MouseAdapter() {
                 @Override
                 public void mouseClicked(MouseEvent e) {
     				// Add code to execute when the reservation button is clicked
     				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login to enjoy our services ", null,
     						JOptionPane.INFORMATION_MESSAGE);
     			}
             });
             
             side_Booklabel.addMouseListener(new MouseAdapter() {
                 @Override
                 public void mouseClicked(MouseEvent e) {
     				// Add code to execute when the reservation button is clicked
     				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login to Book room ", null,
     						JOptionPane.INFORMATION_MESSAGE);
     			}
             });
             
             staffimgLabel.addMouseListener(new MouseAdapter() {
                 @Override
                 public void mouseClicked(MouseEvent e) {
     				// Add code to execute when the reservation button is clicked
     				new stafflogin_View();
     			}
             });


     		JPopupMenu popupMenu = new JPopupMenu();
     		JMenuItem login = new JMenuItem("Login");
     		JMenuItem register = new JMenuItem("Register");
     		JMenuItem signOut = new JMenuItem("Sign out");
     		popupMenu.add(login);
     		popupMenu.add(register);
     		popupMenu.add(signOut);

     		menuLabel.addMouseListener(new MouseAdapter() {
     			@Override
     			public void mouseClicked(MouseEvent e) {
     				// Show the popup menu at the mouse click location
     				popupMenu.show(e.getComponent(), 30, 30);
     			}
     		});

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
  
     		loginButton.addActionListener(new ActionListener() {
     			public void actionPerformed(ActionEvent e) {
     				
     				    String email = Email.getText();
     				    String Password = password.getText();
     				    if (email.isEmpty() || Password.isEmpty()) {
     				        JOptionPane.showMessageDialog(frame, "Please enter an email and password.");
     				    } else {
     				        try {
     				            UserLogin user = new UserLogin();
     				            ManageLogin userManager = new ManageLogin();
     				            user.setEmail(email);
     				            user.setPassword(Password);
     				            userManager.setUser(user);
     				            userManager.login();
     				            user = userManager.getUser();
     				            if (user.getCustomerID() >= 1) {
     				                LoginTest.userId = user.getCustomerID();
     				                LoginTest.email = user.getEmail();
     				                // display main window
     				               frame.dispose();
     				                new Homepage_Veiw();
     				               JOptionPane.showMessageDialog(frame, "Welcome!,Login Successful enjoy our services ");
     				                frame.dispose();
     				            } else {
     				                JOptionPane.showMessageDialog(frame, "Please enter correct email or password");
     				            }
     				        } catch (Exception ex) {
     				            JOptionPane.showMessageDialog(frame, ex.getMessage());
     				        }
     				    }
     				}


     			
     		});
  
        	
        
        
        // Add header panel to frame
        frame.add(mainPanel);
        frame.add(headerPanel);
        frame.add(sideBarPanel);  
        frame.setVisible(true);
        	
        
        
        
        
        
    }

    public static void main(String args[]) {
       new Login_Veiw();
    }
    @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==side_Button) {
			frame.dispose();
		}
		
		else if(e.getSource()==registerButton) {
			frame.dispose();
			new Register_View();
		}
		
	}

	
	
}