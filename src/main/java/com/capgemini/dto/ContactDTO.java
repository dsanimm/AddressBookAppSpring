package com.capgemini.dto;

public class ContactDTO {

	public String fullName;
	public String phoneNo;
	public String address;
	public String city;
	public String state;
	public String zip;

	public ContactDTO(String fullName, String phoneNo, String address, String city, String state, String zip) {
		super();
		this.fullName = fullName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "";
	}

}