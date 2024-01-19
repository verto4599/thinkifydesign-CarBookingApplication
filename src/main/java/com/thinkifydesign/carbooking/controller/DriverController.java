package com.thinkifydesign.carbooking.controller;
import com.thinkifydesign.carbooking.service.DriverService;
import com.thinkifydesign.carbooking.utils.Location;
import com.thinkifydesign.carbooking.model.Driver;

import java.util.List;

public class DriverController {
    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    public void addDriver(String name, String gender, int age, String carDetails, Location location) {
        driverService.addDriver(name, gender, age, carDetails, location);
    }

    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }
}
