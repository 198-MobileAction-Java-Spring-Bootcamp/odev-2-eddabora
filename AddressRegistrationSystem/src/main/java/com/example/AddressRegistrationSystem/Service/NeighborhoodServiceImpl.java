package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DAO.NeighborhoodDao;
import com.example.AddressRegistrationSystem.DTO.NeighborhoodDto;
import com.example.AddressRegistrationSystem.Entity.Neighborhood;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NeighborhoodServiceImpl implements NeighborhoodService {
    private final NeighborhoodDao neighborhoodDao;
    private final DistrictService districtService;

    @Override
    public ResponseEntity<Neighborhood> saveNeighborhood(Long districtId, NeighborhoodDto newNeighborhood) {
        Neighborhood neighborhood=new Neighborhood();
        neighborhood.setNeighborhoodName(newNeighborhood.getNeighborhoodName());
        neighborhood.setDistrict(districtService.findById(districtId));
        neighborhoodDao.save(neighborhood);
        log.info("Neighborhood registration is successful.");
        return ResponseEntity.ok().build();
    }

    @Override
    public Neighborhood findById(Long id) {
            return neighborhoodDao.findById(id).orElse(null);
    }

    @Override //Update NeighborhoodName
    public ResponseEntity<Neighborhood> updateNeighborhood(Long id,String newNeighborhood) {
        Neighborhood neighborhood = neighborhoodDao.findById(id).orElseThrow();
        neighborhood.setNeighborhoodName(newNeighborhood);
        neighborhood = neighborhoodDao.save(neighborhood);
        return ResponseEntity.ok(neighborhood);
    }
}