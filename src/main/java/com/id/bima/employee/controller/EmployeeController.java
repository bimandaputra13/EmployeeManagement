package com.id.bima.employee.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.id.bima.employee.model.Employee;
import com.id.bima.employee.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	@RequestMapping("/employee")
	public String ListEmployee(Model model){
		
		model.addAttribute("employee",employeeService.listEmployee());
		return"employee";
	}

	@RequestMapping("/employee/about")
	public String viewAbout(Model model){

		return"About";
	}
	
	@RequestMapping( value= "/employee/create", method = RequestMethod.GET)
	public String createView(Model model){
		
		model.addAttribute("employee", new Employee());
		return"EmployeeInput";
	}
	
	@RequestMapping( value= "/employee/create", method = RequestMethod.POST)
	public String createSave(Model model, Employee employee){
		
		model.addAttribute("employee", employeeService.saveOrUpdate(employee));
		return"redirect:/employee";
	}
	
	@RequestMapping( value= "/employee/edit/{id}", method = RequestMethod.GET)
	public String editView(@PathVariable Long id,Model model){
		
		model.addAttribute("employee", employeeService.findById(id));
		return"EmployeeInput";
	}
	
	@RequestMapping( value= "/employee/delete/{id}")
	public String deleteData(@PathVariable Long id){
		employeeService.delete(id);
		
		return"redirect:/employee";
	}
	
	/*@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST, value = "/employee/getDataTable")
	@ResponseBody
	public DataTablesOutput<Employee> getParameterDataTable(@Valid @RequestBody DataTablesInput input)
			throws ParseException {
		DataTablesOutput<Employee> list = employeeService.findForDataTable(input);
		return list;
	}*/
	
	

}
