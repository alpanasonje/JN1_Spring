//program to demonstrate Address bean with life cycle methods
//using Annotations

package com.tnsif.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AddressTwo {
	private int id;
	private String street;
	private String city;
	private int pincode;

	public AddressTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressTwo(String street, String city, int pincode) {
		super();

		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("setter method invoked");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

	//Add javax-annotation dependency in pom.xml
	// Add <context:annotation-config/> in bean.xml
	@PostConstruct
	public void init() {
		System.out.println("DI Complete");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean is going to destroy..");
	}
}
