package com.example.deliveryservice.domain.entity;

import com.example.deliveryservice.domain.Address;
import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class Restaurant {
    @Id
    private Long id;

    private String restaurantName;
    @Embedded
    private Address address;
}
