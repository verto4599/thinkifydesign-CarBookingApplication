package com.thinkifydesign.carbooking.service;
import com.thinkifydesign.carbooking.model.Driver;
import com.thinkifydesign.carbooking.utils.Location;
import com.thinkifydesign.carbooking.model.Ride;
import com.thinkifydesign.carbooking.model.User;

import com.thinkifydesign.carbooking.repository.DriverRepository;
import com.thinkifydesign.carbooking.repository.RideRepository;
import com.thinkifydesign.carbooking.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    private final UserRepository userRepository;
    private final DriverRepository driverRepository;
    private final RideRepository rideRepository;
    private final int maxDistance;

    public RideService(UserRepository userRepository, DriverRepository driverRepository, RideRepository rideRepository) {
        this.userRepository = userRepository;
        this.driverRepository = driverRepository;
        this.rideRepository = rideRepository;
        this.maxDistance = 5;
    }

    public List<String> findRide(String userName, Location startLocation, Location endLocation) {
        User user = userRepository.findUserByName(userName);
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }

        List<Driver> availableDrivers = findAvailableDrivers(startLocation);
        List<String> availableRides = new ArrayList<>();

        for(Driver driver : availableDrivers){
            rideRepository.addRide(new Ride(user, driver, startLocation, endLocation));
            availableRides.add(driver.getDriverName() +" [Available]");
        }
        return availableRides;

    }

    public String chooseRide(String userName, String driverName) {
        User user = userRepository.findUserByName(userName);
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }

        Driver selectedDriver = null;

        for (Ride ride : rideRepository.getAllRides()) {
            if (ride.getUser().equals(user) && ride.getDriver().getDriverName().equals(driverName)) {
                selectedDriver = ride.getDriver();
                ride.getDriver().setAvailable(false);
                break;
            }
        }

        if (selectedDriver != null) {
            return "Ride selected with driver: " + selectedDriver.getDriverName();
        } else {
            return "No ride found";
        }
    }

    private List<Driver> findAvailableDrivers(Location userLocation) {
        List<Driver> availableDrivers = new ArrayList<>();
        for (Driver driver : driverRepository.getAllDrivers()) {
            if (driver.isAvailable() && calculateDistance(userLocation, driver.getCurrentLocation()) <= maxDistance) {
                availableDrivers.add(driver);
            }
        }
        return availableDrivers;
    }

    private double calculateDistance(Location userLocation, Location currentLocation) {
        return Math.sqrt(Math.pow(currentLocation.getX() - userLocation.getX(), 2) + Math.pow(currentLocation.getY() - userLocation.getY(), 2));
    }

    public void addRide(User user, Driver driver, Location startLocation, Location endLocation) {
        rideRepository.addRide(new Ride(user, driver, startLocation, endLocation));
    }

    public List<Ride> getAllRides() {
        return rideRepository.getAllRides();
    }

}






