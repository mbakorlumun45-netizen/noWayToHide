import com.lastma.data.models.Driver;
import com.lastma.data.models.Vehicle;
import com.lastma.data.repositories.DriverRepository;
import com.lastma.data.repositories.DriverRepositoryImpl;
import com.lastma.data.repositories.VehicleRepositoryImpl;
import com.lastma.dtos.requests.AddDriverRequest;
import com.lastma.dtos.responses.AddDriverResponse;
import com.lastma.services.DriverService;
import com.lastma.services.VehicleService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class DriverServiceTest {
    @Test
    public void tepublicstThatWhenNoDriverIsRegistered_countIsZero() {
        DriverRepositoryImpl repository = new DriverRepositoryImpl();
        DriverService service = new DriverService(repository);

        assertEquals(0L, service.countDrivers());
    }
    @Test
    public void testThatIcanAddDriver(){
        DriverRepository repository = new DriverRepositoryImpl();
        DriverService service = new DriverService(repository);

        Driver driver = new Driver();

        service.addDriver(driver);

        assertEquals(0L, service.countDrivers());
    }

    @Test
    public void testThatIAddADriver() {
        DriverRepositoryImpl repository = new DriverRepositoryImpl();
        AddDriverRequest  addDriverRequest = new AddDriverRequest();

        addDriverRequest.setFullName("Orban");
        addDriverRequest.setEmail("orban@gmail.com");

        DriverService driverService = new DriverService(repository);
        AddDriverResponse response = DriverService.addNewDriver(addDriverRequest);

        assertEquals("Driver saved successfully", response.getResponse());
    }

//    @Test
//    public void testThatICanFindDriverById(){
//        DriverRepositoryImpl repository = new DriverRepositoryImpl();
//        DriverService service = new DriverService(repository);
//        Driver driver = new Driver();
//
//        driver.setFullName("Orban");
//        driver.setEmail("orban@gmail.com");
//
//        Driver foundDriver = service.findDriverId(1);
//        assertEquals(1, foundDriver.getId());
//    }

    }
