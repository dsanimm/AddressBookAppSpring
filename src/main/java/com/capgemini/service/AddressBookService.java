package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.dto.ContactDTO;
import com.capgemini.model.ContactData;

@Service
public class AddressBookService implements IAddressBookService {

	private List<ContactData> contactList = new ArrayList<>();

	@Override
	public List<ContactData> getAllContacts() {
		return contactList;
	}

	@Override
	public ContactData getContactById(int contactId) {
		return contactList.get(contactId - 1);
	}

	@Override
	public ContactData addContactInBook(ContactDTO contactDto) {
		ContactData contactData = null;
		contactData = new ContactData(contactList.size() + 1, contactDto);
		contactList.add(contactData);
		return contactData;
	}

	@Override
	public ContactData updateContactInBookById(int contactId, ContactDTO contactDto) {
		ContactData contactData = this.getContactById(contactId);
		contactData.setFullName(contactDto.fullName);
		contactData.setPhoneNo(contactDto.phoneNo);
		contactData.setAddress(contactDto.address);
		contactList.set(contactId - 1, contactData);
		return contactData;
	}

	@Override
	public void deleteContactInBookById(int contactId) {
		contactList.remove(contactId - 1);
	}

}