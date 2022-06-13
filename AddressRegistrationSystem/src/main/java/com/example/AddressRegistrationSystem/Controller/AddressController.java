package com.example.AddressRegistrationSystem.Controller;

import com.example.AddressRegistrationSystem.DTO.*;
import com.example.AddressRegistrationSystem.Service.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;
    private final CityService cityService;
    private final CountryService countryService;
    private final DistrictService districtService;
    private final NeighborhoodService neighborhoodService;
    private final StreetService streetService;



    @Operation(
            tags = "Address Controller"
    )

    @PostMapping("/country") //Save Country
    public ResponseEntity<?> saveCountry(@RequestBody CountryDto country) throws Exception {
        countryService.save(country);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/country/{countryCode}") //Find Country
    public ResponseEntity<String> findCountry(@RequestParam Long countryCode) throws Exception {
        String countryName = countryService.findCountry(countryCode);
        return new ResponseEntity<>(countryName, HttpStatus.OK);
    }

    @PostMapping("/{countryId}/city") //Save City
    public ResponseEntity<?> saveCity(@PathVariable Long countryId,@RequestBody CityDto city) throws Exception {
        cityService.save(countryId,city);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/city/{plate}") //Find City
    public ResponseEntity<String> findCity(@RequestParam String plate) throws Exception {
        String cityName = cityService.findCity(plate);
        return new ResponseEntity<>(cityName, HttpStatus.OK);

    }

    @PostMapping("/{cityId}/district") //Save District
    public ResponseEntity<?> saveDistrict(@PathVariable Long cityId,@RequestBody DistrictDto district) throws Exception {
        districtService.saveDistrict(cityId,district);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{districtId}/neighborhood") //Save Neighborhood
    public ResponseEntity<?> saveNeighborhood(@PathVariable Long districtId,@RequestBody NeighborhoodDto neighborhood) throws Exception {
        neighborhoodService.saveNeighborhood(districtId,neighborhood);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{neighborhodId}/street") // Save Street
    public ResponseEntity<?> saveStreet(@PathVariable Long neighborhodId,@RequestBody StreetDto street) throws Exception {
        streetService.saveStreet(neighborhodId,street);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/updateNeighborhood") // Update Neighborhood
    public ResponseEntity<?> updateNeighborhood(@RequestParam Long id, @RequestBody String newNeighborhood ) {
        neighborhoodService.updateNeighborhood(id,newNeighborhood);
        return ResponseEntity.noContent().build();
        }

    @PatchMapping("/updateStreet") //Update Street
    public ResponseEntity<?> updateStreet(@RequestParam Long id, @RequestBody String newStreet ) {
        streetService.updateStreet(id,newStreet);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/saveAddress") //Save Address
    public ResponseEntity<?> saveAddress(@RequestBody AddressRequest address) throws Exception {
        addressService.saveAddress(address);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/deleteAddress/{id}") //Delete Address
    public ResponseEntity<AddressRequest> delete(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.ok().build();
    }



}

