package br.com.showbike.clientebike.bike.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@NoArgsConstructor
public class BikeController implements BikeApi {

	@Override
	public BikeResponse postBike(UUID idCliente, BikeRequest bikeRequest) {
		log.info("[inicio] BikeController - postBike");
		log.info("[idCliente] {}", idCliente);
		log.info("[finaliza] BikeController - postBike");
		return null;
	}
}