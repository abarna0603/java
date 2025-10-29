package com;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class mainclass {
	public static void main(String[]args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    AadhCard a=new AadhCard();
    a.setAno(14344647497l);
	a.setAddress("chennai");
	a.setPincode(234553);
	a.setPhone(259934695l);
	person p=new person();
	p.setName("abarna");
	p.setGender("female");
	p.setDob("17/04/2002");
	p.setAge(22);
	p.setAadharcard(a);
	a.setPerson(p);
	
	et.begin();
	em.persist(p);
	em.persist(a);
	et.commit();
	System.out.println("Data saved");
	}
	

}
