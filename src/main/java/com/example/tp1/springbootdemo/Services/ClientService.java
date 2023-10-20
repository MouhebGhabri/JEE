package com.example.tp1.springbootdemo.Services;

import com.example.tp1.springbootdemo.Entity.Client;

import java.util.List;

public interface ClientService {
    Client getClientByNom(String nom);
    List<Client> getAllClient();
    Client createClient(Client client);
    Client getClientByID(Long id);
    Client updateClient(Client product);
    void deleteClient(Long id);
}
