package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
     public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(proConf.class);
		Product p=(Product)context.getBean("p");
		System.out.println(p);
	}
}
