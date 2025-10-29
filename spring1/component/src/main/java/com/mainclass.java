package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainclass {
	public static void main(String[] args) {
		  ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		  Employeee em= (Employeee) context.getBean("e");
		  System.out.println(em);
	}

}
