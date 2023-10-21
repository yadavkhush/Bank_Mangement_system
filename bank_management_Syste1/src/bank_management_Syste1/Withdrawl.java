package bank_management_Syste1;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
	JTextField amount;
	JButton with, back;
	String pinnum;
	Withdrawl(String pinnum)
	{
		this.pinnum=pinnum;
		setLayout(null);
		setSize(600,600);
		setLocation(300,0);
		setVisible(true);
		
		JLabel text=new JLabel("Enter the amount you want to withdrawl");
		text.setBounds(120,100,450,30);
		text.setFont(new Font("System",Font.BOLD,22));
		add(text);
		

        amount=new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(120,200,380,30);
		add(amount);
		
		 
		with=new JButton("Withdraw");
		with.setBounds(350,280,100,30);
		with.addActionListener(this);
		add(with);
		
		back=new JButton("Back");
		back.setBounds(350,340,100,30);
		back.addActionListener(this);
		add(back);
		
		
		
		
	}
	public void actionPerformed (ActionEvent ae) {
		if(ae.getSource()==with) {
			String d=amount.getText();
			//Date date=new Date();
			if(d.equals("")) {
				JOptionPane.showMessageDialog(null,"Please eneter the amount you want to withdraw ");
					
						
					
						
					}else {
						String amount=((JButton)ae.getSource()).getText().substring(3);
						Conn c1=new Conn();
						try {
							ResultSet rs=c1.s.executeQuery("select*from amountdeposit where Pin_number='"+pinnum+"'");
							int bal=0;
							
							while(rs.next()) {
								if(rs.getString("type").equals("Deposit")) {
									bal+=Integer.parseInt(rs.getString("amount"));
								}else {
									bal-=Integer.parseInt(rs.getString("amount"));
								}
								if(bal<Integer.parseInt(d)) {
									JOptionPane.showMessageDialog(null,"Insufficient Balance");
									return;
								}
								else {
				
							
							
							Date date=new Date();
							
							String query="insert into amountdeposit values('"+pinnum+"','"+date+"','Withdrawl','"+d+"')";
							c1.s.executeUpdate(query);
							JOptionPane.showMessageDialog(null,"Rs "+d+ " Withdrawl successfully");
							
							
							
								}
							}
					
						}catch(Exception e) {
							System.out.println(e);
						}
					
				}
}
	
		
		
		 if(ae.getSource()==back) {
			setVisible(false);
			new Transaction(pinnum).setVisible(true);}
			
}
		
	
	

	public static void main(String[] args) {
		new Withdrawl("");
		// TODO Auto-generated method stub

	}

}
