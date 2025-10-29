package setCon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainclass {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("setcon.xml");
		set h=(set) context.getBean("h1");
		System.out.println(h);
	}

}
