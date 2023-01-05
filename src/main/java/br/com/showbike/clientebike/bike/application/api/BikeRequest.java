package br.com.showbike.clientebike.bike.application.api;

import br.com.showbike.clientebike.bike.domain.Marca;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class BikeRequest {
	@NotNull
	private Marca marca;
	@NotBlank
	private String modelo;;
	@NotBlank
	private String aro;
	@NotBlank
	private String cor;
	@NotNull
	private Number numeroDeSerie;
}