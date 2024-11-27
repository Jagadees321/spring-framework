package one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savegirlboy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Girl g=new Girl();
		g.setGid(101);
		g.setName("srujana");
		g.setAge(22);
		
		
		Boy b1=new Boy();
		b1.setBid(201);
		b1.setName("mohan");
		b1.setAge(23);
		
		Boy b2=new Boy();
		b2.setBid(202);
		b2.setName("chandu");
		b2.setAge(22);
		
		Boy b3=new Boy();
		b3.setBid(203);
		b3.setName("cp");
		b3.setAge(24);
		
		List<Boy> boys=new ArrayList<>();
		boys.add(b1);
		boys.add(b2);
		boys.add(b3);
		
		g.setB(boys);
		
		et.begin();
		em.persist(g);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();
		
		
	}

}
