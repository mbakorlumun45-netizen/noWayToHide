package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Vehicle;

public interface VehicleRepository {

    void save(Vehicle vehicle);

    void delete(int plateNumber);

    Driver findByPlateNumber(int plateNumber);
    long count();

    Vehicle findVehicleByPlateNumber(int plateNumber);

//    Vehicle findVehicleByPlateNumber(int plateNumber, Vehicle vehicle);

    Vehicle findVehicleByPlateNumber(int plateNumber, Vehicle vehicle);

    Vehicle updateVehicle(int plateNumber, Vehicle vehicle);

//    Vehicle findVehicleByPlateNumber(int plateNumber);
//
//    Vehicle updateVehicle(int plateNumber, Vehicle vehicle);
//
//    int updateVehicle(updateVehicleint plateNumber, Vehicle vehicle);
}