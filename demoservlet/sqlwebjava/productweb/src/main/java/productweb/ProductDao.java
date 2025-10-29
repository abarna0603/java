package productweb;

import java.sql.*;
public class ProductDao {

  static final String Driver="com.mysql.cj.jdbc.Driver";
  static final String url="jdbc:mysql://localhost:3306/product_db";
  static final String  userName="root";
  static final String  password="root";
  public static Connection establishConnection() throws Exception{
	  Class.forName(Driver);
	return DriverManager.getConnection(url,userName,password);
  }
  public void saveProduct(product p)throws Exception {
	Connection c= establishConnection();
	PreparedStatement ps=c.prepareStatement("insert into product values(?,?,?,?,?,?)");
	ps.setInt(1, p.getid());
	ps.setString(2,p.getcategory());
	ps.setString(3,p.getbrand());
	ps.setInt(4,p.getquantity());
	
	ps.setDouble(5,p.getprice());
	ps.setDouble(6,p.getrating());
	
	ps.executeUpdate();
	c.close();
	System.out.println("Data saved");
}
  public void deleteProduct(int id)throws Exception{
   Connection c=establishConnection();
   PreparedStatement ps=c.prepareStatement("delete from product where id =?");
   ps.setInt(1, id);
   
   ps.executeUpdate();
   c.close();
   System.out.println("Data deleted");
  }

  
public product fetchById(int id)throws Exception{
	Connection c=establishConnection();
	PreparedStatement ps=c.prepareStatement("select * from product where id=?");
	ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		int id1 =rs.getInt("id");
		String category =rs.getString("category");
		String brand=rs.getString(3);	
		 int quantity=rs.getInt(4);
		
		 Double price=rs.getDouble(5);
		 Double rating=rs.getDouble(6);
		 
		 product p=new product();
		 p.setid(id1);
		 p.setcategory(category);
		 p.setbrand(brand);
		 p.setquantity(quantity);
		 p.setprice(price);
		 p.setrating(rating);
		 return p;
		 
				 
	}
	return null;
}
}