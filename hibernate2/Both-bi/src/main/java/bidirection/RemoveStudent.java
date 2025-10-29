package bidirection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class RemoveStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Batch b=em.find(Batch.class, "M19");
		Student s=em.find(Student.class, 4);
		b.removeStudent(s);
		et.begin();
		em.merge(b);
		em.remove(s);
		et.commit();
		
	}

}
