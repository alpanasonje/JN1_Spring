package com.tns.resourceanno;

import javax.annotation.Resource;

public class Employee {

	
	private String employeeName;
	private double salary;
	private int age,empId;
	
	@Resource(name="dept")
	private Department dept;
	
	//Getter and Setter
	public String getEmployeeName() {
		return employeeName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		System.out.println("dept setter");
		this.dept = dept;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary + ", age=" + age + ", empId=" + empId
				+ ", dept=" + dept + "]";
	}
	
	public void display()
	{
		System.out.println(dept.noOfEmps);
		System.out.println(dept.getDeptHead());
	}
	
	
	
}
