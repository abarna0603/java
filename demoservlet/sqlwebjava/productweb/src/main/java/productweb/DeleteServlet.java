package productweb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class DeleteServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		ProductDao dao=new ProductDao();
		PrintWriter out=res.getWriter();
	}
	

}
