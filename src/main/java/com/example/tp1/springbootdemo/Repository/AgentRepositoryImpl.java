package com.example.tp1.springbootdemo.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.aspectj.weaver.loadtime.Agent;

public class AgentRepositoryImpl implements AgentRepositoryCustom{
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public Agent getAgentByNom(String nom){
        Query query=entityManager.createNativeQuery("SELECT ag.* FROM Agent ag"+
                "WHERE ag.nom LIKE ?",Agent.class);
        query.setParameter(1,nom+"%");
        return (Agent) query.getSingleResult();
    }

}