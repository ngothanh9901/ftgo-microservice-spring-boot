package com.example.orderservice.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;

@Embeddable
public class OrderLineItem {
    private int quantity;

    private String menuItemsId;

    private String name;
}
