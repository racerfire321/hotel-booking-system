package veiw;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.ManageLoginStaff;
import model.StaffLogin;

public class stafflogin_View implements ActionListener {
	      public JFrame frame;
		private JLabel EmailLabel, passwordLabel,headerLabel,bodyLabel;
	    public JTextField Email;
	    public JPasswordField password;
	    private JButton loginButton;
	    stafflogin_View() {
			frame = new JFrame();
	       

	        frame.setSize(400,400);
	        frame.setLayout(null);
	        frame.setResizable(false);
	        frame.setLocationRelativeTo(null);
	       
	        //main panel
	        headerLabel = new JLabel("WELCOME TO HOTEL LUTON");
	        headerLabel.setBounds(20,25,380,35);
	        headerLabel.setFont(new Font("Arial", Font.BOLD, 25));
	        headerLabel.setBackground(Color.pink);
	       
	        
	        bodyLabel = new JLabel("*Please login with respective email");
	        bodyLabel.setBounds(80,75,300,35);
	        
	        
	        
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
	        loginButton.setBounds(160, 285, 150, 45);
	        loginButton.setBackground(Color.black);
	        loginButton.setForeground(Color.white);
	        loginButton.addActionListener(this);
	        
	        
	       
	        
	        
	       
	        frame.add(loginButton);
	        frame.add(passwordLabel);
	        frame.add(password);
	        frame.add(Email);
	        frame.add(EmailLabel);
	        frame.add(headerLabel);
	        frame.add(bodyLabel);
	        
	        

	        
	       
	        
	        
	        // Add header panel to frame
	        
	        frame.setVisible(true);
	        	
	        
	        
	        
	        
	        
	    }

	    public static void main(String args[]) {
	       new stafflogin_View();
	    }
	    public void actionPerformed(ActionEvent e) {
			if (e.getSource()==loginButton){
			try {
				StaffLogin staff = new StaffLogin();
				ManageLoginStaff userManage = new ManageLoginStaff();
				staff.setEmail(Email.getText());
				staff.setPassword(password.getText());
				userManage.setUser(staff);
				userManage.login1();
				staff = userManage.getUser();
				if(staff.getStaffId()>=1) {
					
					LoginTest.staffId = staff.getStaffId();
					LoginTest.email = staff.getEmail();
					JOptionPane.showMessageDialog(frame, "Welcome !");
					//display mainwindow
					new Staff_Veiw();
					frame.dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(frame, "Error: user/password");
				}
				

			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(frame, ex.getMessage());
			}
			}
		}

		

		
	}

