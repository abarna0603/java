package delete;
import java.sql.*;
import java.util.Scanner;
public class datadelete {
       public static void main(String[] args) {
    	   Scanner s=new Scanner(System.in);
    	   System.out.println("Enter id");
    	   int id=s.nextInt();
    	  try {
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
    		  PreparedStatement ps=c.prepareStatement("delete from movie where id = ?");
    		  ps.setInt(1, id);
    		  ps.executeUpdate();
    		  System.out.println("Data Deleteted");
    	  }catch (ClassNotFoundException |  SQLException e) {
		   e.printStackTrace();
		}
    
    	   
       }
}
