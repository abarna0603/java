package onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Passanger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	private String name;
	private String depature;
	private String arrival;
	private long phno;
	private String pnrno;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepature() {
		return depature;
	}
	public void setDepature(String depature) {
		this.depature = depature;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getPnrno() {
		return pnrno;
	}
	public void setPnrno(String pnrno) {
		this.pnrno = pnrno;
	}
	
	@Override
	public String toString() {
		return "Passanger [id=" + id + ", name=" + name + ", depature=" + depature + ", arrival=" + arrival + ", phno="
				+ phno + ", pnrno=" + pnrno + "]";
	}

	

}
