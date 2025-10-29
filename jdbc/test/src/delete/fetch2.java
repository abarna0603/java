package delete;
import java.sql.*;
public class fetch2 {
	public static void main(String[]args) {
			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
				Statement s= c.createStatement();
				ResultSet rs=s.executeQuery("select * from movie");
				while(rs.next()) {
				System.out.println("ID="+rs.getInt(1));
				System.out.println("NAME="+rs.getString(2));
				System.out.println("HERO="+rs.getString(3));
				System.out.println("HEROINE="+rs.getString(4));
				System.out.println("VILLAN="+rs.getString(5));
				System.out.println("DIRECTOR="+rs.getString("directot"));	
				System.out.println("COLLECTION="+rs.getDouble("collection"));
				}
			}
				
			catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();
			}
		}
		

	}


