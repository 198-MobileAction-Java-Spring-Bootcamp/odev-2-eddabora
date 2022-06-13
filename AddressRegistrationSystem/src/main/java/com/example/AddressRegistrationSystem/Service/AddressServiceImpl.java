package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DAO.AddressDao;
import com.example.AddressRegistrationSystem.DTO.AddressRequest;
import com.example.AddressRegistrationSystem.Entity.Address;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AddressServiceImpl implements AddressService {
   private final AddressDao addressDao;

    public void saveAddress(AddressRequest newAddress) {

        Address address = new Address();

        addressDao.save(address);
        log.info("Address registration is successful.");

    }

    @Override
    public ResponseEntity<Address> deleteAddress(Long id) {

        Optional<Address> comments = addressDao.findById(id);
        if (!comments.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        addressDao.delete(comments.get());

        return ResponseEntity.noContent().build();
    }



}
