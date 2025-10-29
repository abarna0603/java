package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class mainclass {
	public static void main(String[]args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

Passanger p=new  Passanger();
p.setName("pavan");
p.setDepature("chennai");
p.setArrival("bangalure");
p.setPhno(756364866l);
p.setPnrno("WQTYKTID8");

Passanger p1=new  Passanger();
p1.setName("kavan");
p1.setDepature("chennai");
p1.setArrival("baure");
p1.setPhno(75768964466l);
p1.setPnrno("OUTYKTID8");


Passanger p2=new  Passanger();
p2.setName("kfvan");
p2.setDepature("chennai");
p2.setArrival("giov");
p2.setPhno(636443866l);
p2.setPnrno("KLTYKTID8");

List<Passanger> list=new ArrayList<Passanger>();

list.add(p);
list.add(p1);
list.add(p2);

Train t=new Train();
t.setTno(987654);
t.setCapacity(1000);
t.setName("gov expres");
t.setPassanger(list);
et.begin();
em.persist(t);
em.persist(p);
em.persist(p1);
em.persist(p2);
et.commit();

System.out.println("DATA SAVED");



	}

}
