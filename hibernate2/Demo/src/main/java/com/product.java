package com;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Prd_table")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
public class product {
    @Id
	private int pid;
    @Column(length=25)
	private String type;
    @Column(nullable = false,unique=true)
	private String brand;
    @Column(nullable = true)
	private double price;
    @Column(name = "pre_rating")
	private double rating;

	public int getPid() {
		return pid;
		
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "product [pid=" + pid + ", type=" + type + ", brand=" + brand + ", price=" + price + ", rating=" + rating
				+ "]";
	}

}
