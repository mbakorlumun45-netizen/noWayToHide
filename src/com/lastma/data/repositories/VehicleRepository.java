package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Vehicle;

public interface VehicleRepository {

    void save(Vehicle vehicle);

    void delete(int plateNumber);

    Driver findByPlateNumber(int plateNumber);
    long count();
}