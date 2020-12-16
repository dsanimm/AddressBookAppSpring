package com.capgemini.dto;

public class ContactDTO {

	public String fullName;
	public String phoneNo;
	public String address;

	public ContactDTO(String fullName, String phoneNo, String address) {
		super();
		this.fullName = fullName;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ContactDTO [fullName=" + fullName + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}

}