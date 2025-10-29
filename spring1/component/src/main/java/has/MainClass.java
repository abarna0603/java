package has;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
  public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(StConfig.class);
	Student s=(Student) context.getBean("s");
	System.out.println(s);
	
}
}
