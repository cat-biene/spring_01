package de.ait.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Account {

    private Long id;
    private String iban;
    private double balance;
    private Client owner;

}
