package br.com.showbike.clientebike.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.showbike.clientebike.cliente.application.api.ClienteAlteracaoRequest;
import br.com.showbike.clientebike.cliente.application.api.ClienteDetalhadoResponse;
import br.com.showbike.clientebike.cliente.application.api.ClienteListResponse;
import br.com.showbike.clientebike.cliente.application.api.ClienteRequest;
import br.com.showbike.clientebike.cliente.application.api.ClienteResponse;
import br.com.showbike.clientebike.cliente.application.api.ClienteResponseCpf;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
	ClienteResponseCpf getClienteAtravesCpf(String cpf);
}