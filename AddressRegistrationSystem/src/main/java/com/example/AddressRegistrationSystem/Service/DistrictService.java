package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DTO.DistrictDto;
import com.example.AddressRegistrationSystem.Entity.District;
import org.springframework.http.ResponseEntity;

public interface DistrictService {
     ResponseEntity saveDistrict(Long cityId, DistrictDto district);
     District findById(Long id);
}
