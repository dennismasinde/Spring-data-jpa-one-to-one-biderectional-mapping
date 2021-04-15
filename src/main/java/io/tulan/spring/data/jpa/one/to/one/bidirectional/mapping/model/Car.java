package io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.model;

import javax.persistence.*;

@Entity
@Table(name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String model;
    @OneToOne(mappedBy = "car")
    private Owner owner;
}
