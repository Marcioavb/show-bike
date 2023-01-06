package br.com.showbike.clientebike.bike.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.showbike.clientebike.bike.domain.Bike;

public interface bikeSpringDataJPARepository extends JpaRepository<Bike, UUID> {
	List<Bike> findByIdClientePropietario(UUID idCliente);
}