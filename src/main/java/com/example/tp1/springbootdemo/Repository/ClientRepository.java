package com.example.tp1.springbootdemo.Repository;


import com.example.tp1.springbootdemo.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long>,ClientRepositoryCustom {

}
