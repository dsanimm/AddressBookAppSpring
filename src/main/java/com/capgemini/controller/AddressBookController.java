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

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<String> getAddressBookContacts() {
		return new ResponseEntity<String>("Get Call Successful !", HttpStatus.OK);
	}

	@GetMapping("/get/{contactId}")
	public ResponseEntity<String> getAddressBookContactById(@PathVariable("contactId") int contactId) {
		return new ResponseEntity<String>("Get Call Successful for Id : " + contactId, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addContactInBook(@RequestBody ContactDTO contactDto) {
		return new ResponseEntity<String>("Created Contact Successfully : " + contactDto, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateContactInBook(@RequestBody ContactDTO contactDto) {
		return new ResponseEntity<String>("Updated Contact Successfully : " + contactDto, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<String> deleteAddressBookContactById(@PathVariable("contactId") int contactId) {
		return new ResponseEntity<String>("Delete Successful for Id : " + contactId, HttpStatus.OK);
	}

}