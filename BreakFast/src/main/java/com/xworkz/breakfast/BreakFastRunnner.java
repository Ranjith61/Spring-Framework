package com.xworkz.breakfast;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BreakFastRunnner {
public static void main(String[] args) {
	
EntityManagerFactory emf=Persistence.createEntityManagerFactory("breakfast-connection");
EntityManager em=emf.createEntityManager();

BreakFastDto dto= new BreakFastDto(4, "EggPups", 66, 1, "South-Indian");
	
	EntityTransaction transaction=em.getTransaction();
	transaction.begin();
	
	em.persist(dto);

	transaction.commit();
	em.close();
	emf.close();
}
	
}
