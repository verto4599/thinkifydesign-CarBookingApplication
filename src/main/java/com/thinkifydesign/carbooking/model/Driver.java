package com.thinkifydesign.carbooking.model;

import com.thinkifydesign.carbooking.utils.Location;

public class Driver {
    private String driverName;
    private String gender;
    private int age;
    private String carDetails;
    private Location currentLocation;
    private boolean available;

    public Driver(String name, String gender, int age, String carDetails, Location currentLocation) {
        this.driverName = name;
        this.gender = gender;
        this.age = age;
        this.carDetails = carDetails;
        this.currentLocation = currentLocation;
        this.available = true;
    }


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String name) {
        this.driverName = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}
