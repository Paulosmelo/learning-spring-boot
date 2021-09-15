package com.demoapi.crm.controller;

import com.demoapi.crm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.demoapi.crm.model.Client;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> list(){
      return  clientRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client create(@RequestBody Client client){
        return clientRepository.save(client);
    }
}
