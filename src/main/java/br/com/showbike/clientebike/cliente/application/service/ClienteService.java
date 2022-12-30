package br.com.showbike.clientebike.cliente.application.service;

import java.util.List;

import br.com.showbike.clientebike.cliente.application.api.ClienteListResponse;
import br.com.showbike.clientebike.cliente.application.api.ClienteRequest;
import br.com.showbike.clientebike.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}
