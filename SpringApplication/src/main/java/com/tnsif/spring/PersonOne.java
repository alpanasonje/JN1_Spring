//Program to demonstrate Person bean for Autowiring using autowired annotation
package com.tnsif.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonOne {

	private int id;
	private String name;
	private String contactNo;

	@Autowired(required = false)
	private Address address;

	public PersonOne() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress() {
		return address;
	}

	/*
	 * public void setAddress(Address address) { this.address = address;
	 * System.out.println("setter"); }
	 * 
	 * PersonOne(Address address) { this.address=address;
	 * System.out.println("constructor"); }
	 */

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", Address="+getAddress()+"]";
				
	}

}
