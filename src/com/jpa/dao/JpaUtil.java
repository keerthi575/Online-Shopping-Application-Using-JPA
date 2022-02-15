package com.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static {
		factory = Persistence.createEntityManagerFactory("oracle");
	}
	
	public static EntityManager getEntityManager() {
		if(entityManager==null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;//persist,remove,find,merge
	}

}
