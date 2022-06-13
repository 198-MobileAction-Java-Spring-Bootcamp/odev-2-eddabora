package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DTO.CountryDto;
import com.example.AddressRegistrationSystem.Entity.Country;

public interface CountryService {

    void save(CountryDto country);

    String findCountry(Long countryCode);
    Country findById(Long id);

    Country findByCountryCode(Long coutryCode);
}
