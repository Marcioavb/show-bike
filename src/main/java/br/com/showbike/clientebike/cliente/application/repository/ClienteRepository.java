package br.com.showbike.clientebike.cliente.application.repository;

import java.util.List;

import br.com.showbike.clientebike.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}