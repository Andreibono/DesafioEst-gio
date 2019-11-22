package com.ssys.employeesreport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ssys.employeesreport.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
@Query(value = "SELECT * FROM TB_EMPLOYEE where employee_age in (select max(employee_age) from tb_employee);",nativeQuery = true) Employee olderEmployee();

@Query(value = "SELECT * FROM TB_EMPLOYEE where employee_age in (select min(employee_age) from tb_employee);",nativeQuery = true) Employee youngerEmployee();

@Query(value = "SELECT * FROM TB_EMPLOYEE where employee_salary in (select max(employee_salary) from tb_employee);",nativeQuery = true) Employee biggerSalaryEmployee();

@Query(value = "SELECT * FROM TB_EMPLOYEE where employee_salary in (select min(employee_salary) from tb_employee);",nativeQuery = true) Employee smallerSalaryEmployee();
}
