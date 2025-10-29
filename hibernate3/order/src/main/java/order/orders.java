package order;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class orders {
	@Id
	
	private int id;
	private String orderDate;
	private double totalAmount;
	
	@OneToMany
	private List<orderItem> orderiteam;
	public void addorderItem(orderItem p) {
		orderiteam.add(p);
	}
	public void removeorderiteam(orderItem p) {
		orderiteam.remove(p);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<orderItem> getOrderiteam() {
		return orderiteam;
	}

	public void setOrderiteam(List<orderItem> orderiteam) {
		this.orderiteam = orderiteam;
	}

	@Override
	public String toString() {
		return "orders [id=" + id + ", orderDate=" + orderDate + ", totalAmount=" + totalAmount + "]";
	}
	
	
	
	
	

}
