package order;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class mainclass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		orderItem o=new orderItem();
		o.setProductName("suncreen");
		o.setQuantity(2);
		o.setPrice(400);
		
		orderItem o1=new orderItem();
		o1.setProductName("colgate");
		o1.setQuantity(3);
		o1.setPrice(600);
		
		orderItem o2=new orderItem();
		o2.setProductName("watch");
		o2.setQuantity(4);
		o2.setPrice(800);
		
		orderItem o3=new orderItem();
		o3.setProductName("milkbiscket");
		o3.setQuantity(6);
		o3.setPrice(200);

		orderItem o4=new orderItem();
		o4.setProductName("suncreen");
		o4.setQuantity(2);
		o4.setPrice(400);
		List<orderItem> list=new ArrayList<orderItem>();

		list.add(o);
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		
		
		orders t=new orders();
		t.setId(101);
		t.setOrderDate("12/09/2025");
		t.setTotalAmount(2000);
		t.setOrderiteam(list);
		et.begin();
		em.persist(t);
		em.persist(o);
		em.persist(o1);
		em.persist(o2);
		em.persist(o3);
		em.persist(o4);
		et.commit();

		System.out.println("DATA SAVED");


		
	}

}
