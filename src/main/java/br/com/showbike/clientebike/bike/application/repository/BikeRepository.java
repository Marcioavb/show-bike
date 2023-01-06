package br.com.showbike.clientebike.bike.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.showbike.clientebike.bike.domain.Bike;

public interface BikeRepository {
	Bike salvaBike(Bike bike);
	List<Bike> buscaBikesDoCliente(UUID idCliente);
}