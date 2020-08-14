package com.id.bima.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.id.bima.*"}, repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class)
public class EmployeeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeWebApplication.class, args);
	}

}
