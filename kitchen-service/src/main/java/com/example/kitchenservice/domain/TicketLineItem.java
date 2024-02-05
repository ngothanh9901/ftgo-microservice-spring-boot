package com.example.kitchenservice.domain;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class TicketLineItem {
    private int quantity;
    private String menuItemId;
    private String name;
}
