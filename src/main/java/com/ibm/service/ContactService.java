package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.binding.Contact;

@Service
public interface ContactService {

	public String saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public String updateContact(Contact contact);
	
	public String deleteContactById(Integer contactId);
	

}
