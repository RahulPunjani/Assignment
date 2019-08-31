package com.employee.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
@Entity
@Table(name="titles")
public class Title{
	@Id
	@Column(name="emp_id")
	private Employees empId;
	@Column(name="titles")
	private String titles;
	@Column(name="frome_date")
	private Salary FromDate;
	@Column(name="to_date")
	private Salary ToDate;
public Employees getEmpId() {
	return empId;
}
public void setEmpId(Employees empId) {
	this.empId = empId;
}
public String getTitles() {
	return titles;
}
public void setTitles(String titles) {
	this.titles = titles;
}
public Salary getFromDate() {
	return FromDate;
}
public void setFromDate(Salary fromDate) {
	FromDate = fromDate;
}
public Salary getToDate() {
	return ToDate;
}
public void setToDate(Salary toDate) {
	ToDate = toDate;
}
@Override
public String toString() {
	return "Title [empId=" + empId + ", titles=" + titles + ", FromDate=" + FromDate + ", ToDate=" + ToDate + "]";
} 
 
 
}

