package com.AssignmentDay2;

class Vehicle {
    protected String registrationNumber;
    protected String brand;

    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public void DisplayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }

    public double CalculateParkingFee(int hours) {
        return 0.0;
    }
}

class Car extends Vehicle {
    private int numDoors;


    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    public double CalculateParkingFee(int hours) {
        return hours * 2.0;
    }

    @Override
    public void DisplayDetails() {
        super.DisplayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private String engineType;


    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double CalculateParkingFee(int hours) {
        return hours * 1.0;
    }

    @Override
    public void DisplayDetails() {
        super.DisplayDetails();
        System.out.println("Engine Type: " + engineType);
    }
}

public class ParkingSys {
    public static void main(String[] args) {
        Car car = new Car("AP54679", "Mercedes-Benz", 4);
        Motorcycle motorcycle = new Motorcycle("TN8192", "ROYAL ENFIELD", "J-series");

        int carParkingHours = 15;
        int motorcycleParkingHours = 8;

        System.out.println("The Car Parking Fee Details:");
        car.DisplayDetails();
        System.out.printf("Parking Fee for %d hours is Rs. %.2f%n", carParkingHours, car.CalculateParkingFee(carParkingHours));
        System.out.println();

        System.out.println("The Motorcycle Parking Fee Details:");
        motorcycle.DisplayDetails();
        System.out.printf("Parking Fee for %d hours is Rs. %.2f%n", motorcycleParkingHours, motorcycle.CalculateParkingFee(motorcycleParkingHours));
    }
}
