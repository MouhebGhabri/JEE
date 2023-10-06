package com.example.tp1.springbootdemo.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date_debut")
    private Date date_debut;
    @Column(name = "date_retour")
    private Date date_retour;
    @Column(name = "prix_jour")
    private double prix_jour;
    @Column(name = "prix")
    private double prix;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "voiture_id")
    private Voiture voiture;

    public Location() {
        // No-argument constructor
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setPrix_jour(double prix_jour) {
        this.prix_jour = prix_jour;
    }

    public void setDate_retour(Date date_retour) {
        this.date_retour = date_retour;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public double getPrix_jour() {
        return prix_jour;
    }

    public Date getDate_retour() {
        return date_retour;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public Long getId() {
        return id;
    }
}