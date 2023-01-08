package br.com.showbike.clientebike.bike.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/bike")
public interface BikeApi {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	BikeResponse postBike (@PathVariable UUID idCliente,
			@Valid @RequestBody BikeRequest bikeRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<BikeClienteListReponse> getBikesDoCliente 
	(@PathVariable UUID idCliente);
	
	@GetMapping(value = "/{idBike}")
	@ResponseStatus(code = HttpStatus.OK)
	BikeClienteDetalhadoResponse getBikesDoClienteComId
	(@PathVariable UUID idCliente, @PathVariable UUID idBike);
	
	@DeleteMapping(value = "/{idBike}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaBikesDoClienteComId(@PathVariable UUID idCliente, @PathVariable UUID idBike);
	
	@PatchMapping(value = "/{idBike}")
	@ResponseStatus(code = HttpStatus.OK)
	void patchAlteraBike(@PathVariable UUID idCliente, @PathVariable UUID idBike,
			@Valid @RequestBody BikeEditadaRequest  BikeEditadaRequest);
}