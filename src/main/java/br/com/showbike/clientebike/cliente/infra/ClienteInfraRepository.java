package br.com.showbike.clientebike.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.showbike.clientebike.cliente.application.repository.ClienteRepository;
import br.com.showbike.clientebike.cliente.domain.Cliente;
import br.com.showbike.clientebike.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicio} ClienteInfraREpository - salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza} ClienteInfraREpository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicio} ClienteInfraREpository - buscaTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza} ClienteInfraREpository - buscaTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteAtravesDoId(UUID idCliente) {
		log.info("[inicio} ClienteInfraREpository - buscaClienteAtravesDoId");
		Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente nao encontardo!"));
		log.info("[finaliza} ClienteInfraREpository - buscaClienteAtravesDoId");
		return cliente;
	}
}