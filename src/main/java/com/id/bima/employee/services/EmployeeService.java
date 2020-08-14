package com.id.bima.employee.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.id.bima.employee.model.Employee;

public interface EmployeeService {
	
	List<Employee> listEmployee();
	
	Employee saveOrUpdate(Employee employee);
	
	void delete(Long id);

	Employee findById(Long id);

	DataTablesOutput<Employee> findForDataTable(@Valid DataTablesInput input);
}
