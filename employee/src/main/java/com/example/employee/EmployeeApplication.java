package com.example.employee;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.EmployeeDao;
import com.example.entities.BankAccount;
import com.example.entities.Department;
import com.example.entities.Employee;

@SpringBootApplication
@ComponentScan(basePackages = "com.example" )
@EntityScan(basePackages = "com.example.entities")
public class EmployeeApplication implements CommandLineRunner {
	@Autowired
EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	public Employee saveEmployee(Employee e) {
		employeeDao.saveEmployee(e);
		return e;
	}
	@Override
	public void run(String... args) throws Exception {
//		Employee e=new Employee("john","smith","j.s@gmail.com",Date.valueOf("2000-10-10"));
//		Long empid= employeeDao.saveEmployee(e);
//		System.out.println("Employee id " + empid);
		
//		Employee e=employeeDao.getEmployee(1);
//		System.out.println(e);
//		
//		e.setEmail("john.smith@gmail.com");
//		Employee e=new Employee("adamEVE","e","a.e@gmail.com",Date.valueOf("2000-10-10"));
//		e.setDepartment(new Department("IT"));
//		BankAccount acc=new BankAccount();
//		acc.setBranchname("NUNGAMBAKKAM");
//		acc.setLocation("Chennai");
//		e.setSalaryAccount(acc);
//		e=saveEmployee(e);
//		System.out.println(e.getId());
//		System.out.println(e.getDepartment().getId());
//		
		
	}

}
