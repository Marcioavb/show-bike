package br.com.showbike.clientebike.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.showbike.clientebike.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesDoId(UUID idCliente);
	void deletaCliente(Cliente cliente);
}