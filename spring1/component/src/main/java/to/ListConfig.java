package to;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ListConfig {
   @Bean
   @Qualifier("p1")
   public List<String> m1(){
	   ArrayList<String> al=new ArrayList<String>();
	   al.add("Jaddu");
	   al.add("Dhoni");
	   al.add("thilak");
	   return al;
   }
   @Bean
   @Qualifier("p2")
   public List<String> m2(){
	   ArrayList<String> al=new ArrayList<String>();
	   al.add("Aswin");
	   al.add("ruthuraj");
	   al.add("Dube");
	   return al;
   }
}
