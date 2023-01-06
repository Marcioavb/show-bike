package br.com.showbike.clientebike.bike.application.api;

import java.util.List;
import java.util.stream.Collectors;

import br.com.showbike.clientebike.bike.domain.Bike;
import br.com.showbike.clientebike.bike.domain.Marca;
import lombok.Value;

@Value
public class BikeClienteListReponse {
	private Marca marca;
	private String modelo;;
	private String aro;
	private String cor;
	private String numeroDeSerie;
	
	public BikeClienteListReponse(Bike bike) {
		this.marca = bike.getMarca();
		this.modelo = bike.getModelo();
		this.aro = bike.getAro();
		this.cor = bike.getCor();
		this.numeroDeSerie = bike.getNumeroDeSerie();
	}

	public static List<BikeClienteListReponse> converte(List<Bike> bikesDoCliente) {
		return bikesDoCliente.stream()
				.map(BikeClienteListReponse::new)
				.collect(Collectors.toList());
	}
}