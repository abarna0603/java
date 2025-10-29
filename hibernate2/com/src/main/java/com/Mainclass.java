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
				
				book p =new book();
				p.setId(3);
				p.setTitle("wings of fire an autobiography");
				p.setAuthor("A.P.J.Abdul kalam");
				p.setGenre("biography");
				p.setPublishedYear(2016);
				p.setPrice(2000);
				p.setAvailable(true);
				
				et.begin();
				em.persist(p);
				et.commit();
				
				System.out.println("Data Saved");

	}

}
