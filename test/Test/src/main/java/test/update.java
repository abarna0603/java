package test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class update {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		   customer c  =em.find(customer.class, 1);
		   CreditCard d=c.getCreditcard();
		
		    d.setExpirydate("09/25");
		    et.begin();
		    em.merge(d);
		    et.commit();
			
			
			System.out.println("data update");
	}

}
