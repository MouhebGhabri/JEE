package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Voiture;

public interface VoitureRepositoryCustom {

    Voiture getVoitureByNom(String nom);
}
