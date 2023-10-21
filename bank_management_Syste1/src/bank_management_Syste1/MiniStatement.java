package bank_management_Syste1;
import java.sql.*;

import javax.swing.*;

public class MiniStatement extends JFrame {
	//JLabel balance;
	String pinnum;
	MiniStatement(String pinnum){
		this.pinnum=pinnum;
		setLayout(null);
		
		JLabel mini=new JLabel();
		mini.setBounds(20,140,400,200);
		add(mini);
		
		JLabel b=new JLabel("Punjab National Bank");
		b.setBounds(130,20,150,20);
		add(b);
		
		JLabel card=new JLabel();
		card.setBounds(20,80,300,20);
		add(card);
		
		 JLabel balance=new JLabel();
		balance.setBounds(20,400,300,20);
		add(balance);
		try {
			 Conn c1=new Conn();
			 ResultSet rs=c1.s.executeQuery("select*from login where pin_number='"+pinnum+"'");
			 while(rs.next()) {
				 card.setText("Card Number: " +rs.getString("card_number").substring(0,4)+"XXXXXXX"+rs.getString("card_number").substring(12));;
			 }
			 
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		 try {
			 Conn c1=new Conn();
			 int bal1=0;
			 ResultSet rs=c1.s.executeQuery("select*from amountdeposit where Pin_number='"+pinnum+"'");
			 
			 while(rs.next()) {
				 mini.setText(mini.getText() + "<html>"+ rs.getString("date")+"&nbsp;&nbsp&nbsp;&nbsp&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp&nbsp;"+rs.getString("amount")+"<br><br></html>");
			 
				 if(rs.getString("type").equals("Deposit")) {
						bal1+=Integer.parseInt(rs.getString("amount"));
					}else {
						bal1-=Integer.parseInt(rs.getString("amount"));
					}
			 }
				 
				 
			 
			 balance.setText("Your current account Balance is Rs: " +bal1);
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		
		
		setSize(400,600);
		setLocation(20,20);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MiniStatement("");
		// TODO Auto-generated method stub

	}

}
