package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DTO.NeighborhoodDto;
import com.example.AddressRegistrationSystem.Entity.Neighborhood;
import org.springframework.http.ResponseEntity;

public interface NeighborhoodService {
    ResponseEntity saveNeighborhood(Long districtId, NeighborhoodDto neighborhood);

    Neighborhood findById(Long id);

    ResponseEntity updateNeighborhood(Long id, String newNeighborhood);
}
