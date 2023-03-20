package com.rep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rep.entity.Property;
import com.rep.entity.User;
import com.rep.repo.UserRepo;

@Service
public class UserService {
    
    @Autowired
    UserRepo userRepo;

    public User save(User user) {

        return userRepo.save(user);
    }
    
    public User findUserById(Integer id) {

        return userRepo.findById(id).get();
    }

    public void deleteUserById(Integer id) {

        userRepo.deleteById(id);
    }

    public User login(User user) throws Exception{

        user = userRepo.login(user.getEmail(), user.getPassword());

        if(user != null) {
            return user;
        }

        throw new Exception("Email or password is incorrect. Try again");
    }

    public User getUserByEmail(String email) throws Exception {

        User user = userRepo.getUserByEmail(email);

        if(user != null) {
            return user;
        }

        throw new Exception("Your email does not exiest. Go login.");
    }

    public User updateUser(User user) throws Exception {

        if(user.getId() != null || findUserById(user.getId()) != null) {
            return save(user);
        }

        throw new Exception("Must have existing id or existing id");
    }

    public User buyProperty(User user, Property property) {

        user.getProperty().add(property);
        
        return userRepo.save(user);
    }
}
