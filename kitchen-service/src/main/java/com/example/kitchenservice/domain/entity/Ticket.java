package com.example.kitchenservice.domain.entity;

import com.example.kitchenservice.domain.TicketLineItem;
import com.example.kitchenservice.enums.TicketState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="tickets")
@Access(AccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private TicketState state;

    @Enumerated(EnumType.STRING)
    private TicketState previousState;

    private Long restaurantId;

    @ElementCollection
    @CollectionTable(name="ticket_line_items")
    private List<TicketLineItem> lineItems;

    private LocalDateTime readyBy;
    private LocalDateTime acceptTime;
    private LocalDateTime preparingTime;
    private LocalDateTime pickedUpTime;
    private LocalDateTime readyForPickupTime;
}
