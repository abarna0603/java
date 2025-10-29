package test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class deleted {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	customer c=em.find(customer.class, 2);
	CreditCard d=c.getCreditcard();
	
	   
	      et.begin();
	      em.remove(c);
	      em.remove(d);
	      et.commit();
	   System.out.println("data delete");
	   
	   
	   
}
}
