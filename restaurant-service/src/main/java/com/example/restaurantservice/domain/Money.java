package com.example.restaurantservice.domain;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Embeddable;

import java.math.BigDecimal;
@Embeddable
@Access(AccessType.FIELD)
public class Money {
    public static Money ZERO = new Money(0);

    private BigDecimal amount;

    public Money() {
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money(String s) {
        this.amount = new BigDecimal(s);
    }

    public Money(int i) {
        this.amount = new BigDecimal(i);
    }

}
