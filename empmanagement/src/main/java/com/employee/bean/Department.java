package com.employee.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="departments")
public class Department {
		@Column(name="dept_no")
		private int DeptNo;
		@Id 
		@Column(name="dept_name")
		private String Deptname;
		private List<Employees> employees = new ArrayList<Employees>();
		
		public List<Employees> getEmployees() {
			return employees;
		}
		public void setEmployees(List<Employees> employees) {
			this.employees = employees;
		}
		public int getDeptNo() {
			return DeptNo;
		}
		public void setDeptNo(int deptNo) {
			DeptNo = deptNo;
		}
		public String getDeptname() {
			return Deptname;
		}
		public void setDeptname(String deptname) {
			Deptname = deptname;
		}
		@Override
		public String toString() {
			return "Deppartments [DeptNo=" + DeptNo + ", Deptname=" + Deptname + "]";
		}
		

	}


