package br.com.showbike.clientebike.bike.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.showbike.clientebike.bike.application.api.BikeEditadaRequest;
import br.com.showbike.clientebike.bike.application.api.BikeRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
	private UUID idBike;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idClientePropietario", nullable = false)
	private UUID idClientePropietario;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Marca marca;
	@NotBlank
	private String modelo;;
	@NotBlank
	private String aro;
	@NotBlank
	private String cor;
	@NotNull
	private String numeroDeSerie;

	private LocalDateTime datahoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Bike(UUID idCliente, @Valid BikeRequest bikeRequest) {
		this.idClientePropietario = idCliente;
		this.marca = bikeRequest.getMarca();
		this.modelo = bikeRequest.getModelo();
		this.aro = bikeRequest.getAro();
		this.cor = bikeRequest.getCor();
		this.numeroDeSerie = bikeRequest.getNumeroDeSerie();
		this.datahoraDoCadastro = LocalDateTime.now();
	}

	public void altera(BikeEditadaRequest bikeRequest) {
		this.marca = bikeRequest.getMarca();
		this.modelo = bikeRequest.getModelo();
		this.aro = bikeRequest.getAro();
		this.cor = bikeRequest.getCor();
		this.numeroDeSerie = bikeRequest.getNumeroDeSerie();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}
}