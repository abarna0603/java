package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class fetch {
	 public static void main(String []args) {
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   book p=em.find(book.class,1);
		   if(p != null) {
			   System.out.println(p);
		   }
		   else {
			   System.out.println("Data Not Found");
		   }
	   }

}
