package com.example.AddressRegistrationSystem.DAO;

import com.example.AddressRegistrationSystem.Entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodDao extends JpaRepository<Neighborhood,Long> {
}
