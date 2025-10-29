package in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("empconfigh.xml");
		employee e=(employee)context.getBean("e1");
		System.out.println(e);
	}

}
