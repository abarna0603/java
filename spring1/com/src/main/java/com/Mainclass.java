package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
  public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("Configure.xml");
	User u=(User) context.getBean("u1");
	System.out.println(u);
}
}
