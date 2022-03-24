package hotel.management.system;


import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee extends JFrame{ //Third Frame

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;
        JComboBox c1;

        public AddEmployee(){
            getContentPane().setForeground(Color.RED);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD EMPLOYEE DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel name = new JLabel("NAME");
            name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            name.setBounds(60, 30, 150, 27);
            add(name);
            
            textField = new JTextField();
            textField.setBounds(200, 30, 150, 27);
            add(textField);
			
            JLabel age = new JLabel("AGE");
            age.setFont(new Font("Tahoma", Font.PLAIN, 17));
            age.setBounds(60, 80, 150, 27);
            add(age);
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 80, 150, 27);
            add(textField_1);
            
            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(60, 130, 150, 27);
            add(Gender);
		
            JRadioButton Male = new JRadioButton("MALE");
            Male.setFont(new Font("Tahoma", Font.BOLD, 11));
            Male.setBackground(Color.WHITE);
            Male.setBounds(200, 130, 70, 27);
            add(Male);
	
            JRadioButton Female = new JRadioButton("FEMALE");
            Female.setFont(new Font("Tahoma", Font.BOLD, 11));
            Female.setBackground(Color.WHITE);
            Female.setBounds(280, 130, 70, 27);
            add(Female);
            
            
            JLabel job = new JLabel("JOB");
            job.setFont(new Font("Tahoma", Font.PLAIN, 17));
            job.setBounds(60, 180, 150, 27);
            add(job);
			
            String course[] = {"Receptionist","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
            c1 = new JComboBox(course);
            c1.setBackground(Color.WHITE);
            c1.setBounds(200,180,150,30);
            add(c1);
            		
            JLabel salary = new JLabel("SALARY");
            salary.setFont(new Font("Tahoma", Font.PLAIN, 17));
            salary.setBounds(60, 230, 150, 27);
            add(salary);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 230, 150, 27);
            add(textField_3);
	
            JLabel phone = new JLabel("PHONE");
            phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
            phone.setBounds(60, 280, 150, 27);
            add(phone);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 280, 150, 27);
            add(textField_4);
	
            JLabel aadhar = new JLabel("AADHAR");
            aadhar.setFont(new Font("Tahoma", Font.PLAIN, 17));
            aadhar.setBounds(60, 330, 150, 27);
            add(aadhar);
			
            textField_5 = new JTextField();
            textField_5.setBounds(200, 330, 150, 27);
            add(textField_5);
	
            
            JLabel email = new JLabel("EMAIL");
            email.setFont(new Font("Tahoma", Font.PLAIN, 17));
            email.setBounds(60, 380, 150, 27);
            add(email);
			
            textField_6 = new JTextField();
            textField_6.setBounds(200, 380, 150, 27);
            add(textField_6);
            
            JButton Next = new JButton("SAVE");
            Next.setBounds(200, 430, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
	
            setVisible(true);
	
            JLabel AddEmployee = new JLabel("ADD EMPLOYEE DETAILS");
            AddEmployee.setForeground(Color.BLUE);
            AddEmployee.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddEmployee.setBounds(470, 40, 442, 35);
            add(AddEmployee);
			
     
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/tenth.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(410,80,480,410);
            add(image);

            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String name = textField.getText();
                    String age = textField_1.getText();
                    String salary = textField_3.getText();
                    String phone = textField_4.getText();
                    String aadhar = textField_5.getText();
                    String email = textField_6.getText();
                   
                    String gender = null;
                    
                    if(Male.isSelected()){
                        gender = "male";
                    
                    }else if(Female.isSelected()){
                        gender = "female";
                    }

                            
                    String s6 = (String)c1.getSelectedItem();
                    
                    try {
                        conn c = new conn();
                        String str = "Insert into employee values( '"+name+"', '"+age+"', '"+gender+"','"+s6+"', '"+salary+"', '"+phone+"','"+aadhar+"', '"+email+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Employee Added Succesfully!!");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });
			
            setBounds(320,200,900,600);
            setVisible(true);
			
	}
        
    public static void main(String[] args){
        new AddEmployee();
    }   
}