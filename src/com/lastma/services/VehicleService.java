package com.lastma.services;

import com.lastma.data.models.Vehicle;
import com.lastma.data.repositories.DriverRepository;
import com.lastma.data.repositories.VehicleRepository;

public class VehicleService {
    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    public void registerVehicle(Vehicle vehicle) {
        repository.save(vehicle);
    }
        public long countVehicles() {
            return repository.count();
    }
}
