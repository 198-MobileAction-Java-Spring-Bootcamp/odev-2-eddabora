package com.example.AddressRegistrationSystem.DAO;

import com.example.AddressRegistrationSystem.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface CountryDao extends JpaRepository<Country,Long> {

  Country findByCountryCode(Long countryCode);

  Country findByCountryName(String country);


}
