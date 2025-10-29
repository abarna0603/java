package order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class updateorders {
	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
       orders t=em.find(orders.class, 101);
     t.setOrderDate("13/09/2025");
    et.begin();
    em.persist(t);
    et.commit();
    System.out.println("Data update");
}

}
