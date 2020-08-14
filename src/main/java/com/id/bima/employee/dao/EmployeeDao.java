package com.id.bima.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.id.bima.employee.model.Employee;
import com.id.bima.employee.repository.EmployeeRepository;
import com.id.bima.employee.services.EmployeeService;


@Service
public class EmployeeDao implements EmployeeService{

	private EntityManagerFactory emf ;
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public List<Employee> listEmployee() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Employee",Employee.class).getResultList(); 
	}

	@Override
	public Employee saveOrUpdate(Employee employee) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee saved = em.merge(employee);
		
		em.getTransaction().commit();
		return saved;
	}

	@Override
	public Employee findById(Long id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Employee.class, id);
		
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Employee.class, id));
		em.getTransaction().commit();
		
	}

	@Override
	public DataTablesOutput<Employee> findForDataTable(@Valid DataTablesInput input) {
		// TODO Auto-generated method stub
		return employeeRepo.findAll(input);
	}

}
