package br.com.showbike.clientebike.bike.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.showbike.clientebike.bike.application.repository.BikeRepository;
import br.com.showbike.clientebike.bike.domain.Bike;
import br.com.showbike.clientebike.handler.APIException;
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

	@Override
	public Bike buscaBikeDoClienteComId(UUID idBike) {
		log.info("[inicio] BikeInfraRepository - buscaBikesDoCliente");
		var bike = bikeSpringDataJPARepository.findById(idBike).orElseThrow(
				()-> APIException.build(HttpStatus.NOT_FOUND, " Bike Nao Encontrada para o idBike = " +idBike));
		log.info("[finaliza] BikeInfraRepository - buscaBikesDoCliente");
		return bike;
	}

	@Override
	public void deletaBike(Bike bike) {
		log.info("[inicio] BikeInfraRepository - buscaBikesDoCliente");
		bikeSpringDataJPARepository.delete(bike);
		log.info("[finaliza] BikeInfraRepository - buscaBikesDoCliente");
	}
}