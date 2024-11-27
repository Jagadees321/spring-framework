
package com.org.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.RequestMapping;

import com.org.dto.Employee;

public class Empdao {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagga");
	
	
	public static boolean saveemp(Employee e) {
		
		try {
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(e);
			et.commit();
			return true;
			
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}
	
	public static List<Employee> getallemployees(){
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("SELECT e FROM Employee e");
		return q.getResultList();
	}
	
	
	public static boolean updateemp(Employee e) {
		try {
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			et.begin();
			em.merge(e);
			et.commit();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public static boolean deleteemp(int id) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=em.find(Employee.class, id);
		if(e==null) {
			return false;
		}
		else {
			et.begin();
			em.remove(e);
			et.commit();
			return true;
		}
	}
	
	public static Employee findbyid(int id) {
		EntityManager em=emf.createEntityManager();
		return em.find(Employee.class, id);
	}
}
