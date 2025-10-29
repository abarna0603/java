package Object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class mainclass {
   public static void main(String[] args) {
	   ApplicationContext context =new ClassPathXmlApplicationContext("Objectcon.xml");
		
		Object o=context.getBean("e1");
		
		Employee s=(Employee) o;
		  System.out.println(s);
}
}
