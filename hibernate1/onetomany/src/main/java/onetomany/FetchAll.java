package onetomany;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAll {
	public static void main(String[]args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	
	
	Query q=em.createQuery("Select t From Train t");
	List<Train>list=q.getResultList();
	for(Train t:list) {
		System.out.println(t);
	}
	}
	}
