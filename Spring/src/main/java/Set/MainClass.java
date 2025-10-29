package Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Setconfig.xml");
		hotel h=(hotel) context.getBean("h1");
		System.out.println(h);
	}

}
