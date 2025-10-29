package paf;

import java.util.List;
import java.util.Scanner;

import com.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByPrice {
	public static void main (String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting price");
	double st =sc.nextDouble();
	System.out.println("enter ending price");
	double end=sc.nextDouble();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select p from product p where p.price between ?1 and ?2");
	q.setParameter(1, st);
	q.setParameter(2, end);
	List<product>list=q.getResultList();
	for(product p:list) {
		System.out.println(p);
	}
	
			
	
		
	}

}
