package set;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SetConfig {
	  @Bean
	   @Qualifier("p1")
	   public Set<String> m1(){
		   HashSet<String> al=new HashSet<String>();
		   al.add("Jaddu");
		   al.add("Dhoni");
		   al.add("thilak");
		   return al;
	   }
	   @Bean
	   @Qualifier("p2")
	   public Set<String> m2(){
		   HashSet<String> al=new HashSet<String>();
		   al.add("Aswin");
		   al.add("ruthuraj");
		   al.add("Dube");
		   return al;
	   }

}
