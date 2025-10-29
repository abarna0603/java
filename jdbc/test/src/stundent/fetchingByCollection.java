package stundent;
import java.sql.*;
import java.util.Scanner;
public class fetchingByCollection {
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter start");
		 String st=sc.next();
		 System.out.println("enter end");
		 String end=sc.next();
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
			PreparedStatement ps= c.prepareStatement("select * from movie where collection between ? and ?");
			ps.setDouble(1, st);
			ps.setDouble(1, end);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("name ="+rs.getString(""));
				System.out.println("marks ="+rs.getDouble("marks"));
			
				
			}
			}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
			}

}

}
