package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.dto.ContactDTO;
import com.capgemini.model.ContactData;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<ContactData> getAllContacts() {
		List<ContactData> contactList = new ArrayList<>();
		contactList.add(new ContactData(1, new ContactDTO("Ram Das", "+91 7878787878", "45/1 Sardar Patel Road")));
		return contactList;
	}

	@Override
	public ContactData getContactById(int contactId) {
		ContactData contactData = null;
		contactData = new ContactData(1, new ContactDTO("Ram Das", "+91 7878787878", "45/1 Sardar Patel Road"));
		return contactData;
	}

	@Override
	public ContactData addContactInBook(ContactDTO contactDto) {
		ContactData contactData = null;
		contactData = new ContactData(1, contactDto);
		return contactData;
	}

	@Override
	public ContactData updateContactInBookById(int contactId, ContactDTO contactDto) {
		ContactData contactData = null;
		contactData = new ContactData(contactId, contactDto);
		return contactData;
	}

	@Override
	public void deleteContactInBookById(int contactId) {
		// TODO Auto-generated method stub
	}

} 