package dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class Studentnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagga");
		EntityManager em=emf.createEntityManager();
		
		String hql1="SELECT s.name,s.roll From Student s";
		
		
		Query q=em.createQuery(hql1);
		List<Object[]> students=q.getResultList();
		for(Object[] s:students) {
			List li=Arrays.asList(s);
			System.out.println(li);
			//System.out.println(s[0]);
			//System.out.println(s[1]);
			System.out.println("========================================");
		}

	}

}
