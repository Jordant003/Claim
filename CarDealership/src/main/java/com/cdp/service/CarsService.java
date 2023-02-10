package com.cdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdp.entity.Cars;
import com.cdp.repo.CarsRepo;

@Service
public class CarsService {
    
    @Autowired
    CarsRepo carsRepo;


    public Cars save(Cars cars) {

        return carsRepo.save(cars);
    }

    public List<Cars> getAll() {

        carsRepo.findAll();

        return carsRepo.findAll();
    }

    public List<Cars> getByMakeAndNeworUsed(String make, String newOrUsed) {

        return carsRepo.getByMakeAndNeworUsed(make, newOrUsed);

    }

    public Cars getCarsById(Integer vehicleId) {
        return carsRepo.findById(vehicleId).get();
    }


}
