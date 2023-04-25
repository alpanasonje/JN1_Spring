package com.tns.resourceanno;

public class Department {
	
	private String deptName;
	private int deptId;
	private String deptHead;
	
	int noOfEmps;
	public Department(int noOfEmps)
	{
		this.noOfEmps=noOfEmps;
	}
		
	//Getter and Setter
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptHead() {
		return deptHead;
	}

	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

		@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptId=" + deptId + ", deptHead=" + deptHead + ", noOfEmps="+noOfEmps+"]";
	}
	
	
	
	
}
