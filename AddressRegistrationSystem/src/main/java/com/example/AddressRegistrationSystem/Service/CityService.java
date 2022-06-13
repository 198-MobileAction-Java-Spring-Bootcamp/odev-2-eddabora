package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DTO.CityDto;
import com.example.AddressRegistrationSystem.Entity.City;
import org.springframework.http.ResponseEntity;

public interface CityService {

      ResponseEntity save(Long countryId, CityDto city);

      City findById(Long id);

      String findCity(String plate);

}
