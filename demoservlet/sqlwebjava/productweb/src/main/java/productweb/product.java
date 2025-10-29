package productweb;

public class product{
	private int id;
	private String  category;
	private String brand;
	private int quantity;
	private Double price;
	private Double rating;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity = quantity;
	}
	public double getprice() {
		return price;
	}
	public void setprice(Double price) {
		this.price = price;
	}
	public double getrating() {
		return rating;
	}
	public void setrating(Double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", category=" + category + ", brand=" + brand + ", quantity=" + quantity
				+ ", price=" + price + ", rating=" + rating + "]";
	}
	

	
	
	
	
}
//java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
