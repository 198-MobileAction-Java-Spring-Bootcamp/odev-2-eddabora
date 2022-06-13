package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DTO.StreetDto;
import org.springframework.http.ResponseEntity;

public interface StreetService {
    ResponseEntity saveStreet(Long neighborhodId, StreetDto street);

    ResponseEntity updateStreet(Long id, String newStreet);


}
