package com.thinkifydesign.carbooking.DriverClass;
import com.thinkifydesign.carbooking.model.User;
import com.thinkifydesign.carbooking.model.Driver;
import com.thinkifydesign.carbooking.model.Ride;
import com.thinkifydesign.carbooking.utils.Location;

import com.thinkifydesign.carbooking.repository.DriverRepository;
import com.thinkifydesign.carbooking.repository.RideRepository;
import com.thinkifydesign.carbooking.repository.UserRepository;
import com.thinkifydesign.carbooking.service.RideService;
import com.thinkifydesign.carbooking.service.DriverService;
import com.thinkifydesign.carbooking.service.UserService;
import com.thinkifydesign.carbooking.controller.DriverController;
import com.thinkifydesign.carbooking.controller.UserController;
import com.thinkifydesign.carbooking.controller.RideController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarbookingApplication.class, args);

		//instantiate services and controllers

		UserRepository userRepository = new UserRepository();
		DriverRepository driverRepository = new DriverRepository();
		RideRepository rideRepository = new RideRepository();

		UserService userService = new UserService(userRepository);
		DriverService driverService = new DriverService(driverRepository);
		RideService rideService = new RideService(userRepository, driverRepository, rideRepository);

		UserController userController = new UserController(userService);
		DriverController driverController = new DriverController(driverService);
		RideController rideController = new RideController(rideService);

		//operations based on the provided test case
		userController.addUser("Abhishek", "M", 23);
		userController.addUser("Rahul", "M", 29);
		userController.addUser("Nandini", "F", 22);

		driverController.addDriver("Driver1", "M", 22, "Swift, KA-01-12345", new Location(10, 1));
		driverController.addDriver("Driver2", "M", 29, "Swift, KA-01-12345", new Location(11, 10));
		driverController.addDriver("Driver3", "M", 24, "Swift, KA-01-12345", new Location(5, 3));

		System.out.println(rideController.findRide("Abhishek", new Location(0, 0), new Location(20, 1)));
		System.out.println(rideController.chooseRide("Abhishek", " Driver1"));

		System.out.println(rideController.findRide("Rahul", new Location(10, 0), new Location(15, 3)));
		System.out.println(rideController.chooseRide("Rahul", " Driver1"));

		System.out.println(rideController.findRide("Nandini", new Location(15, 6), new Location(20, 4)));
		System.out.println(rideController.chooseRide("Nandini", " Driver1"));

	}

}
