package com.cdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdp.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
    
    @Query(value = "select * from account where email = ?1", nativeQuery = true)
    public Account getAccountByEmail(String email);

    @Query(value = "select * from account where email = ?1 && password = ?2", nativeQuery = true)
    public Account getAccountByEmailAndPassword(String email, String password);

}

