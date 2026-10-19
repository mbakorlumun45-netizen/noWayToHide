package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;

import java.util.ArrayList;
import java.util.List;

public class OfficerRepositoryImpl implements OfficerRepository {
    private List<Officer> officers = new ArrayList<>();
    private int count = 0;

    @Override
    public long count() {
        return count;
    }

    @Override
    public void save(Officer officer) {
        count++;
        officers.add(officer);


    }


    @Override
    public Officer findById(int id) {
        for(Officer officer : officers){
            if(officer.getId() == id){
                return officer;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for(Officer officer : officers){
            if(officer.getId() == id){
                officer.setId(0);
            }
        }
        count--;
    }


}
