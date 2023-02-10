package com.cdp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdp.entity.Cars;

@Repository
public interface CarsRepo extends JpaRepository<Cars, Integer> {

    @Query(value = "select * from cars where user_garage is null && make = ?1 && new_or_used = ?2", nativeQuery = true)
    public List<Cars> getByMakeAndNeworUsed(String make, String newOrUsed);

    
}