package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Modele;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

public class ModelRepositoryImpl implements ModelRepositoryCustom{
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public Modele getModelByNom(String nom){
        Query query=entityManager.createNativeQuery("SELECT m.* FROM Model m"+
                "WHERE m.nom LIKE ?", Modele.class);
        query.setParameter(1,nom+"%");
        return (Modele) query.getSingleResult();
    }
}