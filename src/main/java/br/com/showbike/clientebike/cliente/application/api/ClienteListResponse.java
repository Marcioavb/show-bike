package br.com.showbike.clientebike.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.showbike.clientebike.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;

	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}
}
