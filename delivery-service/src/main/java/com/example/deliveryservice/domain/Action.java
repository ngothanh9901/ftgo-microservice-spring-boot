package com.example.deliveryservice.domain;

import com.example.deliveryservice.enums.DeliveryActionType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDateTime;

@Embeddable
public class Action {
    @Enumerated(EnumType.STRING)
    private DeliveryActionType type;
    private Address address;
    private LocalDateTime time;
    protected long deliveryId;
}
