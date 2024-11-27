package jointable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Emptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh1");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Emp e=new Emp();
		e.setName("allen");
		e.setSal(8893);
		
		et.begin();
		em.persist(e);
		em.detach(e);
		e.setName("King merge");
		em.merge(e);
		
		et.commit();
		

	}

}
