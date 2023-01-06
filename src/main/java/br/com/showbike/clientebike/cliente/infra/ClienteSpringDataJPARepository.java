package br.com.showbike.clientebike.cliente.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.showbike.clientebike.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{
	Optional<Cliente> findByCpf(String cpf);
}
