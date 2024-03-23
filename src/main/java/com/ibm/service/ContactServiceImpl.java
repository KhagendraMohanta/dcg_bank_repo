package com.ibm.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.binding.Contact;
import com.ibm.repo.ContactRepository;

public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repository;
	
	@Override
	public String saveContact(Contact contact) {
		
     contact =  repository.save(contact);
     
     if(contact.getContactId() != null) {
    	 return "contact saved";
     }else {
    	 return "contact failed to saved";
     }
     
	}

	@Override
	public List<Contact> getAllContacts() {
	        
		   return repository.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
	Optional<Contact> findById = repository.findById(contactId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;	
	}

	@Override
	public String updateContact(Contact contact) {
		if(repository.existsById(contact.getContactId())) {
			repository.save(contact);
			return"Update success";
		}else {
			return "No record found";
		}
	}

	@Override
	public String deleteContactById(Integer contactId) {
	if(repository.existsById(contactId)) {
		repository.deleteById(contactId);
		return  "Record deleted ";
	}else {
		return "no record found";
	}
}
}
