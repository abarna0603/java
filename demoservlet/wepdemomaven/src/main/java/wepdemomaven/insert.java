package wepdemomaven;

import javax.servlet.*;
import java.IOException.*;
import java.io.*;

public class insert extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	  String uname=req.getParameter("username");
	  String email=req.getParameter("email");
	  String pass=req.getParameter("pass");
	  String ph=req.getParameter("phone");
	  PrintWriter out=res.getWriter();
	  out.println("<h1>UserName="+uname+"</h1>");
	  out.println("<h1>email="+email+"</h1>");
	  out.println("<h1>Password="+pass+"</h1>");
	  out.println("<h1>Phone number="+ph+"</h1>");
	  
		
	}
	

}
