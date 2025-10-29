package wepdemomaven;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

public class StaticServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
			
			Date d= new Date();
			String html="<html>"
					+ " <body>"
					+ "<h1>current date and time="+d+"</h1>"
					+ "</body>"
				    + "</html>";
			PrintWriter out=res.getWriter();
			out.print(html);
			
		}
		
	
	}


