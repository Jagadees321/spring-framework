package one_to_one_bidirec;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savebuildingaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Building b=new Building();
		b.setBid(103);
		b.setName("jsp");
		b.setFloor(2);
		
		Address a=new Address();
		a.setAid(203);
		a.setPin(517313);
		a.setCity("blr");
		
		b.setA(a);
		a.setB(b);
		
		et.begin();
		em.persist(b);
		em.persist(a);
		et.commit();

	}

}
