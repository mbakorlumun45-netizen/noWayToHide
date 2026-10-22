package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;
import com.lastma.dtos.requests.AddVehicleRequest;
import com.lastma.dtos.responses.AddVehicleResponse;
import com.lastma.services.VehicleService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VehicleServiceTest {
    @Test
    public void testThatWhenNoVehicleIsRegistered_countIsZero() {
        VehicleRepositoryImpl repository = new VehicleRepositoryImpl();
        VehicleService service = new VehicleService(repository);

        assertEquals(0L, service.countVehicles());
    }
    @Test
    public void testThatRegisteringVehicleIncreasesCount() {
        VehicleRepositoryImpl repository = new VehicleRepositoryImpl();
        VehicleService service = new VehicleService(repository);

        service.registerVehicle(new Vehicle());

        assertEquals(1L, service.countVehicles());
    }

    @Test
    public void testThatRegisteringTwoVehiclesCountBecomeTwo(){
        VehicleRepositoryImpl repository1 = new VehicleRepositoryImpl();
        VehicleService service = new VehicleService(repository1);

        service.registerVehicle(new Vehicle());
        service.registerVehicle(new Vehicle());

        assertEquals(2L,service.countVehicles());
    }

    @Test
    public void testThatICanFindVehicleByPlateNumber(){
        VehicleRepositoryImpl repository = new VehicleRepositoryImpl();
        VehicleService service = new VehicleService(repository);
        Vehicle vehicle = new Vehicle();

        vehicle.setPlateNumber(12345);

        service.registerVehicle(vehicle);

        Vehicle foundVehicle = service.findVehicleByPlateNumber(12345);
        assertEquals(12345, foundVehicle.getPlateNumber());
    }

    @Test
    public void testThatICanUpdateAvehicleDetails(){
        VehicleRepositoryImpl repository = new VehicleRepositoryImpl();
        VehicleService service = new VehicleService(repository);

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Honda");
        vehicle.setModel("Accord");
        vehicle.setPlateNumber(12345);

        service.registerVehicle(vehicle);

        Vehicle updateVehicle = new Vehicle();
        updateVehicle.setBrand("Corolla");
        updateVehicle.setModel("Toyota");
        updateVehicle.setPlateNumber(54321);

        service.updateVehicle(12345, updateVehicle);

        Vehicle foundVehicle = service.findVehicleByPlateNumber(54321);

        assertNotNull(foundVehicle);
        assertEquals("Toyota", foundVehicle.getBrand());
        assertEquals("Corolla", foundVehicle.getModel());
        assertEquals(54321, foundVehicle.getPlateNumber());

    }


    @Test
    public void testICanAddVehicle(){
        VehicleRepositoryImpl repository = new VehicleRepositoryImpl();

        AddVehicleRequest addVehicleRequest = new AddVehicleRequest();
         addVehicleRequest.setBrand("Mercedes");
         addVehicleRequest.setModel("ML class");
         addVehicleRequest.setPlateNumber(12345);

         VehicleService vehicleService  = new VehicleService(repository);
         AddVehicleResponse response  = vehicleService.addNewVehicle(addVehicleRequest);

         assertEquals("Vehicle added successfully", response.getResponse());
    }
}
