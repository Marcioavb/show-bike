package br.com.showbike.clientebike.bike.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.showbike.clientebike.bike.application.service.BikeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BikeController implements BikeApi {
	private final BikeService bikeService;

	@Override
	public BikeResponse postBike(UUID idCliente, @Valid BikeRequest bikeRequest) {
		log.info("[inicio] BikeController - postBike");
		log.info("[idCliente] {}", idCliente);
		BikeResponse bike = bikeService.criaBike(idCliente, bikeRequest);
		log.info("[finaliza] BikeController - postBike");
		return bike;
	}
}