package productweb;

import java.io.IOException;
import java.io.*;

import javax.servlet.*;

public class ProductServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
	 int id =Integer.parseInt(req.getParameter("id"));
	 String category=req.getParameter("category");
	 String brand=req.getParameter("brand");
	 int quantity=Integer.parseInt(req.getParameter("quantity"));
	 Double price=Double.parseDouble(req.getParameter("price"));
	 Double rating=Double.parseDouble(req.getParameter("rating"));
	 
	 product p= new product();
	 
	 p.setid(id);
	 p.setcategory(category);
	 p.setbrand(brand);
	 p.setquantity(quantity);
	 p.setprice(price);
	 p.setrating(rating);
	 
	 ProductDao dao=new ProductDao();
	 PrintWriter out=res.getWriter();
	  try {
		  dao.saveProduct(p);
		  out.print("<h1>Data saved</h1>");
	  }catch(Exception e) {
		  out.print("<h1>"+e+"</h1>");
		  e.printStackTrace();
	  }
		
	}
	

}
