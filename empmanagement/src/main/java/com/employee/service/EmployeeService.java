package com.employee.service;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.bean.Employees;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employees> getAllEployees(){
		return	(List<Employees>) employeeRepository.findAll();
		
	}
	
public List<Employees> getEmployeesofDepartments(String department) {
		
	  return employeeRepository.getEmployeeByDepartments(department);
	}
  
  public List<Employees> getEmployeesBySalary(int salary){
		
		return employeeRepository.getEmployeeBySalary(salary);
		
	}
  
  public List<Employees> getEmployeeByEmpId(int id){
		
		return employeeRepository.getEmployeeByEmpId(id);
		
	}
  
  public List<Employees> getEmployeesByTitles(String title) {
	  
	  return employeeRepository.getEmployeesByTitles(title);
	}
  
  public List<Employees> getEmployeesByHireDate(Date hireDate) {
	  
	  return employeeRepository.getEmployeesByHireDate(hireDate);
	}
  
  
  public void insertEmployee(Employees employeeBean){
		
		employeeRepository.save(employeeBean);
		
	}
  
  public void updateEmployee(Employees employeeBean){
		
		employeeRepository.save(employeeBean);
  }
  
  public void deleteEmployee(int id){
		
	  employeeRepository.deleteById(id);
	}







}
