package map;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HotelConfig {
	@Bean
	@Qualifier("nonveg")
	Map<String,Double> m1(){
		LinkedHashMap<String , Double> v=new LinkedHashMap<String, Double>();
		v.put("chicken Rice", 150.0);
		v.put("Chicken Briyani", 250.0);
		v.put("muton Briyani", 350.0);
		return v;
	}
	@Bean
	@Qualifier("veg")
	Map<String,Double> m2(){
		LinkedHashMap<String , Double> v=new LinkedHashMap<String, Double>();
		v.put("curd Rice", 50.0);
		v.put("veg Briyani", 100.0);
		v.put("Dosa", 120.0);
		return v;
	}
}
