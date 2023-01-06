package br.com.showbike.clientebike.bike.application.service;

import java.util.List;
import java.util.UUID;

import br.com.showbike.clientebike.bike.application.api.BikeClienteListReponse;
import br.com.showbike.clientebike.bike.application.api.BikeRequest;
import br.com.showbike.clientebike.bike.application.api.BikeResponse;

public interface BikeService {
	BikeResponse criaBike(UUID idCliente, BikeRequest bikeRequest);
	List<BikeClienteListReponse> buscaTodasBikeCliente(UUID idCliente);
}