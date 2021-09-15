package com.csi.dao;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeDao {

	public List<Employee> getAllData();

	public Employee getDataById(int empId);

	public void savaData(Employee employee);

	public void saveBulOfData(List<Employee> employees);

	public void DeleteDataById(int empId);

	public void deleteAllData();

 }
