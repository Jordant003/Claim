package com.cdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdp.entity.Account;
import com.cdp.entity.Address;
import com.cdp.entity.Cars;
import com.cdp.repo.AccountRepo;

@Service
public class AccountService {

    @Autowired
    AccountRepo accountRepo;

    public Account save(Account account, Address blankAddressWithId) {

        account.setAddress(blankAddressWithId);

        account.setRole("user");
        
        return accountRepo.save(account);
    }

    public Account getByEmail(String email) {

        Account account = accountRepo.getAccountByEmail(email);

        if(account == null) {

            return null;
        }

        return account;
    }

    public Account signIn(Account account) {

        Account signedInAccount = accountRepo.getAccountByEmailAndPassword(account.getEmail(), account.getPassword());

        if(signedInAccount == null) {

            return null;
        }

        return signedInAccount;

    }

    public Account getById(Integer id) {

        return accountRepo.findById(id).get();
    }

    public Account update(Account account) {

        return accountRepo.save(account);

    }

    public void deleteById(Integer id) {

        accountRepo.deleteById(id);

    }

    public Account buyCar(String email, Cars cars) {

        Account account = getByEmail(email);

        account.getUserGarage().add(cars);

        return update(account);
    }
}
