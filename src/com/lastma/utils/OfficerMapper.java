package com.lastma.utils;

import com.lastma.data.models.Officer;
import com.lastma.dtos.requests.AddOfficerRequest;

public class OfficerMapper {
    public static Officer toOfficer(AddOfficerRequest request){
        Officer officer = new Officer();

        officer.setFullName(request.getFullName());
        officer.setEmail(request.getEmail());

        return officer;
    }
}
