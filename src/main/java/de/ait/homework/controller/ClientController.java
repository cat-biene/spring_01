package de.ait.homework.controller;

import de.ait.homework.model.Account;
import de.ait.homework.model.Client;
import de.ait.homework.service.AccountService;
import de.ait.homework.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Добавлена аннотация @RestController, чтобы обозначить,
// что класс ClientController является контроллером и все методы в нем будут возвращать данные,
// а не представления.
@RequiredArgsConstructor
public class ClientController {

    private final ClientService service;

    private Client client = new Client(1L, "Jack", "email@email.de");

    // GET localhost:8080\client
    @GetMapping("/client")
    public Client getClient() {
        return client;
    }

    @GetMapping("/clients")
    public List<Client> getClients() {
        return service.findAll();
    }

    // GET localhost:8080/client/1
    @GetMapping("/client/{id}")
    public Client getClientById(@PathVariable Long id) {

        return service.findById(id);
    }
}
