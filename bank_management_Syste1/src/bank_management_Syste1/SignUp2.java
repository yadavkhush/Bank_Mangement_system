package bank_management_Syste1;
import java.awt.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


import javax.swing.*;

public class SignUp2 extends JFrame implements ActionListener{
	JTextField namet1,ft2,dobt2,et2,at2,ct2,st2,pint2;
	JButton but;
	JRadioButton jb,jb1,jb2,jb3;
	JLabel name,f,dob,e,m,a,c,s,pin,g;
	JComboBox rel,cat,in,ed,o;
	String formno;
 //long random;
	
	SignUp2(String formno)
	{
		this.formno=formno;
		setLayout(null);
		Random ran=new Random();
		long random=Math.abs(ran.nextLong()% 9000L+1000L);
		
		
		
		setTitle("New Account");
		
		
		
		JLabel perdetail=new JLabel("page 2: Additional Details");
		perdetail.setFont(new Font("Raleway",Font.BOLD,28));
		perdetail.setBounds(190,80,500,50);
		add(perdetail);
		
		String valr[]= {"Hindu","Muslim","Sikh","Chrisian","other"};
		
		rel=new JComboBox(valr);
		rel.setBounds(300,150,400,30);
		//add(rel);
		rel.setBackground(Color.WHITE);
		add(rel);
		
		JLabel name=new JLabel("Relegion");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,150,200,30);
		add(name);
		
		 namet1=new JTextField();
		namet1.setFont(new Font("Raleway",Font.BOLD,14));
		namet1.setBounds(300,150,400,30);
		add(namet1);
		
String valc[]= {"General","OBC","SC","ST","other"};
		
		cat=new JComboBox(valc);
		cat.setBounds(300,190,400,30);
		//add(rel);
		cat.setBackground(Color.WHITE);
		add(cat);
		
		
		 f=new JLabel("Category:");
		f.setFont(new Font("Raleway",Font.BOLD,20));
		f.setBounds(100,190,200,30);
		add(f);
		
	     
		
		
String vali[]= {"Null","below 2 lakh","above 2 lakh","above 2 lakh and below 5 lakh","upto 10 lakh"};
		
		 in=new JComboBox(vali);
		in.setBounds(300,240,400,30);
		//add(rel);
		in.setBackground(Color.WHITE);
		add(in);
		
		
		 dob=new JLabel("Income:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		 
		
		
		
		
		 g=new JLabel("Educational:");
		g.setFont(new Font("Raleway",Font.BOLD,20));
		g.setBounds(100,290,200,30);
		add(g);
		
String valed[]= {"Post Graduational","Graduation","12th","10th","other"};
		
		 ed=new JComboBox(valed);
		ed.setBounds(300,315,400,30);
		//add(rel);
		ed.setBackground(Color.WHITE);
		add(ed);
		
		
		
		 
		
	
		
		 e=new JLabel("Qualification:");
		e.setFont(new Font("Raleway",Font.BOLD,20));
		e.setBounds(100,315,200,30);
		add(e);
		
String valo[]= {"Student","Business","Self-Employed","other"};
		
		 o=new JComboBox(valo);
		o.setBounds(300,390,400,30);
		
		o.setBackground(Color.WHITE);
		add(o);
		 
		
		 m=new JLabel("Occupation:");
		m.setFont(new Font("Raleway",Font.BOLD,20));
		m.setBounds(100,390,200,30);
		add(m);
		

		
		
		
		
		
		 a =new JLabel("PAN Number:");
		a.setFont(new Font("Raleway",Font.BOLD,20));
		a.setBounds(100,440,200,30);
		add(a);
		
	    at2=new JTextField();
		at2.setFont(new Font("Raleway",Font.BOLD,14));
		at2.setBounds(300,440,400,30);
		add(at2);
		
		 c=new JLabel("Aadhar Number:");
		c.setFont(new Font("Raleway",Font.BOLD,20));
		c.setBounds(100,490,200,30);
		add(c);
		
		ct2=new JTextField();
		ct2.setFont(new Font("Raleway",Font.BOLD,14));
		ct2.setBounds(300,490,400,30);
		add(ct2);
		
		 s=new JLabel("Senior Citizen:");
		s.setFont(new Font("Raleway",Font.BOLD,20));
		s.setBounds(100,540,200,30);
		add(s);
		
		 jb2=new JRadioButton("Yes");
			jb2.setBounds(300,540,100,30);
			add(jb2);
			
			 jb3=new JRadioButton("No");
			jb3.setBounds(450,540,100,30);
			add(jb3);
			
			ButtonGroup gp1=new ButtonGroup();
			gp1.add(jb2);
			gp1.add(jb3);
	
		
		 pin=new JLabel("Existing Account:");
		pin.setFont(new Font("Raleway",Font.BOLD,20));
		pin.setBounds(100,590,200,30);
		add(pin);
		
		jb=new JRadioButton("Yes");
		jb.setBounds(300,590,100,30);
		add(jb);
		
		 jb1=new JRadioButton("No");
		jb1.setBounds(450,590,100,30);
		add(jb1);
		
		ButtonGroup gp=new ButtonGroup();
		gp.add(jb);
		gp.add(jb1);

		
	     
		
		 but=new JButton("Next");
		but.setFont(new Font("Railway",Font.BOLD,14));
		but.setBounds(800,590,80,30);
		but.addActionListener(this);
		add(but);;
		
		
		
		
		
		
		getContentPane().setBackground(Color.white);
		
		setSize(900,950);
		setLocation(350,10);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String srel=(String)rel.getSelectedItem();
		String scat=(String)cat.getSelectedItem();
		String sin=(String)in.getSelectedItem();
		String sed=(String)ed.getSelectedItem();
		String so=(String)o.getSelectedItem();
		
		
		
		String s=null;
		//ft2.getText();
		if(jb2.isSelected()) {
			s="Yes";
			
		}
		else if(jb3.isSelected())
		{
			s="No";
		}
		//String e=et2.getText();
		String pin=null;
		//et2.getText();
		if(jb.isSelected())
		{
			pin="Yes";
		}
		else if(jb1.isSelected())
		{
			pin="No";
		}
		
		 String a=at2.getText();
		String c=ct2.getText();
		
		 
		
		try {
			
			
				Conn c1=new Conn();
				String query ="insert into signupthree values('"+formno+"','"+srel+"','"+scat+"','"+sin+"','"+sed+"','"+so+"','"+a+"','"+c+"','"+s+"','"+pin+"')";
				c1.s.executeUpdate(query);
				
				setVisible(false);
				new SignUp3(formno).setVisible(true);
						
			
				
			}
		
			catch(Exception ex) {
			
				System.out.println(ex);
			}
		
		
	}

	public static void main(String[] args) {
		new SignUp2("");
		
		// TODO Auto-generated method stub

	}

}


