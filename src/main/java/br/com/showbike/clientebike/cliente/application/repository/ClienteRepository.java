package br.com.showbike.clientebike.cliente.application.repository;

import br.com.showbike.clientebike.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
