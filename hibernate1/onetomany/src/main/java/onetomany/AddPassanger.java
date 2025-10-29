package onetomany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddPassanger {
    public static void main(String[] args) {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Train t=em.find(Train.class, 987654);
		Passanger p1=new Passanger();
		p1.setName("baranika");
		p1.setDepature("chennai");
		p1.setArrival("GOV");
		p1.setPhno(653276243l);
		p1.setPnrno("AAGDLAD63");
		 t.addPassanger(p1);
		 
		 
		 et.begin();
		 em.persist(p1);
		 em.persist(t);
		 et.commit();
		 System.out.println("Passanger added");
		
	}

}
