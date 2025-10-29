package com;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private String dob;
	private int age;
	@OneToOne(mappedBy = " Person")
	private AadhCard aadharcard;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AadhCard getAadharcard() {
		return getAadharcard();
	}

	public void setAadharcard(AadhCard aadharcard) {
		this.aadharcard = aadharcard;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", age=" + age + "]";
	}
	
	

}
