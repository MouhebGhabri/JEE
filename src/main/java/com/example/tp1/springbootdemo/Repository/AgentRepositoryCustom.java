package com.example.tp1.springbootdemo.Repository;


import org.aspectj.weaver.loadtime.Agent;

public interface AgentRepositoryCustom {
    Agent getAgentByNom(String nom);
}