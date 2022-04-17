package com.tai.bui.msscfactory.web.service;

import com.tai.bui.msscfactory.web.model.CarDTO;

import java.util.UUID;

public interface ICarService {
    public CarDTO getCarById(UUID carId);
}
