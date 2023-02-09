package com.lyngo.amondscoffeehousespringboot.services;

import java.util.List;

public interface CRUDService<T, ID> {
    T find(ID id);
    List<T> findAll();
    void save(T t);
    void update(T t);
    void delete(T t);
}
