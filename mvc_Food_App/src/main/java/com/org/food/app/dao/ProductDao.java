package com.org.food.app.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.food.app.dto.Products;

//import com.jsp.foodapp.dto.Product;

@Repository
public class ProductDao {
	static EntityManagerFactory factory=Persistence.createEntityManagerFactory("jagga");
	
	public void saveProduct(Products p) {
		EntityManager em = factory.createEntityManager() ;
		EntityTransaction et = em.getTransaction() ;
		
		et.begin();
		em.persist(p);
		et.commit();
	}
	
	
	public List<Products> fetchAllProducts(){
		EntityManager em = factory.createEntityManager() ;
		Query query = em.createQuery("select p from Products p") ;
		return query.getResultList() ;
	}
	
	public Products findProductById(int id) {
		EntityManager em = factory.createEntityManager() ;
		return em.find(Products.class, id) ;
	}
	
	public void updateProduct(Products product) {
		EntityManager em = factory.createEntityManager() ;
		EntityTransaction et = em.getTransaction() ;
		
		et.begin();
		em.merge(product) ;
		et.commit();
	}
	
	public void deleteProductById(int id) {
		EntityManager em = factory.createEntityManager() ;
		EntityTransaction et = em.getTransaction() ;
		Products product = em.find(Products.class, id) ;
		et.begin();
		em.remove(product) ;
		et.commit();
	}
	
}
