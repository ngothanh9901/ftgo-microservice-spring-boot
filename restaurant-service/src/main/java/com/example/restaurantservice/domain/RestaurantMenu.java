package com.example.restaurantservice.domain;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;

import java.util.List;

@Embeddable
@Access(AccessType.FIELD)
public class RestaurantMenu {
    @ElementCollection
    private List<MenuItem> menuItems;
}
