package com.example.deliveryservice.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String street1;
    private String street2;
    private String city;
    private String zip;
}
