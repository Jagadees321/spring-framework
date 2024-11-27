package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.Student;

public class FindStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagga");
		EntityManager em=emf.createEntityManager();
		
		Student s=em.find(Student.class, 2);
		System.out.println(s.getRoll());
		System.out.println(s.getName());
		System.out.println(s.getGender());
		System.out.println(s.getAge());
		

	}

}
