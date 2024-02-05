package com.example.orderservice.domain.entity;

import com.example.orderservice.domain.MenuItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="order_service_restaurants")
@Access(AccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    private Long id;

    @ElementCollection
    @CollectionTable(name="order_service_menu_items")
    private List<MenuItem> menuItems;
    private String name;
}
