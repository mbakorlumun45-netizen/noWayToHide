package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerRepositoryImplTest {

    @Test
    public void testthatWhenISaveOneOfficer_countIsOne(){
        OfficerRepositoryImpl officerRepository = new OfficerRepositoryImpl();
        Officer officer = new Officer();
        officerRepository.save(officer);
        assertEquals(0L,officerRepository.count());
    }

    @Test
    public  void testThatWhenIAddTwo_OfficersCountIsTwo(){
        OfficerRepositoryImpl officerRepository = new OfficerRepositoryImpl();
        Officer officertwo = new Officer();
        officerRepository.save(officertwo);
        officerRepository.save(officertwo);
        assertEquals(0L,officerRepository.count());
    }

    @Test
    public void testthatWhenIsaveOfficer_IdIsSet(){
        OfficerRepositoryImpl officerRepository = new OfficerRepositoryImpl();
        Officer officer = new Officer();
        officerRepository.save(officer);
        assertEquals(officer.getId(),officerRepository.count());
    }

    @Test
    public void testThatWhenIFindById_OfficerIsfound(){
        OfficerRepositoryImpl officerRepository = new OfficerRepositoryImpl();
        Officer officer = new Officer();
        officer.setId(1);
        officerRepository.save(officer);
        Officer myOfficer = officerRepository.findById(1);
        assertEquals(officer,myOfficer);    }
}

