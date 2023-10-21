package bank_management_Syste1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;





	
		

		public class Login1 extends JFrame  implements ActionListener{
			
			JButton b1,b2,b3;
			JTextField t1;
			
			JPasswordField t2;
			
			Login1()
			{
				
				setLayout(null);
				setTitle("Automated Title Machine");
				//ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icon/career-in-Bank-Management-1.png"));
				//Image i2=i1.getImage().getSacaledInstance(100,100,Image.SCALE_DEFAULT);
				//JLabel label=new JLabel(il);
				//add(label);
				JLabel l1=new JLabel("Welcome to ATM");
				l1.setFont(new Font("osword",Font.BOLD,38));
				l1.setBounds(200,40,400,40);
				add(l1);
				
				JLabel l2=new JLabel("Card No:");
				l2.setFont(new Font("Raleway",Font.BOLD,28));
				l2.setBounds(120,150,150,30);
				add(l2);
				
				 t1=new JTextField();
				t1.setBounds(300,150,230,30);
				add(t1);;
				
				JLabel l3=new JLabel("Pin:");
				l3.setFont(new Font("Raleway",Font.BOLD,28));
				l3.setBounds(120,220,230,30);
				add(l3);
				
				 t2=new JPasswordField();
			t2.setBounds(300,220,230,30);
				add(t2);
				
				b1=new JButton("Sign In");
				b1.setBounds(300,300,100,30);
				b1.setBackground(Color.WHITE);
				b1.addActionListener(this);
				add(b1);
				
				b2=new JButton("Clear");
				b2.setBounds(430,300,100,30);
				b2.setBackground(Color.WHITE);
				//b2.setForeground(Color.WHITE);
				b2.addActionListener(this);
				add(b2);
				
			    b3=new JButton("Sign UP");
				b3.setBounds(300,350,230,30);
				b3.setBackground(Color.WHITE);
				//b3.setForeground(Color.WHITE);
				b3.addActionListener(this);
				add(b3);
				
				
				
				
				
				
				
				
				
				
				
				
				
				getContentPane().setBackground(Color.white);
				
				setSize(700,480);
				setVisible(true);
				setLocation(300,150);
			}
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==b2)
				{
					
					t1.setText("");
					t2.setText("");
					
					
				}
				else if(ae.getSource()==b1)
				{
					Conn c1=new Conn();
					String cardnum=t1.getText();
					String pinnum=t2.getText();
				
					String query="select*from login where card_number='"+cardnum+"' and pin_number='"+pinnum+"'";
					 
					try {
						c1.s.executeQuery(query);
						ResultSet rs=c1.s.executeQuery(query);
						if(rs.next()) {
							setVisible(false);
							new Transaction(pinnum).setVisible(true);
							
							
						}
						else {
							JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
						}
						
						
					}catch(Exception e) {
						System.out.println(e);
					}
				}
				
			else if(ae.getSource()==b3) {
					
				
				setVisible(false);
				new SignUp1().setVisible(true);
		
			}
			}

			public static void main(String[] args) {
				new Login1();
				
				
				// TODO Auto-generated method stub

			}

		
		// TODO Auto-generated method stub

	}


