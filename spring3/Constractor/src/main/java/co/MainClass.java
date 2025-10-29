package co;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("Confic.xml");
	 Product p=(Product) context.getBean("p1");
	 System.out.println(p);
	     
}
}
