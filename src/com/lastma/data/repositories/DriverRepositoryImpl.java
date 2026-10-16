package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepository{
    private List<Driver> drivers = new ArrayList<>();
    private int driverss = 0;

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Driver save(Driver driver) {
        driver.setId(++driverss);
        drivers.add(driver);
        return driver;
    }

    @Override
    public long count(Driver driver) {
        return driverss;
    }

    @Override
    public Driver findById(int id) {
        return null;
    }

    @Override
    public void del(int id) {

    }

}
