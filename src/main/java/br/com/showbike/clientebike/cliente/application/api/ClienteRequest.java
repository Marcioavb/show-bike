package br.com.showbike.clientebike.cliente.application.api;

import java.time.LocalDate;

import br.com.showbike.clientebike.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequest {
	
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String cpf;
}
