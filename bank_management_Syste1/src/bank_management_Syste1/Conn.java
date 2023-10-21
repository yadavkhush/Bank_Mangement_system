package bank_management_Syste1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conn {
	Connection c1;
	Statement s;
	public Conn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank4","root","root");
			s=c1.createStatement();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
