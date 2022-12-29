package br.com.showbike.clientebike.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.showbike.clientebike.cliente.application.repository.ClienteRepository;
import br.com.showbike.clientebike.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicio} ClienteInfraREpository - salva");
		log.info("[finaliza} ClienteInfraREpository - salva");
		return cliente;
	}
}
