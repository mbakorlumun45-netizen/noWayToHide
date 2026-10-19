package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;
import com.lastma.services.VehicleService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        VehicleRepositoryImpl repository2 = new VehicleRepositoryImpl();

        service.registerVehicle(new Vehicle());
        service.registerVehicle(new Vehicle());

        assertEquals(2L,service.countVehicles());
    }
}
