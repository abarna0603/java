package sql;

import java.sql.*;

public class create {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
	}

}
