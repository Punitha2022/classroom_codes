package com.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.entities.Employee;

@Repository
@Transactional
public class EmployeeDao {
	public EmployeeDao() {
		System.out.println("EmployeeDao is instantiated");
	}
@PersistenceContext
EntityManager entityManager;
public Long saveEmployee(Employee e) {
	entityManager.persist(e);
	return e.getId();
}
public Employee getEmployee(long id) {
	return entityManager.find(Employee.class, id);
}
}
