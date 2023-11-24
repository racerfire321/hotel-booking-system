package veiw;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Register_Controller;
import model.Register_Model;

public  class Register_View implements ActionListener {
	JFrame frame;
	JPanel headerPanel, sideBarPanel, mainPanel, subPanel;
	JLabel logoLabel, phoneLabel, menuLabel, reservationLabel, side_Homelabel, side_Roomslabel, side_Aboutuslabel,
			side_Servicelabel, side_Booklabel;
	JButton side_Button;
	JPanel topPanel;
	JLabel register, firstName, middleName, lastName, gender, phonenumLabel, DOB, Email, address, postalcode, country,
			PasswordLabel, type, companyCodelabel, creditCardlabel;
	JPasswordField pwUser;
	JTextField fname, mname, lname, phoneField, Emull, useraddress, userPost, userCountry, companyCode,
			creditCard;
	JDateChooser Date;
	JButton backTo, registerBtn;
	JComboBox  customerType;

	Register_View() {
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
		// main panel

		// Create the components and add them to the JFrame

		

		topPanel = new JPanel();
		topPanel.setLayout(null);
		register = new JLabel("REGISTER");
		register.setBounds(370, 0, 450, 80);

		register.setForeground(new Color(205, 189, 234));
		register.setFont(new Font("times new roman", Font.BOLD, 50));

		topPanel.setBounds(0, 0, 1200, 60);
		topPanel.setBackground(Color.black);
		mainPanel.add(register);
		topPanel.add(register);
		mainPanel.add(topPanel);

		firstName = new JLabel("First Name :");
		firstName.setBounds(120, 100, 200, 30);
		firstName.setForeground(Color.black);
		firstName.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(firstName);

		fname = new JTextField();
		fname.setBounds(120, 150, 230, 30);
		mainPanel.add(fname);

		middleName = new JLabel("Middle Name :");
		middleName.setBounds(420, 100, 200, 30);
		middleName.setForeground(Color.black);
		middleName.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(middleName);

		mname = new JTextField();
		mname.setBounds(420, 150, 230, 30);
		mainPanel.add(mname);

		lastName = new JLabel("Last Name :");
		lastName.setBounds(700, 100, 200, 30);
		lastName.setForeground(Color.black);
		lastName.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(lastName);

		lname = new JTextField();
		lname.setBounds(700, 150, 230, 30);
		mainPanel.add(lname);

		ButtonGroup cbGroup = new ButtonGroup();

		gender = new JLabel("Gender :");
		gender.setBounds(120, 200, 100, 30);
		gender.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(gender);

		// creating checkbox male with
		// status as true for cbgroup
		JRadioButton male = new JRadioButton("Male");
		cbGroup.add(male);
		male.setBounds(140, 230, 100, 40);
		male.setBackground(Color.white);
		// creating checkbox female with
		// status as false for cbgroup
		JRadioButton female = new JRadioButton("Female");
		cbGroup.add(female);
		// setting location of checkbox in frame
		female.setBounds(240, 230, 70, 40);
		female.setBackground(Color.white);
		// creating checkbox for prefernotto say
		JRadioButton preferNot = new JRadioButton("prefer not to say");
		cbGroup.add(preferNot);
		preferNot.setBounds(340, 230, 130, 40);
		preferNot.setBackground(Color.white);

		// creating checkbox for others
		JRadioButton others = new JRadioButton("others");
		cbGroup.add(others);
		others.setBounds(470, 230, 70, 40);
		others.setBackground(Color.white);

		// adding checkboxes to frame
		mainPanel.add(male);
		mainPanel.add(female);
		mainPanel.add(others);
		mainPanel.add(preferNot);

		phonenumLabel = new JLabel("Phone Number:");
		phonenumLabel.setBounds(700, 200, 170, 30);
		phonenumLabel.setForeground(Color.black);
		phonenumLabel.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(phonenumLabel);

		phoneField = new JTextField();
		phoneField.setBounds(700, 250, 220, 30);
		phoneField.setForeground(Color.black);
		phoneField.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(phoneField);

		DOB = new JLabel("DOB :");
		DOB.setBounds(120, 300, 100, 30);
		DOB.setForeground(Color.black);
		DOB.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(DOB);

		Date = new JDateChooser();
		Date.setBounds(120, 350, 200, 30);
		mainPanel.add(Date);

		type = new JLabel("Type");
		type.setBounds(420, 300, 100, 30);
		type.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(type);

		String cusType[] = { "Corporate", "Non-Corporate"};
		customerType = new JComboBox<>(cusType);
		customerType.setBounds(420, 350, 230, 30);
		customerType.setSelectedIndex(0);
		customerType.addActionListener(this);
		mainPanel.add(customerType);

		Email = new JLabel("Email :");
		Email.setBounds(700, 300, 100, 30);
		Email.setForeground(Color.black);
		Email.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(Email);

		Emull = new JTextField();
		Emull.setBounds(700, 350, 200, 30);
		mainPanel.add(Emull);

		address = new JLabel("Address  :");
		address.setBounds(120, 400, 150, 30);
		address.setForeground(Color.black);
		address.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(address);

		useraddress = new JTextField();
		useraddress.setBounds(120, 450, 230, 30);
		mainPanel.add(useraddress);

		postalcode = new JLabel("Postal Code  :");
		postalcode.setBounds(450, 400, 150, 30);
		postalcode.setForeground(Color.black);
		postalcode.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(postalcode);

		userPost = new JTextField();
		userPost.setBounds(450, 450, 180, 30);
		mainPanel.add(userPost);
		
		country = new JLabel("Country   :");
		country.setBounds(700, 400, 150, 30);
		country.setForeground(Color.black);
		country.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(country);

		userCountry = new JTextField();
		userCountry.setBounds(700, 450, 230, 30);
		mainPanel.add(userCountry);

		PasswordLabel = new JLabel("Password  :");
		PasswordLabel.setBounds(120, 500, 150, 30);
		PasswordLabel.setForeground(Color.black);
		PasswordLabel.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.setBackground(Color.white);
		mainPanel.add(PasswordLabel);

		pwUser = new JPasswordField();
		pwUser.setBounds(120, 550, 230, 30);
		mainPanel.add(pwUser);

		creditCardlabel = new JLabel("Credit Card:");
		creditCardlabel.setBounds(420, 500, 150, 30);
		creditCardlabel.setForeground(Color.black);
		creditCardlabel.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(creditCardlabel);

		creditCard = new JTextField();
		creditCard.setBounds(420, 550, 230, 30);
		creditCard.setForeground(Color.black);
		mainPanel.add(creditCard);

		companyCodelabel = new JLabel("Company Code:");
		companyCodelabel.setBounds(750, 500, 150, 30);
		companyCodelabel.setForeground(Color.black);
		companyCodelabel.setFont(new Font("Arial", Font.BOLD, 18));
		mainPanel.add(companyCodelabel);

		companyCode = new JTextField();
		companyCode.setBounds(750, 550, 180, 30);
		companyCode.setForeground(Color.black);
		mainPanel.add(companyCode);

		backTo = new JButton("Back to login");
		backTo.setBounds(120, 630, 150, 30);
		backTo.setForeground(Color.white);
		backTo.setBackground(Color.black);
		backTo.addActionListener(this);
		mainPanel.add(backTo);

		registerBtn = new JButton("register");
		registerBtn.setBounds(800, 630, 100, 30);
		registerBtn.setForeground(Color.white);
		registerBtn.setBackground(Color.black);
		registerBtn.addActionListener(this);
		mainPanel.add(registerBtn);

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
				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login to have your Dashboard", null,
						JOptionPane.INFORMATION_MESSAGE);
			}
        });
        
        
        side_Roomslabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
				// Add code to execute when the reservation button is clicked
				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login first  ", null,
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
				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login to enjoy our sevices ", null,
						JOptionPane.INFORMATION_MESSAGE);
			}
        });
        
        side_Booklabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
				// Add code to execute when the reservation button is clicked
				JOptionPane.showMessageDialog(null, "Dear,Customer Please Login to  book room", null,
						JOptionPane.INFORMATION_MESSAGE);
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

		
		registerBtn.addActionListener(this);
		      
		registerBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		    	
		    	if (e.getSource() == registerBtn) {
		            String f_name = "";
		            // Adding validation for the first name field
		            if (!fname.getText().isEmpty()) {
		                // Assigning the value of the first name field to the firstName variable
		            	f_name = fname.getText();
		            } else {
		                // Displaying an error message if the first name field is empty
		                JOptionPane.showMessageDialog(null, "Please enter a First name.");
		                return;
		            }
		            // rest of the code
		        
		            String l_name = "";
		            // Adding validation for the last name field
		            if (!lname.getText().isEmpty()) {
		                // Assigning the value of the last name field to the lastName variable
		                l_name = lname.getText();
		            } else {
		                // Displaying an error message if the last name field is empty
		                JOptionPane.showMessageDialog(null, "Please enter a Last name.");
		                return;
		            }
		           


					String password = pwUser.getText();
					if (password.isEmpty()) {
					    JOptionPane.showMessageDialog(null, "Password field is empty.");
					    return;
					}
					if (!password.matches("(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+")) {
					    JOptionPane.showMessageDialog(null, "Password must contain at least one letter and one digit.");
					    return;
					}

				    // rest of the code

					// Validation for userPost field - ensure it is not empty
					if (userPost.getText().isEmpty()) {
					    JOptionPane.showMessageDialog(null, "Please enter a user post.");
					    return;
					}

					// Validation for userCountry field - ensure it is not empty
					if (userCountry.getText().isEmpty()) {
					    JOptionPane.showMessageDialog(null, "Please enter a user country.");
					    return;
					}

					// Validation for companyCode field - ensure it is not empty and contains only digits
					String companyCode1 = companyCode.getText();
					String customertype1 = customerType.getToolTipText();
					if (companyCode1.isEmpty()) {
					    JOptionPane.showMessageDialog(null, "Please enter a company code.");
					    return;
					}
					if (!companyCode1.matches("\\d+")) {
					    JOptionPane.showMessageDialog(null, "Company code must contain only digits.");
					    return;
					}

					// Validation for creditCard field - ensure it is not empty and contains only digits
					String creditcard = creditCard.getText();
					if (creditcard.isEmpty()) {
					    JOptionPane.showMessageDialog(null, "Please enter a credit card number.");
					    return;
					}
					if (!creditcard.matches("\\d+")) {
					    JOptionPane.showMessageDialog(null, "Credit card number must contain only digits.");
					    return;
					}

					// Validation for Email field - ensure it is not empty and in a valid format
					String email1 = Email.getText();
					if (email1.isEmpty()) {
					    JOptionPane.showMessageDialog(null, "Please enter an email address.");
					    return;
					}
					
		    	
		    	}
		    	
		    	
		    	
		    	
		        // Your code here
		    	String firstname = fname.getText();
				String middlename = mname.getText();
				String lastname = lname.getText();
				String gender = "";
				if (male.isSelected()) {
					gender = "Male";
			} else if (female.isSelected()) {
					gender = "Female";
				} else if (preferNot.isSelected()) {
					gender = "prefer not to say";
				} else if (others.isSelected()) {
					gender = "Other";
				}
				Date selectedDoB = Date.getDate();
				String Dob = null;
				if (selectedDoB != null) {
				    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				    Dob = dateFormat.format(selectedDoB);
				}

				String emaill = Emull.getText();
                 
				String address = useraddress.getText();
				String country = userCountry.getText();
				@SuppressWarnings("deprecation")
				String passwordlabel = pwUser.getText();
				
				String userType = null;
				if(customerType.getSelectedIndex()==0) {
					userType = "Corporate";
					
				}
				else if(customerType.getSelectedIndex()==1) {
					userType = "Non-Corporate";
					
				}
				
				

				int phonenumLabel = Integer.parseInt(phoneField.getText());
				int creditcardLabel = Integer.parseInt(creditCard.getText());
				int CompanyCode = Integer.parseInt(companyCode.getText());
				int postalcode = Integer.parseInt(userPost.getText());

				Register_Model model = new Register_Model( firstname, middlename, lastname, gender, phonenumLabel,
						Dob, emaill, address, postalcode, country, passwordlabel, userType,CompanyCode, 
						creditcardLabel);
				Register_Controller control = new Register_Controller();
				boolean result = control.save(model);
				if (result == true) {
					JOptionPane.showMessageDialog(null, "Thank you!for registering.Please Login to enjoy our Services");

					fname.setText("");
					mname.setText("");
					lname.setText("");
					fname.setText("");
					Date.setDate(null);
					Emull.setText("");
					useraddress.setText("");
					userCountry.setText("");
					pwUser.setText("");
					customerType.setToolTipText("");

					phoneField.setText("");
					creditCard.setText("");
					companyCode.setText("");
					userPost.getText();

				} else {
					JOptionPane.showMessageDialog(null, "Errorr to register ");

				}		    	
		    }
		});

				

			

		// Add header panel to frame

		frame.add(mainPanel);
		frame.add(headerPanel);
		frame.add(sideBarPanel);
		frame.setVisible(true);
		
		
		    }
	
	public static void main(String[] args) {
		new Register_View();
	}
		
	



	@Override
	public void actionPerformed(ActionEvent event) {
		  
		  
	if(event.getSource() == side_Button) {
				frame.dispose();
			}

			else if (event.getSource() == backTo) {
				frame.dispose();
				new Login_Veiw();
			}
	    
			
	
			
		
	}}