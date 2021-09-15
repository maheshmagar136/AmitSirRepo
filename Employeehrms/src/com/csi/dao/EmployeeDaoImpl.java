package com.csi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.csi.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		List<Employee> employeeList = session.createQuery("from Employee").list();

		return employeeList;
	}

	@Override
	public Employee getDataById(int empId) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		List<Employee> employeeList = session.createQuery("from Employee").list();
		Employee employee = new Employee();
		for (Employee e : employeeList) {
			if (e.getEmpId() == empId) {
				employee.setEmpId(e.getEmpId());
				employee.setEmpName(e.getEmpName());
				employee.setEmpSalary(e.getEmpSalary());
				employee.setEmpEmailId(e.getEmpEmailId());
				employee.setEmpContactNumber(e.getEmpContactNumber());
			}
		}
		return employee;
	}

	public void saveData(Employee employee) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(employee);
		transaction.commit();
	}

	@Override
	public void saveBulOfData(List<Employee> employees) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		for (Employee e : employees) {
			Transaction transaction = session.beginTransaction();

			session.save(e);
			transaction.commit();
		}
	}

	@Override
	public void updateData(int empId, Employee employee) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		List<Employee> empList = session.createQuery("from Employee").list();

		for (Employee e : empList) {
			if (e.getEmpId() == empId) {
				e.setEmpName(employee.getEmpName());
				e.setEmpSalary(employee.getEmpSalary());
				e.setEmpEmailId(employee.getEmpEmailId());
				e.setEmpContactNumber(employee.getEmpContactNumber());

				session.update(e);
				transaction.commit();
			}
		}
	}

	@Override
	public void deleteDataById(int empId) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		List<Employee> empList = session.createQuery("from Employee").list();

		for (Employee e : empList) {
			if (e.getEmpId() == empId) {

				session.delete(e);
				transaction.commit();
			}
		}

	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		List<Employee> empList = session.createQuery("from Employee").list();

		for (Employee e : empList) {

			Transaction transaction = session.beginTransaction();
			session.delete(e);
			transaction.commit();

		}
	}

	@Override
	public void savaData(Employee employee) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.save(employee);
		transaction.commit();
	}

}
