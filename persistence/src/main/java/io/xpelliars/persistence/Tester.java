package io.xpelliars.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Tester {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		
		EntityManager em = emf.createEntityManager();
		
		/*
		Employee employee1 = new Employee();
		
		employee1.setFirstName("Unni1");
		employee1.setLastName("Pillai1");
		employee1.setEmail("upillai@xpres.com");
		employee1.setCity("Dallas1");
		employee1.setState("TX1");
		employee1.setZip("68230");
		
		Employee employee2 = new Employee();
		
		employee2.setFirstName("Unni2");
		employee2.setLastName("Pillai2");
		employee2.setEmail("upillai@press.com");
		employee2.setCity("Dallas2");
		employee2.setState("TX2");
		employee2.setZip("6823021");
		//Insert INTO
		em.getTransaction().begin();
		em.persist(employee1);
		em.persist(employee2);
		em.getTransaction().commit();
		
		
		// Find employee
		Employee existing = em.find(Employee.class, "c27a7cb3-338b-430d-8e51-7f10cf51ebfc");
		System.out.println(existing);
		
		
		// Update employee
		Employee existing = em.find(Employee.class, "c27a7cb3-338b-430d-8e51-7f10cf51ebfc");
		existing.setFirstName("U");
		
		em.getTransaction().begin();
		em.merge(existing);
		em.getTransaction().commit();
		
		
		// Delete
				Employee existing = em.find(Employee.class, "c27a7cb3-338b-430d-8e51-7f10cf51ebfc");
				
				em.getTransaction().begin();
				em.remove(existing);
				em.getTransaction().commit();
		
		
		// FIND ALL
		TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e ORDER BY e.email ASC ", Employee.class);
		List<Employee> employees = query.getResultList();
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		// FIND BY EMAIL
		TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e WHERE e.email=:pEmail", Employee.class);
				query.setParameter("pEmail", "upillai@xpres.com");
				List<Employee> employees = query.getResultList();
				for(Employee employee : employees) {
					System.out.println(employee);
				}
		*/
		// NAMED QUERY
				TypedQuery<Employee> query = em.createNamedQuery("Employee.findByEmail" , Employee.class);
						query.setParameter("pEmail", "upillai@xpres.com");
						List<Employee> employees = query.getResultList();
						for(Employee employee : employees) {
							System.out.println(employee);
						}
		
		
		em.close();
		emf.close();
	}
}
