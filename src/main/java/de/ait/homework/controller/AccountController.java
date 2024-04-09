package de.ait.homework.controller;

import de.ait.homework.model.Account;
import de.ait.homework.model.Client;
import de.ait.homework.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService service;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return service.findAll();
    }


    @GetMapping("/accounts/{id}")
    public Account getAccountsById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/client/{id}/accounts")
    public List<Account> getClientAccountsById(@PathVariable Long id) {
        Client client = service.findById(id);
        return client.getAccount();
    }
}
