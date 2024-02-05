package com.example.restaurantservice.domain;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class MenuItem {
    private String id;
    private String name;
    private Money price;
}
