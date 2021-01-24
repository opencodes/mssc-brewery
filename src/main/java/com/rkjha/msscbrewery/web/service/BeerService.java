package com.rkjha.msscbrewery.web.service;

import com.rkjha.msscbrewery.web.dto.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
