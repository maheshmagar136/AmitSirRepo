package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import com.csi.service.EmployeeServiceImpl;

public class EmployeeController {

	static EmployeeService employeeServiceImpl = new EmployeeServiceImpl();
public static void main(String[] args) {
	saveData();
}
public static void saveData(){
	Employee employee = new Employee();
	employee.setEmpName("SWARA");
	employee.setEmpSalary(50000.00);
	employee.setEmpEmailId("SWARA@123");
	employee.setEmpContactNumber(7254425L);
	employeeServiceImpl.saveData(employee);
	
}
}

	
