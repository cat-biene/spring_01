package de.ait.homework.controllers;

import de.ait.homework.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {

    private List<Account> accounts = new ArrayList<>();

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accounts;
    }
}

/*
* создайте класс Account (Long id, String iban, double balance, Client owner)
создайте List
создайте AccountController, реализуйте Get Mapping, который должен по запросу localhost:8080\accounts возвращать список счетов
*/
