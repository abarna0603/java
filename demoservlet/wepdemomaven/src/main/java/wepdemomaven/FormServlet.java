package wepdemomaven;
import javax.servlet.*;
import java.IOException;
import java.io.PrintWriter;
public class FormServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, java.io.IOException {
	       String Id=req.getParameter("id");
	       String Name=req.getParameter("name");
	       
	       PrintWriter out=res.getWriter();
	       String html="<html>"
	    		   +"<body>"
	    		   +" <h1>Id="+Id+"</h1><br><br>"
	    		   +"<h1>Name="+Name+"</h1><br><br>"
	    		   	+ "</body>"
	    		   	+ "</html>";
	       
		out.print(html);
	}

}
