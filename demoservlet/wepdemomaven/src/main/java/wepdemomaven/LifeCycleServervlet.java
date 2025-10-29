package wepdemomaven;
import javax.servlet.*;
import java.io.*;

public class LifeCycleServervlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	System.out.println("hi this is service methods");
		
	}
	public void init() {
		System.out.println("hi this is init method");
	}
	
   public void destroy() {
	   System.out.println("hi this is Destroy method");
   }
}
