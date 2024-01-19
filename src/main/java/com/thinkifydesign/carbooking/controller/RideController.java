package com.thinkifydesign.carbooking.controller;
import com.thinkifydesign.carbooking.model.Driver;
import com.thinkifydesign.carbooking.model.User;
import com.thinkifydesign.carbooking.model.Ride;
import com.thinkifydesign.carbooking.service.RideService;
import com.thinkifydesign.carbooking.utils.Location;

import java.util.List;

public class RideController {
    private final RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    public List<String> findRide(String userName, Location startLocation, Location endLocation) {
        return rideService.findRide(userName, startLocation, endLocation);
    }

    public String chooseRide(String userName, String driverName){
        return rideService.chooseRide(userName, driverName);
    }



    public void addRide(User user, Driver driver, Location startLocation, Location endLocation) {
        rideService.addRide(user, driver, startLocation, endLocation);
    }

    public List<Ride> getAllRides() {
        return rideService.getAllRides();
    }
}
