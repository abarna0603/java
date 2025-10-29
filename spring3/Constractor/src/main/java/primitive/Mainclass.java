package primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
  public static void main(String[] args) {
	 ApplicationContext cotext=new ClassPathXmlApplicationContext("PerimitiveConf.xml");
	 bank b=(bank) cotext.getBean("b1");
	 System.out.println(b);
}
}
