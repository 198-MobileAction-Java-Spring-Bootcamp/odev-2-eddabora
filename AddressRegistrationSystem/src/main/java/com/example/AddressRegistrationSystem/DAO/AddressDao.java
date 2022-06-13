package com.example.AddressRegistrationSystem.DAO;

import com.example.AddressRegistrationSystem.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressDao extends JpaRepository<Address,Long> {
}
