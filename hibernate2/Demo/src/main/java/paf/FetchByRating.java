package paf;

import java.util.List;
import java.util.Scanner;

import com.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByRating {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rating");
		double rating=sc.nextDouble();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select p from product p where p.rating>:rt");
		q.setParameter("rt", rating);
		List<product>l=q.getResultList();
		for(product p:l) {
			System.out.println(p);
		}
	}

}
