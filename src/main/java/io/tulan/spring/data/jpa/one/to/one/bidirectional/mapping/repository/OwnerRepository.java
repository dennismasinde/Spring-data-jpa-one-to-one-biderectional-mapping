package io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.repository;

import io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository <Owner, Long> {
}
