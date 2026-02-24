package com.example.apple_project.service;

import com.example.apple_project.model.Iphone;
import com.example.apple_project.repo.IphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IphoneService {
    @Autowired
    IphoneRepository repository;

    public Iterable<Iphone> all() {
        return repository.findAll();
    }

    public Optional<Iphone> findById(Long id) {
        return repository.findById(id);
    }

    public Iphone save(Iphone iphone) {
        return repository.save(iphone);
    }

    public void delete(Iphone iphone) {
        repository.delete(iphone);
    }

    public Iterable<Iphone> findByColor(String color) {
        return repository.findByColor(color);
    }

    public Iterable<Iphone> findByStorageGb(Integer storageGb) {
        return repository.findByStorageGb(storageGb);
    }

    public Iterable<Iphone> findByPriceLessThan(Double price) {
        return repositoryfindByPriceLessThan(price);
    }
}
