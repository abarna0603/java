package delete;
import java.sql.*;
import java.util.Scanner;
public class update {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		int id=s.nextInt();
		
		System.out.println("Enter villan");
		String villan=s.next();
		
		System.out.println("Enter Collection");
		double collection=s.nextDouble();
		try {	
		 Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
  		  PreparedStatement ps=c.prepareStatement("Update movie set collection= ?, villan =? where id=?");
  		  ps.setInt(3, id);
  		  ps.setDouble(1,collection);
  		  ps.setString(2,villan);
  		  ps.executeUpdate();
  		  System.out.println("Data Updated");
  		  
  		  
		} catch (  Exception e) {
		   e.printStackTrace();
		}
		
	}

}
