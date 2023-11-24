package veiw;

	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class order_View implements ActionListener{
		JFrame frame;
		JPanel backgroundPanel;
		JLabel orderLabel,foodLabel,drinkLabel;
		JButton addButton;
		JLabel totalPriceLabel;
		JTextField totalPriceText,totalPricetext1;
		JComboBox foodBox,drinkBox;
		
		public order_View() {
			frame = new JFrame("Hotel Luton");
			orderLabel = new JLabel();
			backgroundPanel = new JPanel();
			foodLabel = new JLabel();
			drinkLabel = new JLabel();
			addButton = new JButton();
			totalPriceLabel = new JLabel();
			totalPriceText = new JTextField();
			totalPricetext1 = new JTextField();
			
			frame.setSize(400, 400);
			frame.setLayout(null);
			frame.setLocationRelativeTo(null);

			backgroundPanel.setBounds(25, 10, 350, 350);
			backgroundPanel.setBackground(new Color(249, 230, 143));
			backgroundPanel.setLayout(null);
			frame.add(backgroundPanel);
			
			orderLabel.setText("ORDER NOW");
			orderLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
			orderLabel.setForeground(new Color(102, 0, 102));
			orderLabel.setBounds(20, 20, 250, 40);
			backgroundPanel.add(orderLabel);
			
			foodLabel.setText("Todays Ordering List");
			foodLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
			foodLabel.setForeground(new Color(102, 0, 102));
			foodLabel.setBounds(20, 50, 250, 40);
			backgroundPanel.add(foodLabel);
			

			totalPriceLabel.setText("Quantity:");
			totalPriceLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
			totalPriceLabel.setForeground(new Color(102, 0, 102));
			totalPriceLabel.setBounds(200, 50, 150, 40);
			backgroundPanel.add(totalPriceLabel);
			
			totalPriceText.setBounds(200,90,100,35);
			backgroundPanel.add(totalPriceText);
			
			
			totalPricetext1.setBounds(200,195,100,35);
			backgroundPanel.add(totalPricetext1);
			
			
			
			
			addButton.setText("Order");
			addButton.setFocusable(false);
			addButton.addActionListener(this);
			addButton.setBounds(200, 250, 100, 35);
			addButton.setFont(new Font("Segoe UI", Font.PLAIN, 18));
			addButton.addActionListener(this);
			addButton.setForeground(Color.white);
			addButton.setBackground(Color.black);
			backgroundPanel.add(addButton);

			String optionFoods[] = { "Select food:","Pizza", "Burger", "Mo:Mo", "Chowmein" };
			foodBox = new JComboBox(optionFoods);
			foodBox.setBounds(20,90,150,35);
			foodBox.setFont(new Font("Segoe UI", Font.PLAIN, 18));
			foodBox.addActionListener(this);
			backgroundPanel.add(foodBox);
			
			String optionDrinks[] = { "Select Drink","Coke", "Whiskey", "Water", "Wine" };
			drinkBox = new JComboBox(optionDrinks);
			drinkBox.setBounds(20, 195, 150, 30);
			drinkBox.setFont(new Font("Segoe UI", Font.PLAIN, 18));
			drinkBox.addActionListener(this);
			backgroundPanel.add(drinkBox);
			
			frame.setVisible(true);
		}
		
		public static void main(String[]args) {
			new order_View();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()== addButton) {
				JOptionPane.showMessageDialog(frame, "Your order has been placed");
			}
		}
	}

