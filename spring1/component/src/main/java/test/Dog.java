package test;

import org.springframework.stereotype.Component;

@Component("d")
public class Dog implements Animal {

	
	public void sound() {
		System.out.println("Barks");
		
	}

}
