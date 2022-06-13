package com.example.AddressRegistrationSystem.DTO;

import lombok.Data;

@Data
public class AddressRequest {
    private String cityName;
    private String countryName;
    private String streetName;
    private String districtName;
    private String neighborhoodName;

}
