package in;

import org.springframework.stereotype.Component;

@Component("a")
public class Student {
   public Student() {
	   System.out.println("student constructor called");
   }
   void m1() {
	   System.out.println("hello world");
   }
}
