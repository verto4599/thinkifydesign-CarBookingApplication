package com.thinkifydesign.carbooking.model;

import com.thinkifydesign.carbooking.utils.Location;

public class User {
    private String userName;
    private String gender;
    private int age;
    private Location userLocation;

    public User(String name, String gender, int age) {
        this.userName = name;
        this.gender = gender;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
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

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }
}
