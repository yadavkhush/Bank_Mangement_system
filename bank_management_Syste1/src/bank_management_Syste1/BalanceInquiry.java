package bank_management_Syste1;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceInquiry extends JFrame implements ActionListener{
	JButton back;
	String pinnum;
	BalanceInquiry(String pin)
	
	{
		this.pinnum=pinnum;
		setLayout(null);
		
		 back=new JButton("Back");
		 back.setBounds(180,250,100,30);
		 back.addActionListener(this);
		 add(back);
		 
		 Conn c1=new Conn();
		 int bal=0;
			try {
				ResultSet rs=c1.s.executeQuery("select*from amountdeposit where Pin_number='"+pinnum+"'");
				while(rs.next()) {
					if(rs.getString("type").equals("Deposit")) {
						bal+=Integer.parseInt(rs.getString("amount"));
					}else {
						bal-=Integer.parseInt(rs.getString("amount"));
					}
				
				}
			} catch(Exception e)
			{
				System.out.println(e);
			}
		  JLabel text =new JLabel("Your Current balance is Rs "+ bal);
		text.setBounds(150,100,400,30);
		add(text);
		
		
		
		
		setSize(500,500);
		setLocation(300,0);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		setVisible(false);
		new Transaction(pinnum).setVisible(true);
	}
	public static void main(String[] args)
	{
		new BalanceInquiry("");
		
		
	
		// TODO Auto-generated method stub

	}

}
