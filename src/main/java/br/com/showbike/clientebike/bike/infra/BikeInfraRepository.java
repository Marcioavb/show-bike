package br.com.showbike.clientebike.bike.infra;

import java.util.List;
import java.util.UUID;

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

	@Override
	public List<Bike> buscaBikesDoCliente(UUID idCliente) {
		log.info("[inicio] BikeInfraRepository - buscaBikesDoCliente");
		var bikes = bikeSpringDataJPARepository.findByIdClientePropietario(idCliente);
		log.info("[finaliza] BikeInfraRepository - buscaBikesDoCliente");
		return bikes;
	}
}