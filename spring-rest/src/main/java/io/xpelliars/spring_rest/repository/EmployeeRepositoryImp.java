package io.xpelliars.spring_rest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.xpelliars.spring_rest.entity.Employee;

public class EmployeeRepositoryImp implements EmployeeRepository {
	
	@PersistenceContext
	private EntityManager em;
	
//	@Override
//	public List<Employee> findAll() {
//		return null;
//	}

	@Override
	public Employee findOne(String id) {
		return em.find(Employee.class, id);
	}
	
	@Override
	public Employee findByEmail(String email) {
		TypedQuery<Employee> query = em.createNamedQuery("Employee.findByEmail" , Employee.class);
		query.setParameter("pEmail", "upillai@xpres.com");
		List<Employee> employees = query.getResultList();
		if(employees != null && employees.size() == 1) {
			return employees.get(0);
		}
		return null;
	}
	
	@Override
	public Employee create(Employee emp) {
		em.persist(emp);
		return emp;
	}

	
	@Override
	public Employee update(Employee emp) {
		return em.merge(emp);
	}

	@Override
	public void delete(Employee emp) {
	}

	@Override
	public List<Employee> findAll() {
		return null;
	}

	

}
