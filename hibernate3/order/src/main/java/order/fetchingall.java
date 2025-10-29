package order;



import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class fetchingall {
	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		
		Query q=em.createQuery("Select t From orderItem t");
		List<orderItem>list=q.getResultList();
		for(orderItem t:list) {
			System.out.println(t);
		}
		}


}
