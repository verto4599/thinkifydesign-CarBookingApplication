package com.thinkifydesign.carbooking.model;

import com.thinkifydesign.carbooking.utils.Location;

public class Ride {
    private User user;
    private Driver driver;
    private Location startLocation;
    private Location endLocation;

    public Ride(User user, Driver driver, Location startLocation, Location endLocation) {
        this.user = user;
        this.driver = driver;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }


}
