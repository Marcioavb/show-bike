package br.com.showbike.clientebike.cliente.application.api;

import java.util.UUID;

import br.com.showbike.clientebike.cliente.domain.Cliente;
import br.com.showbike.clientebike.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteResponseCpf {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private Sexo sexo;
	
	
	public ClienteResponseCpf(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.sexo = cliente.getSexo();
	}
}