package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Modele;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Modele,Long>,ModelRepositoryCustom{
}