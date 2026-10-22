package com.lastma.services;

import com.lastma.data.models.Vehicle;
import com.lastma.data.repositories.VehicleRepository;
import com.lastma.dtos.requests.AddVehicleRequest;
import com.lastma.dtos.responses.AddVehicleResponse;
import com.lastma.utils.VehicleMapper;

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

    public Vehicle findVehicleByPlateNumber(int plateNumber){
        return repository.findVehicleByPlateNumber(plateNumber);
    }

    public Vehicle updateVehicle(int plateNumber,Vehicle vehicle){
        return repository.updateVehicle(plateNumber, vehicle);

    }

    public AddVehicleResponse addNewVehicle(AddVehicleRequest addVehicleRequest){
        Vehicle vehicle = VehicleMapper.toVehicle(addVehicleRequest);
        repository.save(vehicle);


//        Vehicle vehicle = new Vehicle();

//        vehicle.setBrand(addVehicleRequest.getBrand());
//        vehicle.setModel(addVehicleRequest.getModel());
//        vehicle.setPlateNumber(addVehicleRequest.getPlateNumber());
//
//        repository.save(vehicle);

       return createAddVehicleResponse();
    }


    private static AddVehicleResponse createAddVehicleResponse() {
        AddVehicleResponse addVehicleResponse = new AddVehicleResponse();
        addVehicleResponse.setResponse("Vehicle added successfully");
        return addVehicleResponse;
    }
}
