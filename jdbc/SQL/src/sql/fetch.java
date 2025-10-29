package sql;

import java.sql.*;

public class fetch {
	public static void main(String[]args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","SCOTT","TIGER");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select* from emp");
		while(rs.next()) {
			System.out.println("EMPNO="+rs.getInt(1));
			System.out.println("ENAME="+rs.getString(2));
			System.out.println("JOB="+rs.getString(3));
		}
	}catch(ClassNotFoundException|SQLException e) {
		 e.printStackTrace();
	}
}
}
