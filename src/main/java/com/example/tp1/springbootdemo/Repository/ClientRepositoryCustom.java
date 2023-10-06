package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Client;

public interface ClientRepositoryCustom {
    Client getClientByNom(String nom);
}
