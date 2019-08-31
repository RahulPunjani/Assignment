package com.employee.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Salary")
public class Salary {
	@Id
	@Column(name="emp_id")
	private Employees empId;
	@Column(name="Salary")
	private int salary;
	@Column(name="from_date")
	private Date FromDate;
	@Column(name="to__date")
	private Date ToDate;
	public Employees getEmpId() {
		return empId;
	}
	public void setEmpId(Employees empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getFromDate() {
		return FromDate;
	}
	public void setFromDate(Date fromDate) {
		FromDate = fromDate;
	}
	public Date getToDate() {
		return ToDate;
	}
	public void setToDate(Date toDate) {
		ToDate = toDate;
	}
	@Override
	public String toString() {
		return "Salary [empId=" + empId + ", salary=" + salary + ", FromDate=" + FromDate + ", ToDate=" + ToDate + "]";
	}

}
