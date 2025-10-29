package ManyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddCus {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b=em.find(Bank.class, 1);
		Customer c1=new Customer();
		c1.setName("venky");
		c1.setGender("male");
		c1.setAddress("chennai");
		c1.setAccno(78625456l);
		c1.setPhone(89751034l);
		c1.setBank(b);
		
		et.begin();
		em.persist(c1);
		et.commit();
		System.out.println("data added");
	}

}
