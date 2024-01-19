package com.thinkifydesign.carbooking.repository;

import com.thinkifydesign.carbooking.model.Driver;
import com.thinkifydesign.carbooking.model.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideRepository {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public List<Ride> getAllRides() {
        return rides;
    }
}
