package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgentRepository extends JpaRepository<Agent,Long>,AgentRepositoryCustom{
}