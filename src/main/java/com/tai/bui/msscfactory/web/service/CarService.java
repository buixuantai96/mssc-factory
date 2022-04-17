package com.tai.bui.msscfactory.web.service;

import com.tai.bui.msscfactory.web.model.CarDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CarService implements ICarService {

    @Override
    public CarDTO getCarById(UUID carId) {
        return CarDTO.builder().id(UUID.randomUUID()).name("Toyota").color("red").build();
    }
}
