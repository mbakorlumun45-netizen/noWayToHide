package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverRepositoryImplTest {

    @Test
    public void testthatWhenISaveOneDrviver_countIsOne(){
        DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();
        Driver driver = new Driver();
        driverRepository.save(driver);
        assertEquals(0L,driverRepository.count());
    }

    @Test
    public  void testThatWhenIAddTwo_DriversCountIsTwo(){
        DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();
        Driver drivertwo = new Driver();
        driverRepository.save(drivertwo);
        driverRepository.save(drivertwo);
        assertEquals(0L,driverRepository.count());
    }

    @Test
    public void testthatWhenIsavedriver_IdIsSet(){
        DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();
        Driver driver = new Driver();
        driverRepository.save(driver);
        assertEquals(driver.getId(),driverRepository.count());
    }

    @Test
    public void testThatWhenIFindById_DriverIsfound(){
        DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();
        Driver driver = new Driver();
        Driver savedDriver = driverRepository.save(driver);
        int driverId = savedDriver.getId();
        assertEquals(savedDriver,driverRepository);    }
    }

//    @Test
//    public void testThatWhenIFindAll_AllDriversAreFound() {
//        DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();
//        Driver driver2 = new Driver();
//        Driver driver3 = new Driver();
//        Driver[] allDrivers = {driver2, driver3};
//        for (Driver driver = allDrivers) {
//            driverRepository.save(driver);
//        }
//        List<Driver> founddrivers = driverRepository.findAll();
//        int count = 0;
//        for (Driver driver = drivers)
//
//    }
//
//    @Test
//    public  void testThatWhenIDelete_DriverIsdeleted(){
//        DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();
//        Driver saveDriver = driverRepository.save(driver);
//        int driverId = saveDriver
//    }
