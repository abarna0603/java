package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class AadhCard {
//  private static person Person = null;
@Id
  private long ano;
  private String address;
  private int pincode;
  private long phone;
  @OneToOne
  @JoinColumn
  private person Person;
public long getAno() {
	return ano;
}
public void setAno(long ano) {
	this.ano = ano;
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
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public person getPerson() {
	return Person;
}
public void setPerson(person person) {
	Person = person;
}
@Override
public String toString() {
	return "AadhCard [ano=" + ano + ", address=" + address + ", pincode=" + pincode + ", phone=" + phone + "]";
}

  
  
}
