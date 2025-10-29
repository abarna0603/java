import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addcookies")
public class AddCookies extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
    Cookies c1=new Cookies("email","tom@gmail.com");
    c1.setMaxAge(60*5);
    Cookies c2=new Cookies("pass","123");
    
    res.addCookie(c1);
    res.addCookie(c2);
    PrintWriter  out=res.getWriter();
    out.print("<h1>Cookies saved</h1>");
    
	}
}
