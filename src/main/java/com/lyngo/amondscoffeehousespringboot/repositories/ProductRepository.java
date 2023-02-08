package com.lyngo.amondscoffeehousespringboot.repositories;

import com.lyngo.amondscoffeehousespringboot.models.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
