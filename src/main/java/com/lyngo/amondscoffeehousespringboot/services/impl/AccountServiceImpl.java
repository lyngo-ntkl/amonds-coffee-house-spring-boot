package com.lyngo.amondscoffeehousespringboot.services.impl;

import com.lyngo.amondscoffeehousespringboot.models.entity.Account;
import com.lyngo.amondscoffeehousespringboot.repositories.AccountRepository;
import com.lyngo.amondscoffeehousespringboot.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    AccountRepository
    @Override
    public Account find(String s) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public void save(Account entity) {

    }

    @Override
    public void update(Account entity) {

    }

    @Override
    public Account delete(Account entity) {
        return null;
    }
}
