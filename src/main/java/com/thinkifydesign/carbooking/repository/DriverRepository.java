package com.thinkifydesign.carbooking.repository;

import com.thinkifydesign.carbooking.model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepository {
    private final List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public List<Driver> getAllDrivers() {
        return drivers;
    }
}
