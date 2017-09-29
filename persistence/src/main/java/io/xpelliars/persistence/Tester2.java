package io.xpelliars.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		
		EntityManager em = emf.createEntityManager();
		
		User user = new User();
		
		user.setFirstName("Unni1");
		user.setLastName("Pillai1");
		user.setEmail("upillai@xpres.com");
		
		Address address = new Address();
		address.setCity("Chicago");
		address.setState("IL");
		address.setZip("60544");
		
		
		
		em.getTransaction().begin();
		em.persist(address);
		user.setAddress(address);
		em.persist(user);
		em.getTransaction().commit();
		
		em.close();
//		emf.close();
	}
}
