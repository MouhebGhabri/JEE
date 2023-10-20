package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class LocationRepositoryImpl implements LocationRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Location getLocationByNom(String nom) {

        Query query = entityManager.createNativeQuery("SELECT l.* FROM Location WHERE l.nom LIKE ?",Location.class);
        query.setParameter(1,nom+"%");

        return (Location) query.getSingleResult() ;
    }
}
