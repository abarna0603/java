package bidirection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddStudent {
	public static void main(String[] args) {
		
   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
   EntityManager em=emf.createEntityManager();
   EntityTransaction et=em.getTransaction();
   
   Batch b=em.find(Batch.class, "M19");
   Student s1=new Student();
   s1.setName("rani");
	s1.setGender("FEMALE");
	s1.setPhone(965452387l);
	s1.setEmail("rania@123");
	
	b.addStudent(s1);
	et.begin();
	em.persist(s1);
	em.merge(b);
	et.commit();

	}
}
