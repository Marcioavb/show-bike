package br.com.showbike.clientebike.bike.infra;

import org.springframework.stereotype.Repository;

import br.com.showbike.clientebike.bike.application.repository.BikeRepository;
import br.com.showbike.clientebike.bike.domain.Bike;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BikeInfraRepository implements BikeRepository {
	private final bikeSpringDataJPARepository bikeSpringDataJPARepository;

	@Override
	public Bike salvaBike(Bike bike) {
		log.info("[inicio] BikeInfraRepository - salvaBike");
		bikeSpringDataJPARepository.save(bike);
		log.info("[finaliza] BikeInfraRepository - salvaBike");
		return bike;
	}
}