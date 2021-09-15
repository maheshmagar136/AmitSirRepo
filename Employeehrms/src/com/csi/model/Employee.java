package com.csi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empdetails")
public class Employee {

	@Id
	@GeneratedValue

	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name")
	private String empName;

	@Column(name="emp_salary")
	private double empSalary;

	@Column(name="emp_email_id", unique=true)
	private String empEmailId;

	@Column(name="emp_contact_number", unique=true)
	private long empContactNumber;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public long getEmpContactNumber() {
		return empContactNumber;
	}

	public void setEmpContactNumber(long empContactNumber) {
		this.empContactNumber = empContactNumber;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empEmailId="
				+ empEmailId + ", empContactNumber=" + empContactNumber + "]";
	}

}
