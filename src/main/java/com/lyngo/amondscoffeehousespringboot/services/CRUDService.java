package com.lyngo.amondscoffeehousespringboot.services;

import java.util.List;

public interface CRUDService<T, ID> {
    T find(ID id);
    List<T> findAll();
    void save(T entity);
    void update(T entity);
    T delete(T entity);
}
