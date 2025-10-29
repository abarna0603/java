package in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Stuconfigure.xml");
		Student s=(Student) context.getBean("s1");
		System.out.println(s);
	}

}
