package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Engine {
@Id
private int eid;
private String no;
private String cc;
private String type;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String getCc() {
	return cc;
}
public void setCc(String cc) {
	this.cc = cc;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


}
