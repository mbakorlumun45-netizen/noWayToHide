
package com.lastma.utils;

import com.lastma.data.models.Vehicle;
import com.lastma.dtos.requests.AddVehicleRequest;

public class VehicleMapper {

    public static Vehicle toVehicle(AddVehicleRequest request) {
        Vehicle vehicle = new Vehicle();

        vehicle.setBrand(request.getBrand());
        vehicle.setModel(request.getModel());
        vehicle.setPlateNumber(request.getPlateNumber());

        return vehicle;
    }
}
