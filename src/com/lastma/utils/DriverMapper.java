package com.lastma.utils;

import com.lastma.data.models.Driver;
import com.lastma.dtos.requests.AddDriverRequest;
import com.lastma.dtos.responses.AddDriverResponse;

public class DriverMapper {
    public static Driver toDriver(AddDriverRequest request) {
        Driver driver = new Driver();

        driver.setFullName(request.getFullName());
        driver.setEmail(request.getEmail());

        return driver;
    }
}
