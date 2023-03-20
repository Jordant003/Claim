package com.rep.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rep.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

    @Query(value = "select * from user where email = ?1 && password = ?2", nativeQuery = true)
    public User login(String email, String password);

    @Query(value = "select * from user where email = ?1", nativeQuery = true)
    public User getUserByEmail(String email);

    
    
}
