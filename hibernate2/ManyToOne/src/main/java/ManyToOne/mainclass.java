package ManyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class mainclass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b=new Bank();
		b.setName("SBI");
		b.setBranch("vadapalani");
		b.setAddress("vadapalani,chennai");
		b.setIFSC("va2407002");
		
		Customer c1=new Customer();
		c1.setName("abarna");
		c1.setGender("female");
		c1.setAddress("vadapalani");
		c1.setAccno(6345325456l);
		c1.setPhone(948951034l);
		c1.setBank(b);
		

		Customer c2=new Customer();
		c2.setName("iniya");
		c2.setGender("female");
		c2.setAddress("ariyalur");
		c2.setAccno(844525456l);
		c2.setPhone(43551034l);
		c2.setBank(b);
		

		Customer c3=new Customer();
		c3.setName("methun");
		c3.setGender("male");
		c3.setAddress("kaikadi");
		c3.setAccno(645225456l);
		c3.setPhone(545951034l);
		c3.setBank(b);
		
		et.begin();
		em.persist(b);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		et.commit();
		
		System.out.println("data saved");
	}

}
