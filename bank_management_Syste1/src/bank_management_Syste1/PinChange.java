package bank_management_Syste1;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {
	JPasswordField pin,repin;
	JButton back,change;
	String pinnum;
	
	PinChange(String pinnum)
	{
		this.pinnum=pinnum;
		
		setLayout(null);
		
		JLabel text=new JLabel("Change your Pin");
		text.setFont(new Font("System",Font.BOLD,22));
		text.setBounds(250,200,500,35);
		add(text);
		
		JLabel pintext=new JLabel("New PIN:");
		pintext.setFont(new Font("System",Font.BOLD,16));
		pintext.setBounds(165,320,180,35);
		add(pintext);
		
		pin=new JPasswordField();
		pin.setFont(new Font("Ralway",Font.BOLD,16));
		pin.setBounds(330,320,180,25);
		add(pin);
		
		
		
		

		JLabel repintext=new JLabel("Re-Enter New PIN:");
		repintext.setFont(new Font("System",Font.BOLD,16));
		repintext.setBounds(165,360,180,35);
		add(repintext);
		
		repin=new JPasswordField();
		repin.setFont(new Font("Ralway",Font.BOLD,16));
		repin.setBounds(330,360,180,25);
		add(repin);
		
		
	    change=new JButton("Change");
		change.setBounds(355,485,150,30);
		change.addActionListener(this);
		add(change);
		
	    back=new JButton("Back");
		back.setBounds(355,520,150,30);
		back.addActionListener(this);
		add(back);
		
		
		
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==change) {
		try {
			String npin=pin.getText();
			String rpin=repin.getText();
			if(!npin.equals(rpin)) {
				JOptionPane.showMessageDialog(null,"Entered PIN does not match");
				return;
			}
			if(npin.equals("")) {
				JOptionPane.showMessageDialog(null,"Please enter New PIN");
				return;
				
		}
			if(rpin.equals("")) {
				JOptionPane.showMessageDialog(null,"Please re-enter new PIN");
				return;
			}
			 
			Conn c1=new Conn();
			String query1="update amountdeposit set Pin_number='"+rpin+"'where Pin_number='"+pinnum+"'";
			String query2="update login set Pin_number='"+rpin+"'where Pin_number='"+pinnum+"'";
			String query3="update signup4 set Pin_number='"+rpin+"'where Pin_number='"+pinnum+"'";
			c1.s.executeUpdate(query1);
			c1.s.executeUpdate(query2);
			c1.s.executeUpdate(query3);
			
			JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
			 setVisible(false);
			 new Transaction(rpin).setVisible(true);
					
		}catch(Exception e) {
			
		
			System.out.println(e);
		
		
		}
		}else {
			setVisible(false);
			new Transaction(pinnum).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new PinChange("");
		// TODO Auto-generated method stub

	}

}
