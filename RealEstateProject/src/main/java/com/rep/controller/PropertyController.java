package com.rep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rep.entity.Property;
import com.rep.service.PropertyService;

@RestController
@RequestMapping(value = "property")
@CrossOrigin("*")
public class PropertyController {
    
    @Autowired
    PropertyService propertyService;

    @RequestMapping(
        value = "/create",
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.POST
    )

    public ResponseEntity<Object> createProperty(@RequestBody Property property) {

        try {
            property = propertyService.save(property);
            return new ResponseEntity<>(property, HttpStatus.CREATED);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(
        value = "/findById/{propertyId}",
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.GET
    )

    public ResponseEntity<Object> getPropertyById(@PathVariable Integer propertyId) {

        try {
            Property property = propertyService.findById(propertyId);
            return new ResponseEntity<>(property, HttpStatus.CREATED);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }

    @RequestMapping(
        value = "/findAll", 
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.GET
    )

    public ResponseEntity<Object> findAll() {

        try {
            List<Property> property = propertyService.findAll();
            return new ResponseEntity<>(property, HttpStatus.OK);

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }

    @RequestMapping(
        value = "/findByBathrooms/{bathrooms}", 
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.GET
    )

    public ResponseEntity<Object> findByBathrooms(@PathVariable Integer bathrooms) {

        try {
            List<Property> property = propertyService.findByBathrooms(bathrooms);
            return new ResponseEntity<>(property, HttpStatus.OK);

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }

    @RequestMapping(
        value = "/findBySqFt/{sqFt}", 
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.GET
    )

    public ResponseEntity<Object> findBySqFt(@PathVariable Integer sqFt) {

        try {
            List<Property> property = propertyService.findBySqFt(sqFt);
            return new ResponseEntity<>(property, HttpStatus.OK);

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }

    @RequestMapping(
        value = "/findByRooms", 
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.GET
    )

    public ResponseEntity<Object> findByRooms() {

        try {
            List<Property> property = propertyService.findByRooms();
            return new ResponseEntity<>(property, HttpStatus.OK);

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }

    @RequestMapping(
        value = "/findByPrice/{lowerPrice}/{greaterPrice}", 
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.GET
    )

    public ResponseEntity<Object> findByPrice(@PathVariable Integer lowerPrice, @PathVariable Integer greaterPrice) {

        try {
            List<Property> property = propertyService.findByPrice(lowerPrice, greaterPrice);
            return new ResponseEntity<>(property, HttpStatus.OK);

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }

    @RequestMapping(
        value = "/findByCity/{city}", 
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.GET
    )

    public ResponseEntity<Object> findByCity(@PathVariable String city) {

        try {
            List<Property> property = propertyService.findByCity(city);
            return new ResponseEntity<>(property, HttpStatus.OK);

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }

    @RequestMapping(
        value = "/update",
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE, 
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> updateProperty(@RequestBody Property property) {

        try {
            property = propertyService.update(property);
            return new ResponseEntity<>(property, HttpStatus.CREATED);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }

    @RequestMapping(
        value = "/delete/{propertyId}", 
        method = RequestMethod.DELETE
    )
    public ResponseEntity<Object> deletePropertyById(@PathVariable Integer propertyId) {

        try {
            propertyService.delete(propertyId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        } catch (Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            
        }
    }
}
