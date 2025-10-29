package ManyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class remove {
	 public static void main(String[] args) {
		 EntityManagerFactory  emf =Persistence.createEntityManagerFactory("dev");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 Customer p=em.find(Customer.class, 6);
		

		 et.begin();
		
		 em.remove(p);
		 et.commit();
		 System.out.println("Data deleted");
		 
		 
		 
		
	}

}
