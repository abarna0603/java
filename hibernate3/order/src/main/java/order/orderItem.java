package order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class orderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int oid;
	 private String productName;
	 private int quantity;
	 private double price;
	 
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "orderItem [oid=" + oid + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	 
	 
}
