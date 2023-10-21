package bank_management_Syste1;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
	JTextField amount;
	JButton depo, back;
	String pinnum;
	Deposit(String pinnum)
	{
		this.pinnum=pinnum;
		setLayout(null);
		setSize(600,600);
		setLocation(300,0);
		setVisible(true);
		
		JLabel text=new JLabel("Enter the amount you want to deposit");
		text.setBounds(120,100,400,30);
		text.setFont(new Font("System",Font.BOLD,22));
		add(text);
		

        amount=new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(120,200,380,30);
		add(amount);
		
		 
		depo=new JButton("Deposit");
		depo.setBounds(350,280,100,30);
		depo.addActionListener(this);
		add(depo);
		
		back=new JButton("Back");
		back.setBounds(350,340,100,30);
		back.addActionListener(this);
		add(back);
		
		
		
		
	}
	public void actionPerformed (ActionEvent ae) {
		if(ae.getSource()==depo) {
			String d=amount.getText();
			Date date=new Date();
			if(d.equals("")) {
				JOptionPane.showMessageDialog(null,"Please eneter the amount you want to deposit ");
				
				
			}
			else {
				try {
				Conn c1=new Conn();
				String query="insert into amountdeposit values('"+pinnum+"','"+date+"','Deposit','"+d+"')";
				c1.s.execute(query);
				JOptionPane.showMessageDialog(null,"Rs" +d+ "Depsoit successfully ");
				setVisible(false);
				new Transaction(pinnum).setVisible(true);
				 
			}
			catch(Exception e) {
			
				System.out.println(e);
			
			
			
		}
	}
		}
		else if(ae.getSource()==back) {
			setVisible(false);
			new Transaction(pinnum).setVisible(true);
			
		}
		
	}

	public static void main(String[] args) {
		new Deposit("");
		// TODO Auto-generated method stub

	}

}
