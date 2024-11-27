package many_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagadeesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setName("sehwag");
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setName("pant");
		
		Student s3=new Student();
		s3.setSid(3);
		s3.setName("yuvi");
		
		Subject sb1=new Subject();
		sb1.setId(11);
		sb1.setName("java");
		
		Subject sb2=new Subject();
		sb1.setId(12);
		sb1.setName("sql");
		
		Subject sb3=new Subject();
		sb1.setId(13);
		sb1.setName("react");
		
		List<Subject> sub1=new ArrayList<>();
		sub1.add(sb1);
		sub1.add(sb2);
		
		List<Subject> sub2=new ArrayList<>();
		sub2.add(sb2);
		sub2.add(sb3);
		
		List<Subject> sub3=new ArrayList<>();
		sub3.add(sb1);
		
		
		List<Student> st1=new ArrayList<>();
		st1.add(s1);
		st1.add(s3);
		
		List<Student> st2=new ArrayList<>();
		st2.add(s1);
		st2.add(s2);
		
		List<Student> st3=new ArrayList<>();
		st3.add(s2);
		
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(sb1);
		em.persist(sb2);
		em.persist(sb3);
		et.commit();
		
		

	}

}
