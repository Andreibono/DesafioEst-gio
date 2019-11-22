package com.ssys.employeesreport.entities.reports;

import java.io.Serializable;

import com.ssys.employeesreport.entities.Employee;

public class EmployeeAgeReport implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Employee younger_Employee;
	private Employee older_Employee;
	private Double average_age;
	
	public EmployeeAgeReport() {	
	}

	public EmployeeAgeReport(Employee younger_Employee, Employee older_Employee, Double average_age) {
		super();
		this.younger_Employee = younger_Employee;
		this.older_Employee = older_Employee;
		this.average_age = average_age;
	}

	public Employee getYounger_Employee() {
		return younger_Employee;
	}

	public void setYounger_Employee(Employee younger_Employee) {
		this.younger_Employee = younger_Employee;
	}

	public Employee getOlder_Employee() {
		return older_Employee;
	}

	public void setOlder_Employee(Employee older_Employee) {
		this.older_Employee = older_Employee;
	}

	public Double getAverage_age() {
		return average_age;
	}

	public void setAverage_age(Double average_age) {
		this.average_age = average_age;
	}

}
