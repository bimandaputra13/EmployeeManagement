package com.id.bima.employee.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import com.id.bima.employee.model.Employee;

public interface EmployeeRepository extends DataTablesRepository<Employee, Long> {

}
