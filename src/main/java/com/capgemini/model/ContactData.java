package com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capgemini.dto.ContactDTO;

@Entity
@Table(name = "CONTACTS")
public class ContactData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	private String phoneNo;
	private String address;
	private String city;
	private String state;
	private String zip;

	public ContactData() {
		// TODO Auto-generated constructor stub
	}

	public ContactData(int id, ContactDTO contactDto) {
		this.id = id;
		this.fullName = contactDto.fullName;
		this.phoneNo = contactDto.phoneNo;
		this.address = contactDto.address;
		this.city = contactDto.city;
		this.state = contactDto.state;
		this.zip = contactDto.zip;
	}

	public ContactData(ContactDTO contactDto) {
		this.fullName = contactDto.fullName;
		this.phoneNo = contactDto.phoneNo;
		this.address = contactDto.address;
		this.city = contactDto.city;
		this.state = contactDto.state;
		this.zip = contactDto.zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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