package to;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(ListConfig.class);
		IPL l= (IPL) context.getBean("ipl");
		System.out.println(l);
	}
}
