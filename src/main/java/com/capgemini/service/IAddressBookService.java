package com.capgemini.service;

import java.util.List;

import com.capgemini.dto.ContactDTO;
import com.capgemini.model.ContactData;

public interface IAddressBookService {

	List<ContactData> getAllContacts();

	ContactData getContactById(int contactId);

	ContactData addContactInBook(ContactDTO contactDto);

	ContactData updateContactInBookById(int contactId, ContactDTO contactDto);

	void deleteContactInBookById(int contactId);

}