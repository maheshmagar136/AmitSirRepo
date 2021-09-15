package com.csi.service;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllData();

	public Employee getDataById(int empId);

	public void saveData(Employee employee);

	public void saveBulOfData(List<Employee> employees);

	public void updateData(int empId, Employee employee);

	public void deleteDataById(int empId);

	public void deleteAllData();
	
}
