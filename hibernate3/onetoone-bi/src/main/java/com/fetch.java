package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class fetch {
	 public static void main(String[] args) {
	      EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	      EntityManager em=emf.createEntityManager();
	      AadhCard a=em.find(AadhCard.class, 1);
	      person e=a.getPerson();
	      System.out.println(e);
	      System.out.println(a);
	    	
	    }
}
