
package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryImpl implements VehicleRepository {

    private final List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public void save(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void delete(int plateNumber) {
        for (int count = 0; count < vehicles.size(); count++) {
            if (vehicles.get(count).getPlateNumber() == plateNumber) {
                vehicles.remove(count);
                return;
            }
        }
    }

    @Override
    public Driver findByPlateNumber(int plateNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlateNumber() == plateNumber) {
                return vehicle.getDriver();
            }
        }
        return null;
    }

    @Override
    public long count() {
        return vehicles.size();
    }
}
