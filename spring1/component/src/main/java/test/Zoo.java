package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("z")
public class Zoo {
	
   @Autowired
   @Qualifier("c")
   private Animal animal;
   
   @Autowired
   @Qualifier("d")
   private Animal animal2;
   
   public void getAnimalSound() {
	   animal.sound();
	   animal2.sound();
   }


  
   
}
