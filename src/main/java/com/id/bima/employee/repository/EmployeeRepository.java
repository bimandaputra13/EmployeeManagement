package com.id.bima.employee.repository;

import com.id.bima.employee.model.Employee2;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.Query;

import com.id.bima.employee.model.Employee;

public interface EmployeeRepository extends DataTablesRepository<Employee, Long> {

}
