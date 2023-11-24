package veiw;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class FrontPage_Veiw implements ActionListener {
	JLabel imgLabel,headerLabel,titleLabel,textLabel;
	JFrame frame;
	JButton loginBtn,closeBtn;
	
	
 FrontPage_Veiw(){
	 frame = new JFrame("Hotel Luton");
	 imgLabel = new JLabel();
     ImageIcon hotel = new ImageIcon("img/hotelimg.jpg");        
     imgLabel.setIcon(hotel);
     imgLabel.setBounds(0,0,1200,900);
     frame.add(imgLabel);
     
     
     
     headerLabel = new JLabel("Welcome to");
     headerLabel.setBounds(450,250,200,40);
     headerLabel.setForeground(Color.white);
     headerLabel.setFont(new Font("Times new roman",Font.BOLD,40));
     imgLabel.add(headerLabel);
     
    
     
     
     titleLabel = new JLabel("Hotel Luton");
     titleLabel.setBounds(250,290,900,150);
     titleLabel.setForeground(Color.white);
     titleLabel.setFont(new Font("Pacifico",Font.BOLD,120));
     imgLabel.add(titleLabel);
     
     textLabel = new JLabel("One Step away from Bliss");
     textLabel.setBounds(290,440,900,90);
     textLabel.setForeground(Color.white);
     textLabel.setFont(new Font("Pacifico",Font.BOLD,50));
     imgLabel.add(textLabel);
     
     loginBtn = new JButton("LOGIN");
     loginBtn.setBackground(Color.white);
     loginBtn.setBounds(870,650,150,40);
     loginBtn.addActionListener(this);
     imgLabel.add(loginBtn);
     
     closeBtn = new JButton("CLOSE");
     closeBtn.setBackground(Color.white);
     closeBtn.setBounds(150,650,150,40);
     closeBtn.addActionListener(this);
     imgLabel.add(closeBtn);
     
     
     
     
     
     
     frame.setSize(1200,875);
     frame.setLayout(null);
     frame.setResizable(false);
     frame.setLocationRelativeTo(null);
     
     frame.setVisible(true);
     
 }
 public static void main(String[] args) {
	 new FrontPage_Veiw();
 }
 @Override
 public void actionPerformed(ActionEvent e) {
		if(e.getSource()== closeBtn) {
			frame.dispose();
		}
		
		else if(e.getSource()== loginBtn) {
			frame.dispose();
			new Login_Veiw();
		}
 }
}
