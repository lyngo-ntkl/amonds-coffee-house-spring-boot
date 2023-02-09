package com.lyngo.amondscoffeehousespringboot.services.impl;

import com.lyngo.amondscoffeehousespringboot.models.entity.Product;
import com.lyngo.amondscoffeehousespringboot.repositories.ProductRepository;
import com.lyngo.amondscoffeehousespringboot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product find(Integer integer) {
        return productRepository.findById(integer).orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productRepository.findById(product.getId()).ifPresent((product1 -> {
            product1.setProductName(product.getProductName());
            product1.setPrice(product.getPrice());
            product1.setQuantity(product.getQuantity());
            product1.setDescription(product.getDescription());
            product1.setCategory(product.getCategory());
            productRepository.save(product1);
        }));
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }


}
