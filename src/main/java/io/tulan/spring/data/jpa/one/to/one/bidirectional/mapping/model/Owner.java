package io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.model;

import javax.persistence.*;

@Entity
@Table(name = "Owner")
public class Owner {

    @Id
    private long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;
}
