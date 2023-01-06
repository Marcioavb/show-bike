package br.com.showbike.clientebike.bike.application.service;

import java.util.UUID;

import br.com.showbike.clientebike.bike.application.api.BikeRequest;
import br.com.showbike.clientebike.bike.application.api.BikeResponse;

public interface BikeService {
	BikeResponse criaBike(UUID idCliente, BikeRequest bikeRequest);
}