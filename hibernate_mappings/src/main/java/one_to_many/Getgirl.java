package one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import one_to_one_bidirec.Building;

public class Getgirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("From Girl");
		List<Girl> girl=q.getResultList();
		
		for(Girl g: girl) {
			System.out.println(g.getGid());
			System.out.println(g.getName());
			System.out.println(g.getAge());
			System.out.println("----------------------------------");
			for(Boy b:g.getB() ) {
				System.out.println(b.getBid());
				System.out.println(b.getName());
				System.out.println(b.getAge());
				System.out.println("----------------------------------");
			}
			System.out.println("----------------------------------");

		}

	}

}
