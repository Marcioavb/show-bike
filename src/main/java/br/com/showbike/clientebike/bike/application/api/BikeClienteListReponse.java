package br.com.showbike.clientebike.bike.application.api;

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
}