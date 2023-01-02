package br.com.showbike.clientebike.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.showbike.clientebike.cliente.domain.Cliente;
import br.com.showbike.clientebike.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private Sexo sexo;
	private LocalDateTime datahoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.sexo = cliente.getSexo();
		this.datahoraDoCadastro = cliente.getDatahoraDoCadastro();
	}
}