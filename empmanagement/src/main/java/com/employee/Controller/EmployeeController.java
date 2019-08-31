package com.employee.Controller;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.bean.Employees;
import com.employee.bean.ResultEmp;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("all")
	public List<Employees> getAllEmployees(){
		return employeeService.getAllEployees();
	}
	
	@GetMapping(path="/{Departments}")
	public List<Employees> getEmployeesByDepartments(@PathVariable String department){
		return employeeService.getEmployeesofDepartments(department);
	}
	
	@GetMapping(path="salary/{salary}")
	public List<Employees> getEmployeesBySalary(@PathVariable int salary){
		return employeeService.getEmployeesBySalary(salary);
	}
	
	@GetMapping(path="employee/{id}")
	public List<Employees> getEmployeeByEmpId(@PathVariable int id){
		return employeeService.getEmployeeByEmpId(id);
	}
	
	@GetMapping(path="Title")
	public List<Employees> getEmployeesByTitles(@PathVariable String title){
		
		return employeeService.getEmployeesByTitles(title);
	}
	@GetMapping(path="HireDate")
	public List<Employees> getEmployeesByHireDate(@PathVariable Date HireDate){
		
		return employeeService.getEmployeesByHireDate(HireDate);
	}
	
	@PostMapping(path="employee")
	public List<Employees> insertEmployee(@RequestBody Employees employeeBean){
		employeeService.insertEmployee(employeeBean);
		return employeeService.getEmployeeByEmpId(employeeBean.getEmpId());
		
	}
	
	@PutMapping(path="employee/{id}")
	public ResultEmp updateEmployee(@PathVariable int id,@RequestBody Employees employeeBean){
		
		ResultEmp result = new ResultEmp();
			if(employeeService.getEmployeeByEmpId(id)==null || employeeService.getEmployeeByEmpId(id).isEmpty()){
				result.setMessage("employee not exist for given id");
				employeeService.insertEmployee(employeeBean);
			}else{
				result.setMessage("sucess");
				employeeService.updateEmployee(employeeBean);
			}
	   return result;
	}
	
	@DeleteMapping(path="employee/{id}")
	public ResultEmp deletEmployee(@PathVariable int id){
		
		ResultEmp result = new ResultEmp();
			if(employeeService.getEmployeeByEmpId(id)==null || employeeService.getEmployeeByEmpId(id).isEmpty()){
				result.setMessage("Employee not exist for given id");
			  }else{
				result.setMessage("sucess");
				employeeService.deleteEmployee(id);
			}
	   return result;
	}
	
		
	
	
}
