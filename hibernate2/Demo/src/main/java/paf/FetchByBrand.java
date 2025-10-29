package paf;

import java.util.Scanner;

import com.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByBrand {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter brand");
		String brand=sc.next();
	   EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
	   EntityManager em=emf.createEntityManager();
	   Query q=em.createQuery("select p from product p where p.brand=?1");
	   q.setParameter(1, brand);
	   Object o=q.getSingleResult();
	   product p=(product)o;
	   System.out.println(p);
	   
	}
	

}
