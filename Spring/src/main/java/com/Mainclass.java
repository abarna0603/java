package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
//		spring container
		ApplicationContext context =new ClassPathXmlApplicationContext("configure.xml");
		
		Object o=context.getBean("s1");
		
		Student s=(Student) o;
		s.m1();
		
		
	}
}
