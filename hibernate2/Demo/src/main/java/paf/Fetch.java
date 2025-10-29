package paf;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select p.type,p.brand,p.price from product p");
		List<Object[]>l=q.getResultList();
	   for(Object arr[]:l) {
		   System.out.println("Type= "+ arr[0]+",Brand="+arr[1]+",Price="+arr[2]);
	   }
	}

}
