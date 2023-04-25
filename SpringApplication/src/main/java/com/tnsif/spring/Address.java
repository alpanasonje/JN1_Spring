//program to demonstrate Address bean with life cycle
//using DisposableBean, InitializingBean interfaces
package com.tnsif.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements DisposableBean, InitializingBean{
	private int id;
	private String street;
	private String city;
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, int pincode) {
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

	public void afterPropertiesSet() throws Exception {
			System.out.println("DI Complete");	
	}

	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy...");		
	}

}
