package com.ssys.employeesreport.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ssys.employeesreport.entities.Employee;
import com.ssys.employeesreport.repositories.EmployeeRepository;

//Class made to run tests
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Employee e1 = new Employee(null,"Aragorn II",2500.00,87,null);
		Employee e2 = new Employee(null,"Obi-Wan Kenobi",2000.00,75,null);
		Employee e3 = new Employee(null,"Leia Organa",1500.00,25,null);
		Employee e4 = new Employee(null,"Frodo Baggins",800.00,33,null);
		Employee e5 = new Employee(null,"Bilbo Baggins",800.00,50,null);
		Employee e6 = new Employee(null,"Samwise Gamgee",700.00,33,null);
		Employee e7 = new Employee(null,"Legolas Greenleaf",2200.00,500,null);
		Employee e8 = new Employee(null,"Gimli",2100.00,200,null);
		Employee e9 = new Employee(null,"Peregrin Took",600.00,30,null);
		Employee e10 = new Employee(null,"Meriadoc Brandebuque",500.00,32,null);
		Employee e11 = new Employee(null,"Sméagol",400.00,250,null);
		Employee e12 = new Employee(null,"Gandalf, o Branco",2400.00,4000,null);
		
		employeeRepository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12));
		
	}
	
	
}
