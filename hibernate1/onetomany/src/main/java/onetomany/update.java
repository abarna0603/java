package onetomany;

import org.hibernate.query.Query;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class update {
	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
       Train t=em.find(Train.class, 987654);
       t.setTiming("10.00AM");
    et.begin();
    em.persist(t);
    et.commit();
    System.out.println("Data update");
}
}