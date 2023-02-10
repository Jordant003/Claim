package com.cdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdp.entity.Address;
import com.cdp.repo.AddressRepo;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public Address save(Address address) {

        return addressRepo.save(address);
    }
    
}
