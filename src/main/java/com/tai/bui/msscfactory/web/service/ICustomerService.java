package com.tai.bui.msscfactory.web.service;

import com.tai.bui.msscfactory.web.model.CustomerDTO;

import java.util.UUID;

public interface ICustomerService {
    CustomerDTO getCustomerById(UUID id);
}
