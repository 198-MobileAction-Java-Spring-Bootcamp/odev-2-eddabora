package com.example.AddressRegistrationSystem.DAO;

import com.example.AddressRegistrationSystem.Entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetDao extends JpaRepository<Street,Long> {

    Street findByStreetName(String streetName);
}
