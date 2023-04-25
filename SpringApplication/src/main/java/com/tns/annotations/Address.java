package com.tns.annotations;

public class Address {
	private String City,State,Country;
	private int Pincode;
	
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Country=" + Country + ", Pincode=" + Pincode + "]";
	}
	public Address(String city, String state, String country, int pincode) {
		super();
		City = city;
		State = state;
		Country = country;
		Pincode = pincode;
	}
	
	
}