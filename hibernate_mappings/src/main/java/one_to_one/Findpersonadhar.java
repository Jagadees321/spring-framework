package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Findpersonadhar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 202);
		System.out.println("============================");
		System.out.println(p.getPid());
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getA().getAid());
		System.out.println(p.getA().getAno());
		System.out.println(p.getA().getCity());
		System.out.println("===============================");
		
		Adhar a=em.find(Adhar.class, 101);
		System.out.println(a.getAid());
		System.out.println(a.getAno());
		System.out.println(a.getCity());
		System.out.println("-------------------------------");

	}

}
