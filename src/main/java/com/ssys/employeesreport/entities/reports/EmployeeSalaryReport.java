package com.ssys.employeesreport.entities.reports;

import com.ssys.employeesreport.entities.Employee;

public class EmployeeSalaryReport {

	private Employee smallerSalaryEmployee;
	private Employee biggerSalaryEmployee;
	private Double averageSalary;
	
	public EmployeeSalaryReport() {
		
	}

	public EmployeeSalaryReport(Employee smallerSalaryEmployee, Employee biggerSalaryEmployee, Double averageSalary) {
		super();
		this.smallerSalaryEmployee = smallerSalaryEmployee;
		this.biggerSalaryEmployee = biggerSalaryEmployee;
		this.averageSalary = averageSalary;
	}

	public Employee getSmallerSalaryEmployee() {
		return smallerSalaryEmployee;
	}

	public void setSmallerSalaryEmployee(Employee smallerSalaryEmployee) {
		this.smallerSalaryEmployee = smallerSalaryEmployee;
	}

	public Employee getBiggerSalaryEmployee() {
		return biggerSalaryEmployee;
	}

	public void setBiggerSalaryEmployee(Employee biggerSalaryEmployee) {
		this.biggerSalaryEmployee = biggerSalaryEmployee;
	}

	public Double getAverageSalary() {
		return averageSalary;
	}

	public void setAverageSalary(Double averageSalary) {
		this.averageSalary = averageSalary;
	}
	
}
