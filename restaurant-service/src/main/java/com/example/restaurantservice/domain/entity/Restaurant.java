package com.example.restaurantservice.domain.entity;

import com.example.restaurantservice.domain.RestaurantMenu;
import jakarta.persistence.*;

@Entity
@Table(name = "restaurants")
@Access(AccessType.FIELD)
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Embedded
    private RestaurantMenu menu;
}
