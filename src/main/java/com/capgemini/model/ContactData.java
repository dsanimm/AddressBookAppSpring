package com.capgemini.model;

import com.capgemini.dto.ContactDTO;

public class ContactData {

	private int id;
	private String fullName;
	private String phoneNo;
	private String address;

	public ContactData() {
		// TODO Auto-generated constructor stub
	}

	public ContactData(int id, ContactDTO contactDto) {
		this.id = id;
		this.fullName = contactDto.fullName;
		this.phoneNo = contactDto.phoneNo;
		this.address = contactDto.address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}