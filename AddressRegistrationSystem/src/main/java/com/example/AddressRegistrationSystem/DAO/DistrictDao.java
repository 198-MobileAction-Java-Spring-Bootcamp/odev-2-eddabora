package com.example.AddressRegistrationSystem.DAO;

import com.example.AddressRegistrationSystem.Entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictDao extends JpaRepository<District,Long> {
}
