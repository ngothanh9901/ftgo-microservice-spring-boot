package com.example.deliveryservice.domain.entity;

import com.example.deliveryservice.domain.Address;
import com.example.deliveryservice.enums.DeliveryState;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Access(AccessType.FIELD)
public class Delivery {
    @Id
    private Long id;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street1", column = @Column(name="pickup_street1")),
            @AttributeOverride(name="street2", column = @Column(name="pickup_street2")),
            @AttributeOverride(name="city", column = @Column(name="pickup_city")),
            @AttributeOverride(name="state", column = @Column(name="pickup_state")),
            @AttributeOverride(name="zip", column = @Column(name="pickup_zip")),
    })
    private Address pickupAddress;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street1", column = @Column(name="delivery_street1")),
            @AttributeOverride(name="street2", column = @Column(name="delivery_street2")),
            @AttributeOverride(name="city", column = @Column(name="delivery_city")),
            @AttributeOverride(name="state", column = @Column(name="delivery_state")),
            @AttributeOverride(name="zip", column = @Column(name="delivery_zip")),
    })
    private Address deliveryAddress;
    @Enumerated(EnumType.STRING)
    private DeliveryState state;

    private Long restaurantId;
    private LocalDateTime pickUpTime;
    private LocalDateTime deliveryTime;
    private Long assignedCourier;
    private LocalDateTime readyBy;
}
