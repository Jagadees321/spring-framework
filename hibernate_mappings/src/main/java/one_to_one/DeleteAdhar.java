package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAdhar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Adhar a=em.find(Adhar.class, 101);
		Person p=em.find(Person.class, 201);
		p.setA(null);
		et.begin();
		em.merge(p);
		em.remove(a);
		et.commit();
		

	}

}
