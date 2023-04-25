package com.tns.annotations;

import javax.annotation.Resource;

public class Employee {
	private String empName;
	private int empCode,empSal;
	
//	@Resource(name="myadd")
	@Resource
	private Address address;
	
	public Employee(String empName,int empCode) {
		// TODO Auto-generated constructor stub
		this.empName=empName;
		System.out.println("Employee Constructor called");
		System.out.println("Name :" + empName + "Code : "+empCode);
		
	}

public void displayEmpInfo() {
	System.out.println(" Employee [Name : "+empName +" Address :" +address +"]");
}	

	
}

