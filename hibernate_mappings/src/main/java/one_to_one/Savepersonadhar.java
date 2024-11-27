package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savepersonadhar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Adhar a=new Adhar();
		a.setAid(103);
		a.setAno(1234567833);
		a.setCity("bangalore");
		
		Person p=new Person();
		p.setPid(203);
		p.setName("jagga");
		p.setGender("male");
		p.setA(a);
		
		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();

	}

}
