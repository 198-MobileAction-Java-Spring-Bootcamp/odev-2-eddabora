package com.example.AddressRegistrationSystem.Convertor;


import com.example.AddressRegistrationSystem.DTO.AddressRequest;
import com.example.AddressRegistrationSystem.Entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

        AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

        Address convertToCusCustomer(AddressRequest addressRequest);

        List<AddressRequest> address(List<Address> addresses);


}
