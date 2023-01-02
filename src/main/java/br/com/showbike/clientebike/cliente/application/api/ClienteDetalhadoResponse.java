package br.com.showbike.clientebike.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

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
}

