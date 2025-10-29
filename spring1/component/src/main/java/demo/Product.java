package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p")
public class Product {
	@Value("1")
	private int id;
	@Value("laptop")
	private String name;
	@Value("15000")
	private double price;
	@Value("4.5")
	private double rating;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}
	
	
	
	

}
