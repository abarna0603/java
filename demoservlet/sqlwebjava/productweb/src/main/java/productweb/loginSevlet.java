package productweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class loginSevlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter out=resp.getWriter();
	  if (email.equals("tom@gmail.com")) {
		if (password.equals("123")) {
			HttpSession session=req.getSession(true);
			session.setAttribute("email", email);
			resp.sendRedirect("home.jsp");
		}else {
		    req.setAttribute("errormessage","Incorrect password");
		    RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
		    dispatcher.include(req, resp);
		    
		}
		
	}	else {
		req.setAttribute("errorMessage","Email not found");
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
		dispatcher.include(req, resp);
		
	}
	}

}
