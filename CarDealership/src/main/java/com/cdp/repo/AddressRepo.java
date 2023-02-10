package com.cdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdp.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
    
}
