package test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		customer c=new customer();
		c.setId(2);
		c.setName("rani");
		c.setEmail("rani@123");
		
		CreditCard d=new CreditCard();
		d.setCid(102);
		d.setCardnumber(321456987l);
		d.setExpirydate("10/25");
		d.setCvv(976);
		d.setCustomer(c);
		c.setCreditcard(d);
		
		et.begin();
		em.persist(c);
		em.persist(d);
		et.commit();
		
		System.out.println("data saved");
	}

}
