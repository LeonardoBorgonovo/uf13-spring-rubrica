package it.marconi.rubrica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import it.marconi.rubrica.domain.Contact;

// tutta la gestione del repository viene lasciata a Spring, abbiamo scelto JPA apposta
public interface ContactRepository extends JpaRepository<Contact, UUID> {
    
}
