package execute;

import java.sql.*;


public class create {
	public static void main(String []args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_db","root","root");
			Statement s=c.createStatement();
			s.execute()
		} catch (ClassNotFoundException|SQLException e) {
			   e.printStackTrace();
			}
			
		
	}

}
