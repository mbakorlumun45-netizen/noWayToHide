
package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryImplTest {

    @Test
    public void testThatWhenISaveOneVehicle_CountIsOne() {
        VehicleRepositoryImpl vehicleRepository = new VehicleRepositoryImpl();

        Vehicle vehicle = new Vehicle();
        vehicleRepository.save(vehicle);

        assertEquals(1L, vehicleRepository.count());
    }

    @Test
    public void testThatWhenIAddTwo_VehicleCountIsTwo() {
        VehicleRepositoryImpl vehicleRepository = new VehicleRepositoryImpl();

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();

        vehicleRepository.save(vehicle1);
        vehicleRepository.save(vehicle2);

        assertEquals(2L, vehicleRepository.count());
    }

    @Test
    public void testthatWhenIsaveVehicle_PlateNumberIsSet(){
        VehicleRepositoryImpl vehicleRepository = new VehicleRepositoryImpl();
        Vehicle vehicle = new Vehicle();
        vehicleRepository.save(vehicle);
        assertEquals(0,vehicle.getPlateNumber());
    }

    @Test
    public void testThatWhenISaveDriver_DriverIsFound() {
        DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();

        Driver driver = new Driver();
        Driver savedDriver = driverRepository.save(driver);

        Driver foundDriver = driverRepository.findById(savedDriver.getId());

        assertEquals(savedDriver, foundDriver);
    }

//    @Test
//    public void testThatWhenIFindByPlateNumber_DriverIsFound() {
//        DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();
//
//        Driver driver = new Driver();
//        Driver savedDriver = driverRepository.save(driver);
//
//        int driverId = savedDriver.getId();
//
//        Driver foundDriver = driverRepository.findByPlateNumber(plateNUmber);
//
//        assertEquals(savedDriver, foundDriver);
//    }
}
