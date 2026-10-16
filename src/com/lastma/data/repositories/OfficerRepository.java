package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;

public interface OfficerRepository {
    long count();

    Officer save(Officer officer);

    long count(Driver driver);

    Driver findById(int id);

    void del(int id);

}
