package bank_management_Syste1;
import java.awt.Image;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;




public class Transaction extends JFrame implements ActionListener{
	JButton deposit,cash,fcash,pin,min,exit,bal;
	String pinnum;
	
	Transaction(String pinnum)
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
		
		JLabel text=new JLabel("Please select your Transaction");
		
		
		text.setBounds(230,100,700,45);
		
		text.setFont(new Font("System",Font.BOLD,22));
		add(text);
		
	    deposit=new JButton("Deposit");
		deposit.setBounds(230,200,150,30);
		deposit.addActionListener(this);
		add(deposit);
		
		cash=new JButton("Cash Withdrawl");
		cash.setBounds(500,200,150,30);
		cash.addActionListener(this);
		add(cash);
		
		fcash=new JButton("Fast Cash");
		fcash.setBounds(230,300,150,30);
		fcash.addActionListener(this);
		add(fcash);
		
		
	    min=new JButton("Mini Statement");
		min.setBounds(500,300,150,30);
		min.addActionListener(this);
		add(min);
		
		 pin=new JButton("Pin Change");
		pin.setBounds(230,400,150,30);
		pin.addActionListener(this);
		add(pin);
		
		 bal=new JButton("Balance Enquiry");
		bal.setBounds(500,400,150,30);
		bal.addActionListener(this);
		add(bal);
		
		 exit =new JButton("Exit");
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
			System.exit(0);
		
			
		}else if(ae.getSource()==deposit) {
			setVisible(false);
			new Deposit(pinnum).setVisible(true);
		}else if(ae.getSource()==cash) {
			setVisible(false);
			new Withdrawl(pinnum).setVisible(true);
		}else if(ae.getSource()==fcash) {
			setVisible(false);
			new FastCash(pinnum).setVisible(true);
		}else if(ae.getSource()==pin) {
			setVisible(false);
			new PinChange(pinnum).setVisible(true);
		}else if(ae.getSource()==bal) {
			setVisible(false);
			new BalanceInquiry(pinnum).setVisible(true);
		}
		else if(ae.getSource()==min) {
			setVisible(false);
			new MiniStatement(pinnum).setVisible(true);
		}
	}
	

	public static void main(String[] args) {
		new Transaction("");
		
		// TODO Auto-generated method stub
		

	}
	
		
	}


