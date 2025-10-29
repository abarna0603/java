package bidirection;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Batch b=new Batch();
		b.setBcode("M19");
		b.setSubject("ADV JAVA");
		b.setTiming("12.00PM");
		b.setTrainer("SURIYA");
		b.setNoStudent(150);
		
		
		Student s=new Student();
		s.setName("Abarna");
		s.setGender("FEMALE");
		s.setPhone(967452387l);
		s.setEmail("abarna@123");
		s.setB(b);
		Student s1=new Student();
		s1.setName("Baranika");
		s1.setGender("FEMALE");
		s1.setPhone(876552387l);
		s1.setEmail("baranika@123");
		s1.setB(b);
		Student s2=new Student();
		s2.setName("Thenu");
		s2.setGender("FEMALE");
		s2.setPhone(45352387l);
		s2.setEmail("thenu@123");
		s2.setB(b);
		
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		
		b.setStd(list);
		
		et.begin();
		em.persist(b);
		em.persist(s);
		em.persist(s1);
		em.persist(s2);
		et.commit();
		System.out.println("data saved");
		
	}

}
