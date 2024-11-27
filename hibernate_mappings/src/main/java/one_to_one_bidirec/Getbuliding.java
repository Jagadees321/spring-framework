package one_to_one_bidirec;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Getbuliding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("From Building");
		List<Building> bs=q.getResultList();
		
		for(Building b:bs) {
			System.out.println(b.getBid());
			System.out.println(b.getName());
			System.out.println(b.getFloor());
			System.out.println(b.getA().getAid());
			System.out.println(b.getA().getPin());
			System.out.println(b.getA().getCity());
			System.out.println("----------------------------------");

		}

	}

}
