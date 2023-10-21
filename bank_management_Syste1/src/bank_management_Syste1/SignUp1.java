package bank_management_Syste1;
import java.awt.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


import javax.swing.*;

public class SignUp1 extends JFrame implements ActionListener{
	JTextField namet1,ft2,dobt2,et2,at2,ct2,st2,pint2;
	JButton but1;
	JRadioButton jb,jb1,jb2,jb3;
	JLabel formno,name,f,dob,e,m,a,c,s,pin,g;

	long random;
	SignUp1()
	{
		setLayout(null);
		Random ran=new Random();
		random=Math.abs(ran.nextLong()% 9000L+1000L);
		
		JLabel formno=new JLabel("Application form number."+random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,60);
		add(formno);
		
		JLabel perdetail=new JLabel("page 1: Personal Details");
		perdetail.setFont(new Font("Raleway",Font.BOLD,28));
		perdetail.setBounds(190,80,500,50);
		add(perdetail);
		
		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,150,200,30);
		add(name);
		
		 namet1=new JTextField();
		namet1.setFont(new Font("Raleway",Font.BOLD,14));
		namet1.setBounds(300,150,400,30);
		add(namet1);
		
		
		 f=new JLabel("Father's name:");
		f.setFont(new Font("Raleway",Font.BOLD,20));
		f.setBounds(100,190,200,30);
		add(f);
		
	     ft2=new JTextField();
		ft2.setFont(new Font("Raleway",Font.BOLD,14));
		ft2.setBounds(300,190,400,30);
		add(ft2);
		
		
		 dob=new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		 dobt2=new JTextField();
		dobt2.setFont(new Font("Raleway",Font.BOLD,14));
		dobt2.setBounds(300,240,400,30);
		add(dobt2);
		
		//JDateChooser dc=new JDateChooser();
		//dc.setBounds(300,240,200,30);
		//add(dc);
		
		
		 g=new JLabel("Gender:");
		g.setFont(new Font("Raleway",Font.BOLD,20));
		g.setBounds(100,290,200,30);
		add(g);
		
		
		
		 jb=new JRadioButton("Male");
		jb.setBounds(300,290,60,30);
		add(jb);
		
		 jb1=new JRadioButton("Female");
		jb1.setBounds(450,290,120,30);
		add(jb1);
		
		ButtonGroup gp=new ButtonGroup();
		gp.add(jb);
		gp.add(jb1);
	
		
		 e=new JLabel("Email Address:");
		e.setFont(new Font("Raleway",Font.BOLD,20));
		e.setBounds(100,340,200,30);
		add(e);
		
		 et2=new JTextField();
		et2.setFont(new Font("Raleway",Font.BOLD,14));
		et2.setBounds(300,340,400,30);
		add(et2);
		
		 m=new JLabel("Marital Status:");
		m.setFont(new Font("Raleway",Font.BOLD,20));
		m.setBounds(100,390,200,30);
		add(m);
		

		 jb2=new JRadioButton("Married");
		jb2.setBounds(300,390,100,30);
		add(jb2);
		
		 jb3=new JRadioButton("Unmarried");
		jb3.setBounds(450,390,100,30);
		add(jb3);
		
		ButtonGroup gp1=new ButtonGroup();
		gp1.add(jb2);
		gp1.add(jb3);
		
		
		
		
		 a =new JLabel("Address:");
		a.setFont(new Font("Raleway",Font.BOLD,20));
		a.setBounds(100,440,200,30);
		add(a);
		
	    at2=new JTextField();
		at2.setFont(new Font("Raleway",Font.BOLD,14));
		at2.setBounds(300,440,400,30);
		add(at2);
		
		 c=new JLabel("City:");
		c.setFont(new Font("Raleway",Font.BOLD,20));
		c.setBounds(100,490,200,30);
		add(c);
		
		ct2=new JTextField();
		ct2.setFont(new Font("Raleway",Font.BOLD,14));
		ct2.setBounds(300,490,400,30);
		add(ct2);
		
		 s=new JLabel("State:");
		s.setFont(new Font("Raleway",Font.BOLD,20));
		s.setBounds(100,540,200,30);
		add(s);
		
		 st2=new JTextField();
		st2.setFont(new Font("Raleway",Font.BOLD,14));
		st2.setBounds(300,540,400,30);
		add(st2);
		
		 pin=new JLabel("Pin Code:");
		pin.setFont(new Font("Raleway",Font.BOLD,20));
		pin.setBounds(100,590,200,30);
		add(pin);
		
	     pint2=new JTextField();
		pint2.setFont(new Font("Raleway",Font.BOLD,14));
		pint2.setBounds(300,590,400,30);
		add(pint2);
		
		 but1=new JButton("Next");
			but1.setFont(new Font("Railway",Font.BOLD,14));
			but1.setBounds(750,590,80,30);
			but1.addActionListener(this);
			add(but1);;
		
		
		
		
		
		
		getContentPane().setBackground(Color.white);
		
		setSize(900,950);
		setLocation(350,10);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String name=namet1.getText();
		String formno=""+random;
		String f=ft2.getText();
		String dob=dobt2.getText();
		String g=null;
		ft2.getText();
		if(jb.isSelected()) {
			g="Male";
			
		}
		else if(jb1.isSelected())
		{
			g="Female";
		}
		String e=et2.getText();
		String m=null;
		et2.getText();
		if(jb2.isSelected())
		{
			m="Married";
		}
		else if(jb3.isSelected())
		{
			m="Unmarried";
		}
		
		 String a=at2.getText();
		String c=ct2.getText();
		String s=st2.getText();
		 String pin=pint2.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			}
			else {
				Conn c1=new Conn();
				String query ="insert into signup values('"+formno+"','"+name+"','"+f+"','"+dob+"','"+g+"','"+e+"','"+m+"','"+a+"','"+c+"','"+s+"','"+pin+"')";
				c1.s.executeUpdate(query);
				
				setVisible(false);
				new SignUp2(formno).setVisible(true);
				
				
						
			
				
			}
		}
			catch(Exception ex) {
			
				System.out.println(ex);
			}
		
		
	}

	public static void main(String[] args) {
		new SignUp1();
		
		// TODO Auto-generated method stub

	}

}

