package com.emsi.eurekaclientapplication.Controller;

import com.emsi.eurekaclientapplication.Model.Client;
import com.emsi.eurekaclientapplication.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> chercherClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/client/{id}")
    public Client chercherUnClients(@PathVariable Long id) throws Exception {

        return this.clientRepository.findById(id).orElseThrow(() -> new Exception("Client inexistnt"));
    }
}
