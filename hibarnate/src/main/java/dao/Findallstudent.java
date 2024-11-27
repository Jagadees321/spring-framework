package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class Findallstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagga");
		EntityManager em=emf.createEntityManager();
		
		String hql1="FROM Student";
		String hql2="FROM Student s";
		String hql3="SELECT s FROM Student s";
        
		Query q=em.createQuery(hql1);
		List<Student> students=q.getResultList();
		System.out.println("----------------------------------------------------------");
		for(Student s:students) {
			System.out.println(s.getRoll());
			System.out.println(s.getName());
			System.out.println(s.getGender());
			System.out.println(s.getAge());
			System.out.println("----------------------------------------------------------");
		}

	}

}
