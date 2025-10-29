package test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchbyAll {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	  customer c=em.find(customer.class, 1);
	  CreditCard d=c.getCreditcard();
	  
      System.out.println(c);
      System.out.println(d);
    	
}
}
