package com.example.AddressRegistrationSystem.Service;
import com.example.AddressRegistrationSystem.DAO.DistrictDao;
import com.example.AddressRegistrationSystem.DTO.DistrictDto;
import com.example.AddressRegistrationSystem.Entity.City;
import com.example.AddressRegistrationSystem.Entity.District;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DistrictServiceImpl implements DistrictService{

    private final DistrictDao districtDao;

    private final CityService cityService;


    @Override
    public ResponseEntity<City> saveDistrict(Long cityId, DistrictDto newDistrict) {
        District district=new District();
        district.setDistrictName(newDistrict.getDistrictName());
        district.setCity(cityService.findById(cityId));
        districtDao.save(district);
        log.info("District registration is successful.");
        return ResponseEntity.ok().build();
    }

    @Override
    public District findById(Long id) {
        return districtDao.findById(id).orElse(null);
    }


}
