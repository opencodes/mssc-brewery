package com.rkjha.msscbrewery.web.service;

import com.rkjha.msscbrewery.web.dto.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
