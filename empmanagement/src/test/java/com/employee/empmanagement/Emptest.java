package com.employee.empmanagement;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.employee.bean.Employees;
import com.employee.repository.EmployeeRepository;

public class Emptest {


	@Test
	public void testFindById() {
	Employees emp = new Employees();
	assertEquals(emp.getDepartments(), emp.getDepartments());
	assertEquals(emp.getSalary(), emp.getSalary());
	}
	}