package com.thinkifydesign.carbooking.service;

import com.thinkifydesign.carbooking.model.Driver;
import com.thinkifydesign.carbooking.utils.Location;
import com.thinkifydesign.carbooking.repository.DriverRepository;

import java.util.List;

public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {

        this.driverRepository = driverRepository;
    }

    public void addDriver(String name, String gender, int age, String carDetails, Location location) {
        driverRepository.addDriver(new Driver(name, gender, age, carDetails, location));
    }

    public List<Driver> getAllDrivers() {
        return driverRepository.getAllDrivers();
    }
}
