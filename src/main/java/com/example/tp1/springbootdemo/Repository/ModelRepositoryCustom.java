package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Modele;

public interface ModelRepositoryCustom {
    Modele getModelByNom(String nom);

}
