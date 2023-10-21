package bank_management_Syste1;
import java.awt.Image;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import java.awt.*;
import javax.swing.*;




public class FastCash extends JFrame implements ActionListener{
	JButton deposit,cash,fcash,pin,min,exit,bal;
	String pinnum;
	
	FastCash(String pinnum)
	{
		this.pinnum=pinnum;
		 
		setLayout(null);
		
		//ImageIcon il=new ImageIcon(//C:/Users/HP/eclipse-workspace/bank_management_Syste1/icon/image.png);
		//ImageIcon il = new ImageIcon(getClass().getResource("image.png"));
		//ImageIcon il = new ImageIcon(getClass().getResource("/icon/image.png"));


		//Image i2=il.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		//ImageIcon i3=new ImageIcon(i2);
		 //JLabel l = new JLabel(il);
		//l.setBounds(0,0,900,900);
		//frame.add(image);
		
		JLabel text=new JLabel("Select Withdrawl Amount");
		
		
		text.setBounds(230,100,700,45);
		
		text.setFont(new Font("System",Font.BOLD,22));
		add(text);
		
	    deposit=new JButton("Rs 100");
		deposit.setBounds(230,200,150,30);
		deposit.addActionListener(this);
		add(deposit);
		
		cash=new JButton("Rs 500");
		cash.setBounds(500,200,150,30);
		cash.addActionListener(this);
		add(cash);
		
		fcash=new JButton("Rs 1000");
		fcash.setBounds(230,300,150,30);
		fcash.addActionListener(this);
		add(fcash);
		
		
	    min=new JButton("Rs 2000");
		min.setBounds(500,300,150,30);
		min.addActionListener(this);
		add(min);
		
		 pin=new JButton("Rs 5000");
		pin.setBounds(230,400,150,30);
		pin.addActionListener(this);
		add(pin);
		
		 bal=new JButton("Rs 10000");
		bal.setBounds(500,400,150,30);
		bal.addActionListener(this);
		add(bal);
		
		 exit =new JButton("Back");
		exit.setBounds(370,470,150,30);
		exit.addActionListener(this);
		add(exit);
		
		;


		
				
				
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==exit)
		{
			setVisible(false);
			new Transaction(pinnum).setVisible(true);			
			
		
			
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
				
				}
				if(ae.getSource()!=exit&&bal<Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null,"Insufficient Balance");
					return;
				}
				Date date=new Date();
				String query="insert into amountdeposit values('"+pinnum+"','"+date+"','Withdrawl','"+amount+"')";
				c1.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Rs "+amount + "Debited successfully");
				
				setVisible(false);
				new Transaction(pinnum).setVisible(true);
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}
	}
	

	public static void main(String[] args) {
		new FastCash("");
		
		// TODO Auto-generated method stub
		

	}
	
		
	}


