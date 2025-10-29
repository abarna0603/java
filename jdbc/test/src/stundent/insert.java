package stundent;
import java.sql.*;
import java.util.Scanner;
public class insert {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		int id=s.nextInt();
		
		System.out.println("Enter name");
		String name=s.next();
		
		System.out.println("Enter email");
		String email=s.next();
		
		System.out.println("Enter phone");
		int phone=s.nextInt();
		
		System.out.println("Enter batch");
		String batch=s.next();
		
		System.out.println("Enter degree");
		String degree=s.next();
		
		System.out.println("Enter stream");
		String stream=s.next();
		
		System.out.println("Enter marks");
		Double marks=s.nextDouble();
		try {	
			 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_db","root","root");
  		  PreparedStatement ps=c.prepareStatement("insert into student value(?,?,?,?,?,?,?,?)");
  		  ps.setInt(1, id);
  		  ps.setString(2,name);
  		  ps.setString(3,email);
  		  ps.setInt(4,phone);
  		  ps.setString(5,batch);
  		  ps.setString(6,degree);
  		  ps.setString(7,stream);
  		  ps.setDouble(8, marks);
  		
  		  ps.executeUpdate();
  		  System.out.println("Data Updated");
  		  
  		  
		} catch (ClassNotFoundException|SQLException e) {
		   e.printStackTrace();
		}
		
	}

}
	


