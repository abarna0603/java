package bidirection;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Batch {
	@Id
	private String bcode;
	private String Subject;
	private String Timing;
	private  String Trainer;
	private int noStudent;
	@OneToMany(mappedBy = "b",cascade =CascadeType.ALL)
	private List<Student>std;
	
	
	public void addStudent(Student s) {
		std.add(s);
		s.setB(this);
		}
		
		public void removeStudent(Student s) {
			std.remove(s);
			s.setB(null);
		}
	
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getTiming() {
		return Timing;
	}
	public void setTiming(String timing) {
		Timing = timing;
	}
	public String getTrainer() {
		return Trainer;
	}
	public void setTrainer(String trainer) {
		Trainer = trainer;
	}
	public int getNoStudent() {
		return noStudent;
	}
	public void setNoStudent(int noStudent) {
		this.noStudent = noStudent;
	}
	public List<Student> getStd() {
		return std;
	}
	public void setStd(List<Student> std) {
		this.std = std;
	}
	

}
