package br.com.showbike.clientebike.bike.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.showbike.clientebike.bike.application.api.BikeRequest;
import br.com.showbike.clientebike.bike.application.api.BikeResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BikeApplicationService implements BikeService {

	@Override
	public BikeResponse criaBike(UUID idCliente, @Valid BikeRequest bikeRequest) {
		log.info("[inicio] BikeApplicationService - criaBike");
		//bikeInfraRepository.salaBike(idCliente, bikeRequest)
		log.info("[finaliza] BikeApplicationService - criaBike");
		return null;
	}
}