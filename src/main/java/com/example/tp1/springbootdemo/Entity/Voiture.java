package com.example.tp1.springbootdemo.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Serie")
    private String Serie;
    @Column(name = "date_Mise_En_Marche")
    private Date date_Mise_En_Marche;
    @Column(name = "Modele")
    private String Modele;

}