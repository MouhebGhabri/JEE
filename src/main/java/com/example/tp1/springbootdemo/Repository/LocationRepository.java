package com.example.tp1.springbootdemo.Repository;

import com.example.tp1.springbootdemo.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository  extends JpaRepository<Location, Long>,LocationRepositoryCustom {

}
