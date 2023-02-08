package com.lyngo.amondscoffeehousespringboot.repositories;

import com.lyngo.amondscoffeehousespringboot.models.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {
}
