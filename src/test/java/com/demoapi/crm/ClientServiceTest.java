package com.demoapi.crm;
import com.demoapi.crm.model.Client;
import com.demoapi.crm.repository.ClientRepository;
import com.demoapi.crm.service.ClientService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ClientServiceTest {

    @TestConfiguration
    static class ClientServiceTestConfiguration{

        @Bean
        public ClientService clientService(){
            return new ClientService();
        }
    }

    @Autowired
     private ClientService clientService;

    @MockBean
    private ClientRepository clientRepository;


    @Test
    public void clientServiceCreate(){
        Client client = new Client();
        client.setName("maria");
        client.setCpf("129");

        Client result = clientService.create(client);

        Assertions.assertEquals(client, clientRepository.save(client));
    }

    @Before
    public void setUp(){
        Client client  = new Client();
        client.setName("maria");
        client.setCpf("129");

        Mockito.when(clientRepository.save(client)).thenReturn(client);
    }
}
