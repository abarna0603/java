package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class update {
	 public static void main(String[] args) {
	    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
	    	book p=em.find(book.class, 1);
	    	if (p != null) {
				p.setPrice(3000);
				p.setPublishedYear(1985);
				et.begin();
				em.persist(p);
				et.commit();
				System.out.println("Data update");
			} else {
	           System.out.println("data not found");
			}
	    }
}
