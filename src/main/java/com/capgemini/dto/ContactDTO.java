package com.capgemini.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exceptions.AddressBookException;

public class ContactDTO {

	public String fullName;
	public String phoneNo;
	public String address;
	public String city;
	public String state;
	public String zip;

	public ContactDTO(String fullName, String phoneNo, String address, String city, String state, String zip)
			throws AddressBookException {
		super();
		this.setFullName(fullName);
		this.setPhoneNo(phoneNo);
		this.setAddress(address);
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) throws AddressBookException {
		String namePattern = "^[A-Z]{1}[a-zA-Z\\s]{2,}$";
		Pattern p1 = Pattern.compile(namePattern);
		Matcher matcher = p1.matcher(fullName);
		boolean b = matcher.matches();
		if (!b)
			throw new AddressBookException("FullName is in Incorrect Format !");
		else
			this.fullName = fullName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) throws AddressBookException {
		String phoneNoPattern = "((^\\+?)(([0-9]{2,3})(\\s))?)" + "[0-9]{10}$";
		Pattern p1 = Pattern.compile(phoneNoPattern);
		Matcher matcher = p1.matcher(phoneNo);
		boolean b = matcher.matches();
		if (!b)
			throw new AddressBookException("Phone Number is in Incorrect Format !");
		else
			this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) throws AddressBookException {
		String[] addressSplit = address.split(" ");
		String addressPattern = "([A-Z a-z 0-9 \\/]{3,})+";
		Pattern p1 = Pattern.compile(addressPattern);
		for (String addressWord : addressSplit) {
			Matcher matcher = p1.matcher(addressWord);
			boolean b = matcher.matches();
			if (!b)
				throw new AddressBookException("Address is in Incorrect Format !");
		}
		this.address = address;
	}

	@Override
	public String toString() {
		return "";
	}

}