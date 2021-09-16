package com.demoapi.crm.controller;

import com.demoapi.crm.repository.ClientRepository;
import com.demoapi.crm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.demoapi.crm.model.Client;

import java.util.List;



@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> list() {
           return clientService.list();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }


}
