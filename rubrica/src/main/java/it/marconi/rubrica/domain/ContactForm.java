package it.marconi.rubrica.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// la classe ContactForm supporta il form di inserimento dati
// ci servirà come contenitore per passare i parametri via Model
// e per introdurre controlli di validazione sulle text input

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactForm {
    
    private String name;

    private String surname;

    private String phone;

    private String email;
}
