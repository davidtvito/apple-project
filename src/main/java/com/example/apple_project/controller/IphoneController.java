package com.example.apple_project.controller;

import com.example.apple_project.dto.IphoneIn;
import com.example.apple_project.model.Iphone;
import com.example.apple_project.service.IphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/iphone")
public class IphoneController {

    @Autowired
    IphoneService iphoneService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllIphones() {
        return new ResponseEntity<>(iphoneService.all(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneIphone(@PathVariable Long id) {
        return new ResponseEntity<>(iphoneService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> insertIphone(@RequestBody IphoneIn iphoneIn) {
        Iphone iphone = iphoneIn.toIphone(iphoneIn);
        iphone = iphoneService.save(iphone);
        return new ResponseEntity<>(iphone, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateIphone(@PathVariable Long id, @RequestBody IphoneIn iphoneIn) {
        Optional<Iphone> dbIphone = iphoneService.findById(id);
        iphoneIn.updateIphone(dbIphone.get());
        Iphone updatedIphone = iphoneService.save(dbIphone.get());
        return new ResponseEntity<>(updatedIphone, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIphone(@PathVariable Long id) {
        Optional<Iphone> dbIphone = iphoneService.findById(id);
        iphoneService.delete(dbIphone.get());
        return new ResponseEntity<>("DELETED", HttpStatus.OK);
    }

    @GetMapping("/color/{color}")
    public ResponseEntity<?> getByColor(@PathVariable String color) {
        return new ResponseEntity<>(iphoneService.findByColor(color), HttpStatus.OK);
    }

    @GetMapping("/storage/{storageGb}")
    public ResponseEntity<?> getByStorage(@PathVariable Integer storageGb) {
        return new ResponseEntity<>(iphoneService.findByStorageGb(storageGb), HttpStatus.OK);
    }

    @GetMapping("/price/less/{price}")
    public ResponseEntity<?> getByPriceLess(@PathVariable Double price) {
        return new ResponseEntity<>(iphoneService.findByPriceLessThan(price), HttpStatus.OK);
    }

}
