package br.com.showbike.clientebike.cliente.application.api;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import br.com.showbike.clientebike.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@NotBlank
	@CPF
	private String cpf;
}
