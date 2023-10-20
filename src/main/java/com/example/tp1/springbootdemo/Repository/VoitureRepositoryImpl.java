package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Voiture;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.aspectj.weaver.loadtime.Agent;

public class VoitureRepositoryImpl implements VoitureRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public Voiture getVoitureByNom(String nom){
        Query query=entityManager.createNativeQuery("SELECT v.* FROM Voiture v"+
                "WHERE v.nom LIKE ?",Agent.class);
        query.setParameter(1,nom+"%");
        return (Voiture) query.getSingleResult();
    }
}
