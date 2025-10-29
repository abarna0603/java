package order;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;


public class fetchall {
	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		
		Query q=em.createQuery("Select t From orders t");
		List<orders>list=q.getResultList();
		for(orders t:list) {
			System.out.println(t);
		}
		}

}
