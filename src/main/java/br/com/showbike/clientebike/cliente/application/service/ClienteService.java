package br.com.showbike.clientebike.cliente.application.service;

import br.com.showbike.clientebike.cliente.application.api.ClienteRequest;
import br.com.showbike.clientebike.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
