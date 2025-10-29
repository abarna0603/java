package bidirection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Student s=em.find(Student.class, 1);
		Batch b=s.getB();
		System.out.println(s);
		System.out.println(b);
		
	}
    
}
