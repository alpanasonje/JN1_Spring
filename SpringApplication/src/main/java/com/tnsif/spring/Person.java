//Program to demonstrate Person bean for Autowiring using configuration(XML) file
package com.tnsif.spring;

public class Person {

	private int id;
	private String name;
	private String contactNo;

	private Address address;

	public Person() {
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

	public void setAddress(Address address) {
		this.address = address;
	}
	
	Person(Address address)
	{
		this.address=address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", Address="+getAddress()+"]";
				
	}

}
