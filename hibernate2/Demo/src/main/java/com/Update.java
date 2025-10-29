package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {
    public static void main(String[] args) {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
    	product p=em.find(product.class, 1);
    	if (p != null) {
			p.setPrice(500000);
			p.setRating(4);
			et.begin();
			em.persist(p);
			et.commit();
			System.out.println("Data update");
		} else {
           System.out.println("data not found");
		}
    }
}
