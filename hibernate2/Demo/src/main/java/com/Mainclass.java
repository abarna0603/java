package com;
import jakarta.persistence.EntityManager;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
				EntityManager em=emf.createEntityManager();
				EntityTransaction et=em.getTransaction();
				
				//object
				
				product p =new product();
				p.setPid(6);
				p.setType("bag");
				p.setBrand("mona");
				p.setPrice(1000);
				p.setRating(4.5);
				
				et.begin();
				em.persist(p);
				et.commit();
				
				System.out.println("Data Saved");

	}

}
