package controllers;


import java.util.List;


public interface EmployeeDAO {
	public void getDBConnection();
	public void closeDBConnection();
	public void addEmployee(Employee employee);
	List<Employee> getEmployees();
	public void update(Employee employee);
}
