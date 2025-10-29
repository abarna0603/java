package ne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class passbook {
 
	 @Id
	  private long acno;
	 private String bankname;
	  private String address;
	  private int pincode;
	  private String branch;
	  @OneToOne
	  private user User;
	 public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public user getUser() {
		return User;
	}
	public void setUser(user user) {
		User = user;
	}
	@Override
	public String toString() {
		return "passbook [acno=" + acno + ", bankname=" + bankname + ", address=" + address + ", pincode=" + pincode
				+ ", branch=" + branch + "]";
	}
	  
}
