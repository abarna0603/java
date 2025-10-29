package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
public static void main(String []args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Engine e=new Engine();
	e.setEid(2);
	e.setNo("ABCDR464");
	e.setCc("235677cc");
	e.setType("ethanal");
	
	Car c=new Car();
	
	c.setCid(2);
	c.setBrand("Mahindra");
	c.setModel("Thar");
	c.setColor("Grey");
	c.setPrice(2500000);
	
	c.setEngine(e);
	
	et.begin();
	em.persist(e);
	em.persist(c);
	et.commit();
	System.out.println("Data saved");
	
	
}
}
