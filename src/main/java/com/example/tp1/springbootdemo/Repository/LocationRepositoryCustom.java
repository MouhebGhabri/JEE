package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Location;

public interface LocationRepositoryCustom {
    Location getLocationByNom(String nom);
}
