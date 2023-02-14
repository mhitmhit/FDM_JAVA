package com.fdmgroup.contactrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.contactrestapi.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
