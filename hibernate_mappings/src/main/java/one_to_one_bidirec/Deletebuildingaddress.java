package one_to_one_bidirec;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deletebuildingaddress {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Building b=em.find(Building.class,101 );
		Address a=em.find(Address.class, 201);
		
		b.setA(null);
		a.setB(null);
		et.begin();
		em.merge(b);
		em.merge(a);
		em.remove(b);
		em.remove(a);
		et.commit();

	}

}
