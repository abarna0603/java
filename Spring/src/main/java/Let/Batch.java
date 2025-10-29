package Let;

import java.util.List;

public class Batch {
	String bcode;
	String subject;
	String trainer;
	String timing;
	List<String> stdNumber;
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public List<String> getStdNumber() {
		return stdNumber;
	}
	public void setStdNumber(List<String> stdNumber) {
		this.stdNumber = stdNumber;
	}
	@Override
	public String toString() {
		return "Batch [bcode=" + bcode + ", subject=" + subject + ", trainer=" + trainer + ", timing=" + timing
				+ ", stdNumber=" + stdNumber + "]";
	}
	

}
