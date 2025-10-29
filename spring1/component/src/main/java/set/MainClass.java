package set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;






public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(SetConfig.class);
		 Ipl l= ( Ipl) context.getBean("ipl");
		System.out.println(l);
	}
}
