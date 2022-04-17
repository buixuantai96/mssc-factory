package com.tai.bui.msscfactory.web.controller;


import com.tai.bui.msscfactory.web.model.CarDTO;
import com.tai.bui.msscfactory.web.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{carId}")
    public ResponseEntity<CarDTO> getCar(@PathVariable("carId") UUID carId) {
        return new ResponseEntity<>(carService.getCarById(carId), HttpStatus.OK);
    }
}
