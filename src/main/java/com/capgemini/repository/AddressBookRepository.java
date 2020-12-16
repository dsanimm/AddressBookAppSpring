package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.ContactData;

public interface AddressBookRepository extends JpaRepository<ContactData, Integer> {

}