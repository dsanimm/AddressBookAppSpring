package com.capgemini.service;

import java.util.List;

import com.capgemini.dto.ContactDTO;
import com.capgemini.exceptions.AddressBookException;
import com.capgemini.model.ContactData;

public interface IAddressBookService {

	List<ContactData> getAllContacts();

	ContactData getContactById(int contactId) throws AddressBookException;

	ContactData addContactInBook(ContactDTO contactDto);

	ContactData updateContactInBookById(int contactId, ContactDTO contactDto) throws AddressBookException;

	void deleteContactInBookById(int contactId) throws AddressBookException;

}