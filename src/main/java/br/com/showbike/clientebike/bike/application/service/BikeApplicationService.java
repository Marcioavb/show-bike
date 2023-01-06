package br.com.showbike.clientebike.bike.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.showbike.clientebike.bike.application.api.BikeClienteListReponse;
import br.com.showbike.clientebike.bike.application.api.BikeRequest;
import br.com.showbike.clientebike.bike.application.api.BikeResponse;
import br.com.showbike.clientebike.bike.application.repository.BikeRepository;
import br.com.showbike.clientebike.bike.domain.Bike;
import br.com.showbike.clientebike.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BikeApplicationService implements BikeService {
	private final ClienteService clienteService;
	private final BikeRepository bikeRepository;

	@Override
	public BikeResponse criaBike(UUID idCliente, BikeRequest bikeRequest) {
		log.info("[inicio] BikeApplicationService - criaBike");
		clienteService.buscaClienteAtravesId(idCliente);
		Bike bike = bikeRepository.salvaBike(new Bike(idCliente, bikeRequest));
		log.info("[finaliza] BikeApplicationService - criaBike");
		return new BikeResponse(bike.getIdBike());
	}

	@Override
	public List<BikeClienteListReponse> buscaTodasBikeCliente(UUID idCliente) {
		log.info("[inicio] BikeApplicationService - buscaTodasBikeCliente");
		clienteService.buscaClienteAtravesId(idCliente);
		List<Bike> bikesDoCliente = bikeRepository.buscaBikesDoCliente(idCliente);
		log.info("[finaliza] BikeApplicationService - buscaTodasBikeCliente");
		return BikeClienteListReponse.converte(bikesDoCliente);
	}
}