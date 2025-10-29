package in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
  public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
	
	Student s=(Student) context.getBean("a");
	System.out.println(s);
}
}
