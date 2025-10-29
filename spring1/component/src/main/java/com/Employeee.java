package com;

import org.springframework.stereotype.Component;

@Component("e")
public class Employeee{
	Employeee(){
		System.out.println("i am component");
	}
     void m1(){
	  System.out.println("hello world");
  }
}