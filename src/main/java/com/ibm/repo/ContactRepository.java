package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.binding.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{
	

}
