package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

public interface DriverRepository {
   long count();

   Driver save(Driver driver);

   long count(Driver driver);

   Driver findById(int id);

   void del(int id);

   void add(Driver driver);
}