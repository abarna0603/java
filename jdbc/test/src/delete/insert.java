package delete;
import java.sql.*;
import java.util.Scanner;

public class insert {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		int id=s.nextInt();
		
		System.out.println("Enter move name");
		String name=s.next();
		
		System.out.println("Enter hero");
		String hero=s.next();
		
		System.out.println("Enter heroine");
		String heroine=s.next();
		
		System.out.println("Enter villan");
		String villan=s.next();
		
		System.out.println("Enter directot");
		String directot=s.next();
		
		System.out.println("Enter collection");
		double collection=s.nextDouble();
		try {	
			 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
  		  PreparedStatement ps=c.prepareStatement("insert into movie value(?,?,?,?,?,?,?)");
  		  ps.setInt(1, id);
  		  ps.setString(2,name);
  		  ps.setString(3,hero);
  		  ps.setString(4,heroine);
  		  ps.setString(5,villan);
  		  ps.setString(6,directot);
  		  ps.setDouble(7,collection);
  		
  		  ps.executeUpdate();
  		  System.out.println("Data Updated");
  		  
  		  
		} catch (ClassNotFoundException|SQLException e) {
		   e.printStackTrace();
		}
		
	}

}


