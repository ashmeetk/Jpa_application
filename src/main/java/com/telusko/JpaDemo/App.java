package com.telusko.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	Customer a = new Customer();
    	a.setId(4);
    	a.setfName("Ashmeet");
    	a.setlName("Kaur");
    	
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
    	System.out.println(a);
    	
    	//Customer a = em.find(Customer.class,123);	
    	
    	//em.persist(a);
    	
    	//System.out.println(a);
    }
}
		