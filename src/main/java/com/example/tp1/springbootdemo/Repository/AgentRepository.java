package com.example.tp1.springbootdemo.Repository;

import org.aspectj.weaver.loadtime.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent,Long>,AgentRepositoryCustom{
}