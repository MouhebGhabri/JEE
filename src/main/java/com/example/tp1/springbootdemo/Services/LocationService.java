package com.example.tp1.springbootdemo.Services;

import javax.xml.stream.Location;
import java.util.List;

public interface LocationService {
    Location getLocationByNom(String nom);
    List<Location> getAllLocation();
    Location createLocation(Location location);
    Location getLocationById(Long id);
    Location updateLocation(Location location);
    void deleteLocation(Long id);

}
