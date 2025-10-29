package order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;



public class removeiteam {
	 public static void main(String[] args) {
		 EntityManagerFactory  emf =Persistence.createEntityManagerFactory("dev");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 orderItem p=em.find(orderItem.class, 4);
		 orders t=em.find(orders.class, 101);
		 t.removeorderiteam(p);
		 et.begin();
		 em.merge(t);
		 em.remove(p);
		 et.commit();
		 System.out.println("Data deleted");
		 
		 
		 
		
	}

}
