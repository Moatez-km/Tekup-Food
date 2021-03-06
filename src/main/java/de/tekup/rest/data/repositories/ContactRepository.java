package de.tekup.rest.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.rest.data.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
