package com.example.orderservice.domain.entity;

import com.example.orderservice.domain.DeliveryInformation;
import com.example.orderservice.domain.Money;
import com.example.orderservice.domain.OrderLineItems;
import com.example.orderservice.domain.PaymentInformation;
import com.example.orderservice.enums.OrderState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orders")
@Access(AccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;
    @Enumerated(EnumType.STRING)
    private OrderState state;
    private Long consumerId;
    private Long restaurantId;
    @Embedded
    private OrderLineItems orderLineItems;
    @Embedded
    private DeliveryInformation deliveryInformation;
    @Embedded
    private PaymentInformation paymentInformation;
    @Embedded
    private Money orderMinimum = new Money(Integer.MAX_VALUE);
}
