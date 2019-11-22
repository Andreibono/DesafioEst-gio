package com.ssys.employeesreport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssys.employeesreport.entities.Employee;
import com.ssys.employeesreport.entities.reports.EmployeeAgeReport;
import com.ssys.employeesreport.entities.reports.EmployeeSalaryReport;
import com.ssys.employeesreport.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
	
	public Employee olderEmployee() {
		return repository.olderEmployee();
	}
	public Employee youngerEmployee() {
		return repository.youngerEmployee();
	}
	
	public EmployeeAgeReport employeeAgeReport() {
		EmployeeAgeReport employeeAgeReport = new EmployeeAgeReport(youngerEmployee(),olderEmployee(),null);
		Double avgAge =(double) (employeeAgeReport.getYounger_Employee().getEmployee_age()+employeeAgeReport.getOlder_Employee().getEmployee_age())/2;
		employeeAgeReport.setAverage_age(avgAge);
		return employeeAgeReport;
	}
	
	public Employee smallerSalaryEmployee() {
		return repository.smallerSalaryEmployee();
	}
	public Employee biggerSalaryEmployee() {
		return repository.biggerSalaryEmployee();
	}
	
	public EmployeeSalaryReport employeeSalaryReport() {
		EmployeeSalaryReport employeeSalaryReport = new EmployeeSalaryReport(smallerSalaryEmployee(),biggerSalaryEmployee(),null);
		Double avgSalary = (employeeSalaryReport.getSmallerSalaryEmployee().getEmployee_salary()+employeeSalaryReport.getBiggerSalaryEmployee().getEmployee_salary())/2;
		employeeSalaryReport.setAverageSalary(avgSalary);
		return employeeSalaryReport;
	}
}
