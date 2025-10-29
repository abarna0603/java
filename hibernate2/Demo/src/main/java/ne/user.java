package ne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long phone;

	private String name;
	private String gender;
	private String dob;
	@OneToOne
	private passbook Passbook;
	
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public passbook getPassbook() {
		return Passbook;
	}

	public void setPassbook(passbook passbook) {
		Passbook = passbook;
	}

	@Override
	public String toString() {
		return "user [phone=" + phone + ", name=" + name + ", gender=" + gender + ", dob=" + dob + "]";
	}
	
	

}
