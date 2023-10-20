package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long>,VoitureRepositoryCustom {
}
