package com.rkjha.msscbrewery.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    public UUID id;
    public String beerName;
    public String beesrStyle;
    public Long upc;
}
