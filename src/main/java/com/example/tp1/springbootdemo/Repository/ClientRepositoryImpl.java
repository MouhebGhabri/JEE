package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class ClientRepositoryImpl implements ClientRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Client getClientByNom(String nom) {
        Query query=entityManager.createNamedQuery("SELECT C.* FROM Client c"+
                "Where C.nom LIKE ?",Client.class);
        query.setParameter(1,nom+"%");

        return (Client) query.getSingleResult();
    }
}


