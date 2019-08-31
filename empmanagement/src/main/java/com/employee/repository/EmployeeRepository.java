package com.employee.repository;

import java.sql.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.employee.bean.Employees;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Integer> {
	
	public List<Employees> getEmployeeByDepartments(String departement);
	
	public List<Employees> getEmployeeBySalary(int salary);
	
	public List<Employees> getEmployeeByEmpId(int id);
	
	public List<Employees> getEmployeesByTitles(String title);
	
	public List<Employees> getEmployeesByHireDate(Date hireDate);

}
