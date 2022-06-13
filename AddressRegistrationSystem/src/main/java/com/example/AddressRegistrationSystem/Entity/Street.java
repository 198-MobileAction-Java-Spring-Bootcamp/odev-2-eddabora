package com.example.AddressRegistrationSystem.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Street")//Street Entity
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    private String doorCode;
    private String apartmentCode;

    @ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="neighborhood_id",nullable = false)
    private Neighborhood neighborhood;

}
