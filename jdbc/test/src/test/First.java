package test;

import java.sql.*;

public class First {
  public static void main(String [] args) {
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
		  Statement s = c.createStatement();
		  

		  s.executeUpdate("delete from movie where id=2");
		  System.out.println("data saved");
	  }catch(ClassNotFoundException | SQLException e) {
		  e.printStackTrace();
	  }
  }
}
