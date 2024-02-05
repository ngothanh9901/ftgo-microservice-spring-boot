package com.example.consumerservice.domain.entity;

import com.example.consumerservice.domain.PersonName;
import jakarta.persistence.*;

@Entity
@Table(name="consumers")
@Access(AccessType.FIELD)
public class Consumer {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private PersonName name;
}
