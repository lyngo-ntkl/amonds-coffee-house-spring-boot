package com.lyngo.amondscoffeehousespringboot.services.impl;

import com.lyngo.amondscoffeehousespringboot.models.entity.Account;
import com.lyngo.amondscoffeehousespringboot.repositories.AccountRepository;
import com.lyngo.amondscoffeehousespringboot.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Account find(String s) {
        return accountRepository.findById(s).orElse(null);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void update(Account account) {
        accountRepository.findById(account.getId()).ifPresent((acc -> {
            acc.setPassword(acc.getPassword());
            acc.setUsername(acc.getUsername());
            acc.setRoleId(acc.getRoleId());
            accountRepository.save(acc);
        }));
    }

    @Override
    public void delete(Account account) {
        accountRepository.deleteById(account.getId());
    }
}
