package it.marconi.rubrica.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// la classe Contact serve a specificare la struttura dell'entità da salvare nel database

@Data                   // getter e setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contacts") 
public class Contact {
    
    @Id                 // primary key
    @GeneratedValue     // generazione in automatico
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;
}
