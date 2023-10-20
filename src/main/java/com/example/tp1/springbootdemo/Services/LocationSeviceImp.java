package com.example.tp1.springbootdemo.Services;

import com.example.tp1.springbootdemo.Repository.LocationRepository;
import org.springframework.stereotype.Service;

import javax.xml.stream.Location;
import java.util.List;

@Service
public class LocationSeviceImp implements LocationService {

    @Override
    public Location getLocationByNom(String nom) {
        return null;
    }

    @Override
    public List<Location> getAllLocation() {
        return null;
    }

    @Override
    public Location createLocation(Location location) {
        return null;
    }

    @Override
    public Location getLocationById(Long id) {
        return null;
    }

    @Override
    public Location updateLocation(Location location) {
        return null;
    }

    @Override
    public void deleteLocation(Long id) {

    }
}