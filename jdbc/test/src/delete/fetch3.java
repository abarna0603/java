package delete;
import java.sql.*;
public class fetch3 {
	private static String  collection;

	public static void main(String[]args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
			PreparedStatement ps= c.prepareStatement("select * from movie where villan Like ?");
			ps.setString(1, "%"+ villan+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("villan ="+rs.getString("villan"));
				System.out.println("hero ="+rs.getString("hero"));
			
				
			}
			}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
			}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
