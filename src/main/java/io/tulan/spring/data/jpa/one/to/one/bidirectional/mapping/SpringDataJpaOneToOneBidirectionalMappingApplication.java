package io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping;

import io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.model.Car;
import io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.model.Owner;
import io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.repository.CarRepository;
import io.tulan.spring.data.jpa.one.to.one.bidirectional.mapping.repository.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringDataJpaOneToOneBidirectionalMappingApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringDataJpaOneToOneBidirectionalMappingApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(SpringDataJpaOneToOneBidirectionalMappingApplication.class, args);
		CarRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
		OwnerRepository ownerRepository = configurableApplicationContext.getBean(OwnerRepository.class);

		Car car = new Car("m200");
		carRepository.save(car);

		Owner owner = new Owner("John Doe");
		owner.setCar(car);
		ownerRepository.save(owner);

		Optional <Car> optionalCar = carRepository.findById(1l);
		Optional <Owner> optionalOwner = ownerRepository.findById(2l);

		if(optionalCar.isPresent() && optionalOwner.isPresent()){

			log.info(optionalCar.get() + "is owned by: " + optionalCar.get().getOwner());
			log.info(optionalOwner.get() + "has a car: " + optionalOwner.get().getCar() );
		}

	}

}
