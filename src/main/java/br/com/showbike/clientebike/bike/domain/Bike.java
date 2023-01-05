package br.com.showbike.clientebike.bike.domain;

import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
	private UUID idBike;
	@Column(columnDefinition = "uuid", name = "idClientePropietario", nullable = false)
	private UUID idClientePropietario;
	@Enumerated(EnumType.STRING)
	private Marca marca;
	@NotBlank
	private String modelo;;
	@NotBlank
	private String aro;
	@NotBlank
	private String cor;
	@NotNull
	private Number numeroDeSerie;
	
	private LocalDateTime datahoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Bike(UUID idBike, UUID idClientePropietario, @NotBlank Marca marca, @NotBlank String modelo,
			@NotBlank String aro, @NotBlank String cor, @NotNull Number numeroDeSerie) {
		this.idBike = idBike;
		this.idClientePropietario = idClientePropietario;
		this.marca = marca;
		this.modelo = modelo;
		this.aro = aro;
		this.cor = cor;
		this.numeroDeSerie = numeroDeSerie;
	}
}