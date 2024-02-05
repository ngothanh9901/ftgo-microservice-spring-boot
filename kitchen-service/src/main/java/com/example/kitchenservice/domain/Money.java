package com.example.kitchenservice.domain;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Embeddable;

import java.math.BigDecimal;
@Embeddable
@Access(AccessType.FIELD)
public class Money {
    public static Money ZERO = new Money(0);
    private BigDecimal amount;
    public Money (BigDecimal amount){
        this.amount = amount;
    }
    public Money(int maxValue) {
    }

    public Money() {

    }
}
