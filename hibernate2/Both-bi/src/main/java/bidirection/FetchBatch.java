package bidirection;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchBatch {
 public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
    Batch b=em.find(Batch.class, "M19");
    List<Student>list=b.getStd();
    for(Student s:list) {
    System.out.println(s);
    

     }



}

}
