package onetomany_bidirec;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPassenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("FROM Passenger");
		List<Passenger> ps=q.getResultList();
		
		for(Passenger p:ps) {
			System.out.println(p.getPid());
			System.out.println(p.getName());
			System.out.println(p.getGender());
			Bus b=p.getB();
			System.out.println(b.getBid());
			System.out.println(b.getNumber());
			System.out.println(b.getType());
			System.out.println("======================================================");
		}
	}

}
