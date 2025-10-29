package order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;



public class additeam {
	public static void main(String[] args) {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		orders t=em.find(orders.class, 101);
		orderItem p1=new orderItem();
		p1.setProductName("charger");
	
		p1.setQuantity(2);
		p1.setPrice(400);
	    t.addorderItem(p1);
		 
		 
		 et.begin();
		 em.persist(p1);
		 em.persist(t);
		 et.commit();
		 System.out.println("orderIteam added");
		
	}

}
