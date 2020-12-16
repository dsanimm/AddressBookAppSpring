package com.capgemini.dto;

public class ContactDTO {

	public String fullName;
	public String phoneNo;
	public String address;

	@Override
	public String toString() {
		return "ContactDTO [fullName=" + fullName + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}

}