package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DAO.CityDao;
import com.example.AddressRegistrationSystem.DTO.CityDto;
import com.example.AddressRegistrationSystem.Entity.City;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CityServiceImpl implements CityService {
    private final CityDao cityDao;
    private final CountryService countryService;

    @Override
    public ResponseEntity<City> save(Long countryId, CityDto newCity) {

        City city = new City();
        city.setCityName(newCity.getCityName());
        city.setPlate(newCity.getPlate());
        city.setCountry(countryService.findById(countryId));

        cityDao.save(city);
        log.info("City registration is successful.");
        return ResponseEntity.ok().build();
    }

    public City findById(Long id) {

        return cityDao.findById(id).orElse(null);
    }

    @Override
    public String findCity(String plate) {
        String cityName = this.cityDao.findByPlate(plate).getCityName();
        if (StringUtils.isNotEmpty(cityName))
            return cityName;
        return null;

    }


}
