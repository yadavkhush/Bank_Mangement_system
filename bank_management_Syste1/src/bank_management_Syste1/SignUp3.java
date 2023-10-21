package bank_management_Syste1;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.util.*;

//public class SignUp3 extends JFrame implements ActionListener {
	public class SignUp3 extends JFrame implements ActionListener
	{
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	//long Random;
	String formno;
	SignUp3(String formno){
		this.formno=formno;
		setLayout(null);
		JLabel l1=new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Railway",Font.BOLD,22));
		l1.setBounds(280,5,500,40);
		add(l1);
		
		JLabel type=new JLabel("Account Type");
		type.setFont(new Font("Railway",Font.BOLD,22));
		l1.setBounds(100,100,250,30);
		add(type);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("Railway",Font.BOLD,16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100,180,200,20);
		add(r1);
		
		r2=new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Railway",Font.BOLD,16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(350,180,250,20);
		add(r2);
		
		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("Railway",Font.BOLD,16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(100,220,200,20);
		add(r3);
		
		r4=new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Railway",Font.BOLD,16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350,220,250,20);
		add(r4);
		
		
		ButtonGroup gp1=new ButtonGroup();
		gp1.add(r1);
		gp1.add(r2);
		gp1.add(r3);
		gp1.add(r4);
		
		
		JLabel card=new JLabel("Card Number");
		card.setFont(new Font("Railway",Font.BOLD,22));
		card.setBounds(100,280,200,30);
		add(card);
		
		JLabel pin=new JLabel("PIN:");
		pin.setFont(new Font("Railway",Font.BOLD,22));
		pin.setBounds(100,340,200,30);
		add(pin);
		
		JLabel pinnum1=new JLabel("XXXX");
		pinnum1.setFont(new Font("Railway",Font.BOLD,22));
		pinnum1.setBounds(330,340,200,30);
		add(pinnum1);
		
		JLabel pindetail=new JLabel("Your 4 Digit Password");
		pindetail.setFont(new Font("Railway",Font.BOLD,12));
		pindetail.setBounds(100,370,300,20);
		add(pindetail);
		
		
		
		
		JLabel num=new JLabel("XXXX-XXXX-XXXX-2345");
		num.setFont(new Font("Railway",Font.BOLD,22));
		num.setBounds(330,280,300,30);
		add(num);
		
		JLabel carddetail=new JLabel("Your 16 Digit Card Number");
		carddetail.setFont(new Font("Railway",Font.BOLD,12));
		carddetail.setBounds(100,310,300,20);
		add(carddetail);
		
		JLabel services=new JLabel("Services Required");
		services.setFont(new Font("Railway",Font.BOLD,22));
		services.setBounds(100,400,250,35);
		add(services);
		
		c1=new JCheckBox("ATM Card");
		c1.setFont(new Font("Railway",Font.BOLD,16));
		c1.setBackground(Color.WHITE);
		c1.setBounds(100,450,200,30);
		add(c1);
		
		c2=new JCheckBox("Internet Banking");
		c2.setFont(new Font("Railway",Font.BOLD,16));
		c2.setBackground(Color.WHITE);
		c2.setBounds(350,450,200,30);
		add(c2);
		
		c3=new JCheckBox("Mobile Banking");
		c3.setFont(new Font("Railway",Font.BOLD,16));
		c3.setBackground(Color.WHITE);
		c3.setBounds(100,500,200,30);
		add(c3);
		
		c4=new JCheckBox("Email & SMS Alerts");
		c4.setFont(new Font("Railway",Font.BOLD,16));
		c4.setBackground(Color.WHITE);
		c4.setBounds(350,500,200,30);
		add(c4);
		
		c5=new JCheckBox("Cheque Book");
		c5.setFont(new Font("Railway",Font.BOLD,16));
		c5.setBackground(Color.WHITE);
		c5.setBounds(100,550,200,30);
		add(c5);
		
		c6=new JCheckBox("E Statement");
		c6.setFont(new Font("Railway",Font.BOLD,16));
		c6.setBackground(Color.WHITE);
		c6.setBounds(350,550,200,30);
		add(c6);
		
		c7=new JCheckBox("Hereby declare that the above enetred details are correct to the best of my knowledge");
		c7.setFont(new Font("Railway",Font.BOLD,12));
		c7.setBackground(Color.WHITE);
		c7.setBounds(100,600,600,30);
		add(c7);
		
		 submit=new JButton("Submit");
		 submit.setFont(new Font("Railway",Font.BOLD,14));
		 submit.setBounds(700,600,100,30);
	submit.addActionListener(this);
			add(submit);
			
			cancel=new JButton("Cancel");
			cancel.setFont(new Font("Railway",Font.BOLD,14));
			cancel.setBounds(820,600,100,30);
	cancel.addActionListener(this);
				add(cancel);
			
			
		
		
		
		
		
		
		setSize(950,820);
		setLocation(350,0);
		setVisible(true);
	}
	public SignUp3() {
		// TODO Auto-generated constructor stub
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==submit) {
			
		String type=null;
		if(r1.isSelected()){
			type="Saving Account";
			
			
		}
		else if(r2.isSelected()) {
			type="Fixed Deposit Account";
		}
		else if(r3.isSelected()) {
			type="Current Account";
		}
		else if(r4.isSelected()) {
			type="Recurrent Deposit Account";
		}
		Random random=new Random();
		String cardnum=""+Math.abs((random.nextLong()%90000000L)+2504093600000000L);
		String pinnum=""+Math.abs((random.nextLong()%9000L)+1000L);
		
		String facility="";
		if(c1.isSelected()) {
			facility=facility+"ATM Card";
		}
		else if(c2.isSelected()) {
			facility=facility+"Internet Banking";
		}
		else if(c3.isSelected()) {
			facility=facility+"Mobile Banking";
		}
		else if(c4.isSelected()) {
			facility=facility+"Email & SMS Alert";
		}
		
		else if(c5.isSelected()) {
			facility=facility+"Cheque Book";
		}
		else if(c6.isSelected()) {
			facility=facility+"E statement";
		}
		try {
			if(type.equals("")) {
				JOptionPane.showMessageDialog(null,"Account type is required");
			}
			else {
				Conn c1=new Conn();
				String query1="insert into signup4 values('"+formno+"','"+type+"','"+cardnum+"','"+pinnum+"','"+facility+"')";
				c1.s.executeUpdate(query1);
				
				//Conn c1=new Conn();
				String query2="insert into login values('"+formno+"','"+cardnum+"','"+pinnum+"')";
				c1.s.executeUpdate(query2);
				
				JOptionPane.showMessageDialog(null,"Card Number"+cardnum+"\npin:"+pinnum);
				new Deposit(pinnum).setVisible(false);
				
			
			}
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		
		
		
		
			
		
		}else if (ae.getSource()==cancel) {
			
		setVisible(false);
		new Login1().setVisible(true);
			
		}
	}

	public static void main(String[] args) {
		
		new SignUp3("");
		// TODO Auto-generated method stub

	}
	
	

}
