package com.ssys.employeesreport.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssys.employeesreport.entities.Employee;
import com.ssys.employeesreport.entities.reports.EmployeeAgeReport;
import com.ssys.employeesreport.entities.reports.EmployeeSalaryReport;
import com.ssys.employeesreport.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@GetMapping
	public ResponseEntity<List<Employee>> findALL() {
		List<Employee> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/reports/age")
	public ResponseEntity<EmployeeAgeReport> employeeAgeReport() {
		EmployeeAgeReport obj = service.employeeAgeReport();
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping(value = "/reports/salary")
	public ResponseEntity<EmployeeSalaryReport> employeeSalaryReport(){
		EmployeeSalaryReport obj = service.employeeSalaryReport();
		return ResponseEntity.ok().body(obj);
	}

}
