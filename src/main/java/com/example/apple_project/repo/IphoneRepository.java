package com.example.apple_project.repo;

import com.example.apple_project.model.Iphone;
import org.springframework.data.repository.CrudRepository;

public interface IphoneRepository extends CrudRepository<Iphone,Long> {
    Iterable<Iphone> findByColor(String color);
    Iterable<Iphone> findByStorageGb(Integer storageGb);
    Iterable<Iphone> findByPriceLessThan(Double price);
}