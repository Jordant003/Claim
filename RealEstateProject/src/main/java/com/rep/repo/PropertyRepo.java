package com.rep.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rep.entity.Property;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Integer> {
    
    @Query(value = "select * from property where bathrooms = ?1", nativeQuery = true)
    public List<Property> findByBathrooms(Integer bathrooms);

    @Query(value = "select * from property where sqft >= ?1", nativeQuery = true)
    public List<Property> findBySqFt(Integer sqft);

    @Query(value = "select * from property where rooms = ?1", nativeQuery = true)
    public List<Property> findByRooms();

    @Query(value = "select * from property where price >= ?1 and price <= ?2", nativeQuery = true)
    public List<Property> findByPrice(Integer lowerPrice, Integer greaterPrice);

    @Query(value = "select * from property where city = ?1", nativeQuery = true)
    public List<Property> findByCity(String city);
}
