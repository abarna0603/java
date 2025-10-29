package onetomany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class removePassanger {
 public static void main(String[] args) {
	 EntityManagerFactory  emf =Persistence.createEntityManagerFactory("dev");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	 Passanger p=em.find(Passanger.class, 4);
	 Train t=em.find(Train.class, 987654);
	 t.removepassanger(p);
	 et.begin();
	 em.merge(t);
	 em.remove(p);
	 et.commit();
	 System.out.println("Data deleted");
	 
	 
	 
	
}
}
