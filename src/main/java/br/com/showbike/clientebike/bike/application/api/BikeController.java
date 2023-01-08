package br.com.showbike.clientebike.bike.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.showbike.clientebike.bike.application.service.BikeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BikeController implements BikeApi {
	private final BikeService bikeService;

	@Override
	public BikeResponse postBike(UUID idCliente, BikeRequest bikeRequest) {
		log.info("[inicio] BikeController - postBike");
		log.info("[idCliente] {}", idCliente);
		BikeResponse bike = bikeService.criaBike(idCliente, bikeRequest);
		log.info("[finaliza] BikeController - postBike");
		return bike;
	}

	@Override
	public List<BikeClienteListReponse> getBikesDoCliente(UUID idCliente) {
		log.info("[inicio] BikeController - getBikesDoCliente");
		log.info("[idCliente] {}", idCliente);
		List<BikeClienteListReponse> bikesDoCliente =
				bikeService.buscaTodasBikeCliente(idCliente);
		log.info("[finaliza] BikeController - getBikesDoCliente");
		return bikesDoCliente;
	}

	@Override
	public BikeClienteDetalhadoResponse getBikesDoClienteComId(UUID idCliente, UUID idBike) {
		log.info("[inicio] BikeController - getBikesDoClienteComId");
		log.info("[idCliente] {}", idCliente);
		BikeClienteDetalhadoResponse bike = bikeService.buscaBikeDoClienteComId(idCliente, idBike);
		log.info("[finaliza] BikeController - getBikesDoClienteComId");
		return bike;
	}

	@Override
	public void deletaBikesDoClienteComId(UUID idCliente, UUID idBike) {
		log.info("[inicio] BikeController - deletaBikesDoClienteComId");
		log.info("[idCliente] {} - [idBike]",idCliente, idBike);
		log.info("[finaliza] BikeController - deletaBikesDoClienteComId");
	}
}