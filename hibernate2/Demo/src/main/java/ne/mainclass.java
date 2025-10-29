package ne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class mainclass {
	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
	     EntityTransaction et=em.getTransaction();
	     user u=new user();
		
		 u.setName("abarna");
		 u.setGender("female");
		 u.setDob("06/02/2003");
		
		passbook p=new passbook();
		p.setAcno(2341653999l);
		p.setAddress("chennai");
		p.setBankname("state bank of india");
		p.setBranch("ariyalur");
		p.setPincode(600086);
		p.setUser(u);
		 u.setPassbook(p);
		
		et.begin();
		em.persist(u);
		em.persist(p);
		et.commit();
		System.out.println("Data saved");
		}
		

}
