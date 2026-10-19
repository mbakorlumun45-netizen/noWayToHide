package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;

public interface OfficerRepository {
    long count();

    void  save(Officer officer);


    Officer findById(int id);

    void delete(int id);

}
