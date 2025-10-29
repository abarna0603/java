package stundent;
import java.sql.*;
import java.util.Scanner;
public class fetch {

 
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the name");
		 String name=sc.next();
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_db","root","root");
			PreparedStatement ps= c.prepareStatement("select * from student where name Like ?");
			ps.setString(1, "%"+name+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("name ="+rs.getString("name"));
				System.out.println("marks ="+rs.getDouble("marks"));
			
				
			}
			}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
			}

}
