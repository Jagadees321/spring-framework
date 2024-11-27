package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.RequestMapping;

import com.org.dto.Register;

public class Regdao {
    static EntityManagerFactory emf=Persistence.createEntityManagerFactory("jagga");
	static EntityManager em=emf.createEntityManager();
	
	public static boolean saveemp(Register e) {
		
		try {
			
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
	
	public static List<Register> regview(){
		
		Query q=em.createQuery("select e from Register e");
		
		return q.getResultList();
		
	}

}
