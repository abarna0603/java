package Let;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCLass {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Listcofig.xml");
		Batch b=(Batch)context.getBean("b1");
		System.out.println(b);
		
	}

}
