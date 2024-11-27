package com.org.food.app.dao;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.mysql.cj.Query;
import com.org.food.app.dto.Admin;
@Repository
public class Admindao {
	
static EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagga");
	
	
	public static boolean saveadmin(Admin e) {
		
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
	
	public static Admin fetchAdminbyEmailandpassword(String email,String password) {
		
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("SELECT a FROM Admin a WHERE a.email='"+email+"'And a.password='"+password+"'");
//		q.setParameter(1, email);
//		q.setParameter(2, password);
		return (Admin)q.getSingleResult();
	}
	

}
