package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Delete {
	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		  person p=em.find(person.class, 1);
	      AadhCard a=p.getAadharcard();
	      et.begin();
	      em.remove(a);
	      em.remove(p);
	      et.commit();
		
		
	}

}
