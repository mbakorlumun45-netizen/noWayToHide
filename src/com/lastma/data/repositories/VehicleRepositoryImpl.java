
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

    @Override
    public Vehicle findVehicleByPlateNumber(int plateNumber) {
        Vehicle foundVehicle = null;
        for (Vehicle vehicle : vehicles){
            if (vehicle.getPlateNumber() == plateNumber){
                foundVehicle = vehicle;
            }
        }
        return foundVehicle;
    }

    @Override
    public Vehicle findVehicleByPlateNumber(int plateNumber, Vehicle vehicle) {
        for (Vehicle foundVehicle : vehicles) {
            if (foundVehicle.getPlateNumber() == plateNumber) {
                return foundVehicle;
            }
        }
        return null;
    }

    @Override
    public Vehicle updateVehicle(int plateNumber, Vehicle vehicle) {
        for (int count = 0; count < vehicles.size(); count++) {
            if (vehicles.get(count).getPlateNumber() == plateNumber) {
                vehicles.set(count, vehicle);
                return vehicle;
            }
        }
        return null;
    }
}