package com.capgemini.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dto.ContactDTO;
import com.capgemini.dto.ResponseDTO;
import com.capgemini.model.ContactData;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookContacts() {
		ContactData contactData = null;
		contactData = new ContactData(1, new ContactDTO("Ram Das", "+91 7878787878", "45/1 Sardar Patel Road"));
		ResponseDTO response = new ResponseDTO("Get Call Successful !", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getAddressBookContactById(@PathVariable("contactId") int contactId) {
		ContactData contactData = null;
		contactData = new ContactData(1, new ContactDTO("Ram Das", "+91 7878787878", "45/1 Sardar Patel Road"));
		ResponseDTO response = new ResponseDTO("Get Call Successful for Id : " + contactId, contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addContactInBook(@RequestBody ContactDTO contactDto) {
		ContactData contactData = null;
		contactData = new ContactData(1, contactDto);
		ResponseDTO response = new ResponseDTO("Created Contact Successfully !", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateContactInBook(@RequestBody ContactDTO contactDto) {
		ContactData contactData = null;
		contactData = new ContactData(1, contactDto);
		ResponseDTO response = new ResponseDTO("Updated Contact Successfully !", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookContactById(@PathVariable("contactId") int contactId) {
		ResponseDTO response = new ResponseDTO("Deleted Successfully !",
				"Deleted id : " + contactId + " Successfully !");
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

}