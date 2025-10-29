package onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Train {
	@Id
	private int tno;
	private String name;
	private String timing;
	private int capacity;
	@OneToMany
	private List<Passanger> passanger;
	
	
	public void addPassanger(Passanger p) {
		passanger.add(p);
	}
	public void removepassanger(Passanger p) {
		passanger.remove(p);
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Passanger> getPassanger() {
		return passanger;
	}
	public void setPassanger(List<Passanger> passanger) {
		this.passanger = passanger;
	}
	@Override
	public String toString() {
		return "Train [tno=" + tno + ", name=" + name + ", timing=" + timing + ", capacity=" + capacity + "]";
	}
	
   
}
