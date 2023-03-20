package com.rep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rep.entity.Property;
import com.rep.repo.PropertyRepo;

@Service
public class PropertyService {
    
    @Autowired
    PropertyRepo propertyRepo;

    public Property save(Property property) {

        return propertyRepo.save(property);
    }

    public Property findById(Integer propertyId) {

        return propertyRepo.findById(propertyId).get();
    }

    public Property update(Property property) throws Exception{

        if(property.getId() == null) {
            throw new Exception("No id present on object");
        }

        return save(property);
    }

    public List<Property> findAll() {

        return propertyRepo.findAll();
    }

     public List<Property> findByBathrooms(Integer bathrooms) {

        return propertyRepo.findByBathrooms(bathrooms);
     }


    public List<Property> findBySqFt(Integer sqFt) {

        return propertyRepo.findBySqFt(sqFt);
    }

    public List<Property> findByRooms() {

        return propertyRepo.findByRooms();
    }

    public List<Property> findByPrice(Integer lowerPrice, Integer greaterPrice) {

        return propertyRepo.findByPrice(lowerPrice, greaterPrice);
    }

    public List<Property> findByCity(String city) {

        return propertyRepo.findByCity(city);
    }

    public void delete(Integer propertyId) {

        propertyRepo.deleteById(propertyId);
    }
    
}
