package productweb;

import java.io.*;

import javax.servlet.*;

public class FetchByIdServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		ProductDao dao=new ProductDao();
		PrintWriter out=res.getWriter();
		try {
			product p=dao.fetchById(id);	
			if (p!=null) {
				out.print("<h1>"+p+"</h1>");
			}
			else {out.print("<h1>data not fount</h1>");
				
			}
			}catch(Exception e) {
				  out.print("<h1>"+e+"</h1>");
				  e.printStackTrace();
			  }
		}
}
	
	


