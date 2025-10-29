package test;

import org.springframework.stereotype.Component;

@Component("c")
public class Cat implements Animal{


	public void sound() {
		System.out.println("Meow!!!!");
		
	}
	

}
