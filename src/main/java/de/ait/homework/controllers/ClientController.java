package de.ait.homework.controllers;

import de.ait.homework.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
создать новый проект используя https://start.spring.io/
создайте класс Client (Long id, String name, String email )
создайте ClientController, по примеру кода занятия реализуйте Get Mapping, который должен по запросу localhost:8080\client возвращать фиксированного клиента
*/

@RestController // Добавлена аннотация @RestController, чтобы обозначить,
// что класс ClientController является контроллером и все методы в нем будут возвращать данные,
// а не представления.

public class ClientController {
 Client client = new Client(1L, "Jack", "email@email.de");

 @GetMapping("/client")
    public Client getClient() {
        return client;
    }
}
