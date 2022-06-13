package com.example.AddressRegistrationSystem.Service;


import com.example.AddressRegistrationSystem.DTO.AddressRequest;
import com.example.AddressRegistrationSystem.Entity.Address;
import org.springframework.http.ResponseEntity;

public interface AddressService {

    void saveAddress(AddressRequest address);

    ResponseEntity<Address> deleteAddress(Long id);
}
