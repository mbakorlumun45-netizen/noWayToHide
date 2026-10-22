package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.repositories.DriverRepository;
import com.lastma.dtos.requests.AddDriverRequest;
import com.lastma.dtos.responses.AddDriverResponse;
import com.lastma.utils.DriverMapper;

public class DriverService {
    private static DriverRepository repository = null;

    public DriverService(DriverRepository repository){
        this.repository = repository;
    }

    public void addDriver(Driver driver) {
        repository.save(driver);
    }

    public long countDrivers() {
        return repository.count();
    }

    public static AddDriverResponse addNewDriver(AddDriverRequest addDriverRequest) {

        Driver driver = DriverMapper.toDriver(addDriverRequest);
        repository.save(driver);

//        Vehicle vehicle = new Vehicle();

//        vehicle.setBrand(addVehicleRequest.getBrand());
//        vehicle.setModel(addVehicleRequest.getModel());
//        vehicle.setPlateNumber(addVehicleRequest.getPlateNumber());
//
//        repository.save(vehicle);


        return createAddDriverResponse();
    }

    public static AddDriverResponse createAddDriverResponse(){
        AddDriverResponse addDriverResponse = new AddDriverResponse();

        addDriverResponse.setResponse("Driver saved successfully");
        return addDriverResponse;
    }


    public AddDriverResponse registerDriverResponse(Driver driver) {
        AddDriverResponse addDriverResponse = new AddDriverResponse();

        addDriverResponse.setResponse("Driver registered successfully");
        return addDriverResponse;
    }

//    public Driver findDriverId(int i) {
//    }
}
