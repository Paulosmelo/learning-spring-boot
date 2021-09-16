package com.demoapi.crm.service;

import com.demoapi.crm.model.Client;
import com.demoapi.crm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> list(){
        return clientRepository.findAll();
    }

    public Client create(Client client){
        return clientRepository.save(client);
    }
}
