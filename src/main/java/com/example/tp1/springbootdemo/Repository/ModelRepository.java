package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Long>,ModelRepositoryCustom{
}