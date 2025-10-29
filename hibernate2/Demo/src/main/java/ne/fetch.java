package ne;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class fetch {
	 public static void main(String[] args) {
	    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	    	EntityManager em=emf.createEntityManager();
	      user u=em.find(user.class, 1);
	      passbook p=u.getPassbook();
	      System.out.println(p);
	      System.out.println(u);
	    	
	    }
}
