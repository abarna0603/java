package test;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CreditCard {
	@Id
	private int cid;
	private long cardnumber;
	private String expirydate;
	private int cvv;
	@OneToOne(mappedBy = "creditcard",cascade = CascadeType.ALL )
	private customer Customer;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public customer getCustomer() {
		return Customer;
	}
	public void setCustomer(customer customer) {
		Customer = customer;
	}
	@Override
	public String toString() {
		return "CreditCard [cid=" + cid + ", cardnumber=" + cardnumber + ", expirydate=" + expirydate + ", cvv=" + cvv
				+ "]";
	}

	

}
