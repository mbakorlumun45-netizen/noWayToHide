package com.lastma.data.models;

import java.time.Year;

public class Vehicle {
    private int plateNumber;
    private String brand;
    private String model;
    private Year year;
    private Driver driver;

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public int getPlateNumer() {
        return plateNumber;
    }

//    public void setDriver(Driver driver){
//        this.driver = driver;
//    }
//
//    public Driver setDriver() {
//        return driver;
//    }

    public Driver getDriver() {
        return driver;
    }
}
