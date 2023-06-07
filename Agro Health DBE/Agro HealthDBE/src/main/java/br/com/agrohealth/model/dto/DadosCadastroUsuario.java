package br.com.agrohealth.model.dto;

import br.com.agrohealth.fazenda.DadosFazenda;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuario(
		@NotBlank
		String nome,		
		@NotBlank
		@Email
		String email,
		@NotBlank
		@Pattern(regexp = "\\d{10,11}")
		String telefone,
		
		@NotNull @Valid DadosFazenda endereco,
		
		@NotNull @Valid DadosColheita colheita,
		
		@NotNull @Valid DadosSensor sensor
	) {}
