package com.tai.bui.msscfactory.web.service;

import com.tai.bui.msscfactory.web.model.CarDTO;
import com.tai.bui.msscfactory.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService implements ICustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder().id(customerId).name("Customer name").build();
    }

}
