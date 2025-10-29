package cookies;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/addCookies")
public class AddCookies extends HttpServlet{


	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
//Create Cookies
		Cookie c1=new Cookie("email","tom@gmail.com");
		Cookie c2=new Cookie("pass","123");
//help us to save cookie in browser
		resp.addCookie(c1);
		resp.addCookie(c2);
		PrintWriter out=resp.getWriter();
		out.print("<h1>Cookies saved</h1>/");
		
		
	}
}
