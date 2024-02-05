package com.example.kitchenservice.domain.entity;

import com.example.kitchenservice.domain.MenuItem;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="kitchen_service_restaurants")
@Access(AccessType.FIELD)
public class Restaurant {
    @Id
    private Long id;

    @ElementCollection
    @CollectionTable(name="kitchen_service_restaurant_menu_items")
    private List<MenuItem> menuItems;
}
