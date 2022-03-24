package hotel.management.system;

import javax.swing.*;

import java.sql.*;	
import java.awt.event.*;
import java.awt.*;

public class Reception extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		new Reception();
	}
	
	public Reception(){
		
                setBounds(350, 170, 850, 570);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fourth.jpg"));
                Image i3 = i1.getImage().getScaledInstance(850, 570,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,0,850,570);
                add(l1);
		
		JButton btnNewCustomerForm = new JButton("New Customer Form");
		btnNewCustomerForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				NewCustomer custom = new NewCustomer();
				custom.setVisible(true);
                                setVisible(false);
			}catch(Exception e1){
				e1.printStackTrace();
			}
			}
		});
		btnNewCustomerForm.setBounds(50, 300, 200, 30);
                btnNewCustomerForm.setBackground(Color.BLACK);
                btnNewCustomerForm.setForeground(Color.WHITE);
		l1.add(btnNewCustomerForm);
		
		JButton btnNewButton = new JButton("Room");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Room room = new Room();
				room.setVisible(true);
                                setVisible(false);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds( 50, 380, 200, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);

		l1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("All Employee Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
					Employee em = new Employee();
					em.setVisible(true);
					setVisible(false);
					
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton_2.setBounds(600, 300, 200, 30);                
                btnNewButton_2.setBackground(Color.BLACK);
                btnNewButton_2.setForeground(Color.WHITE);

		l1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Customer Info");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					//error ---------------------
					CustomerInfo customer = new CustomerInfo();
					customer.setVisible(true);				
					setVisible(false);
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(325, 300, 200, 30);
                btnNewButton_3.setBackground(Color.BLACK);
                btnNewButton_3.setForeground(Color.WHITE);

		l1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Check Out");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckOut check;
				try {
					check = new CheckOut();
					check.setVisible(true);
                                        setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(325, 380, 200, 30);
                btnNewButton_4.setBackground(Color.BLACK);
                btnNewButton_4.setForeground(Color.WHITE);

		l1.add(btnNewButton_4);			

		JButton btnNewButton_5 = new JButton("Log Out");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                                    new Login().setVisible(true);
                                    setVisible(false);
                                    
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_5.setBounds(600, 380, 200, 30);
                btnNewButton_5.setBackground(Color.BLACK);
                btnNewButton_5.setForeground(Color.WHITE);

		l1.add(btnNewButton_5);
                getContentPane().setBackground(Color.WHITE);
                
                setVisible(true);
	}
}