package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DAO.StreetDao;
import com.example.AddressRegistrationSystem.DTO.StreetDto;
import com.example.AddressRegistrationSystem.Entity.Street;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StreetServiceImpl implements StreetService{

    private final StreetDao streetDao;
    private final NeighborhoodService neighborhoodService;
    @Override
    public ResponseEntity<Street> saveStreet(Long neighborhodId, StreetDto newStreet) {
       Street street= new Street();
       street.setStreetName(newStreet.getStreetName());
       street.setApartmentCode(newStreet.getApartmentCode());
       street.setDoorCode(newStreet.getDoorCode());
       street.setNeighborhood(neighborhoodService.findById(neighborhodId));

       streetDao.save(street);
       log.info("Street registration is successful.");
       return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity updateStreet(Long id, String newStreet) {
        Street street = streetDao.findById(id).orElseThrow();
        street.setStreetName(newStreet);
        street = streetDao.save(street);
        return ResponseEntity.ok(street);

    }

}
