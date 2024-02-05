package com.example.deliveryservice.domain.entity;

import com.example.deliveryservice.domain.Plan;
import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class Courier {
    @Id
    private Long id;
    @Embedded
    private Plan plan;
    private Boolean available;
}
