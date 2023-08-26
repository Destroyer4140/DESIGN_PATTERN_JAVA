package com.shubham.proxy;

public class EmployeeDaoProxy implements EmployeeDao{
	
	EmployeeDao employeeDaoObj;
	
	public EmployeeDaoProxy() {
		employeeDaoObj = new EmployeeDaoImpl();
	}

	@Override
	public void create(String client, EmployeeDo employeeDo) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDaoObj.create(client, employeeDo);
			return;
		}
		throw new Exception("Access Denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDaoObj.delete(client, employeeId);
			return;
		}
		throw new Exception("Access Denied");
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		if(client.equals("ADMIN") || client.equals("USER")) {
			return employeeDaoObj.get(client, employeeId);
		}
		throw new Exception("Access Denied");
	}

}
