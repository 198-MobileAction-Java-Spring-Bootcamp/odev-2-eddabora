package com.example.AddressRegistrationSystem.Service;

import com.example.AddressRegistrationSystem.DAO.CountryDao;
import com.example.AddressRegistrationSystem.DTO.CountryDto;
import com.example.AddressRegistrationSystem.Entity.Country;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CountryServiceImpl implements CountryService{

    private final CountryDao countryDao;
    @Override
    public void save(CountryDto newCountry) {

        Country country = new Country();
        country.setCountryName(newCountry.getCountryName());
        country.setCountryCode(newCountry.getCountryCode());
        countryDao.save(country);
        log.info("Country registration is successful.");
    }

    public String findCountry(Long countryCode) {
        String countryName = this.countryDao.findByCountryCode(countryCode).getCountryName();
        if (StringUtils.isNotEmpty(countryName))
            return countryName;
        return null;
    }

    public Country findById(Long id) {

        return countryDao.findById(id).orElse(null);
    }

    @Override
    public Country findByCountryCode(Long coutryCode) {
        return null;
    }

}
