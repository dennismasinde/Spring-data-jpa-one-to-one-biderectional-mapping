package io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.repository;

import io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository <Car, Long> {
}
