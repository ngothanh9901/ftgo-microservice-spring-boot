package com.example.orderservice.domain;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;

import java.util.List;

@Embeddable
public class OrderLineItems {
    @ElementCollection
    @CollectionTable(name="order_line_items")
    private List<OrderLineItem> lineItems;
}
