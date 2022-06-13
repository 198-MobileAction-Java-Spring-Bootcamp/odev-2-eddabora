package com.example.AddressRegistrationSystem.DAO;

import com.example.AddressRegistrationSystem.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends JpaRepository<City,Long> {


    City findByPlate(String plate);

    City findByCityName(String city);
}
