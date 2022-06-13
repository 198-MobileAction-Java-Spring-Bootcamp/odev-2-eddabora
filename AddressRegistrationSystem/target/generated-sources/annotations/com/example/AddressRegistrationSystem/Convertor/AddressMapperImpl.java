package com.example.AddressRegistrationSystem.Convertor;

import com.example.AddressRegistrationSystem.DTO.AddressRequest;
import com.example.AddressRegistrationSystem.Entity.Address;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-13T21:16:15+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Amazon.com Inc.)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address convertToCusCustomer(AddressRequest addressRequest) {
        if ( addressRequest == null ) {
            return null;
        }

        Address address = new Address();

        return address;
    }

    @Override
    public List<AddressRequest> address(List<Address> addresses) {
        if ( addresses == null ) {
            return null;
        }

        List<AddressRequest> list = new ArrayList<AddressRequest>( addresses.size() );
        for ( Address address : addresses ) {
            list.add( addressToAddressRequest( address ) );
        }

        return list;
    }

    protected AddressRequest addressToAddressRequest(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressRequest addressRequest = new AddressRequest();

        return addressRequest;
    }
}
