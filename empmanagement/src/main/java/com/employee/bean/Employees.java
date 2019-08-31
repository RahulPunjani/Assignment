package com.employee.bean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="employees")
public class Employees {
	@Id 
	@Column(name="emp_id")
	private int empId;
	@Column(name="birth_date")
	private Date  DOB;
	@Column(name="first_name")
	private String Fname;
	@Column(name="Last_name")
	private String Lname;
	@Column(name="gender")
	private String Gender;
	@Column(name="hire_date")
	private Date HireDate;
	@ManyToMany
	private List<Department> departments = new ArrayList<Department>();
	@OneToMany
	private List<Salary> salary = new ArrayList<Salary>();
	@OneToMany
	private List<Title> titles = new ArrayList<Title>();
	
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public List<Salary> getSalary() {
		return salary;
	}
	public void setSalry(List<Salary> salary) {
		this.salary = salary;
	}
	public List<Title> getTitles() {
		return titles;
	}
	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Date getHireDate() {
		return HireDate;
	}
	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}
	@Override
	public String toString() {
		return "employees [empId=" + empId + ", DOB=" + DOB + ", Fname=" + Fname + ", Lname=" + Lname + ", Gender="
				+ Gender + ", HireDate=" + HireDate + "]";
	}
	
	
	

}

