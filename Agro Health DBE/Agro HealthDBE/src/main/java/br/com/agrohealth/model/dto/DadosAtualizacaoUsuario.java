package br.com.agrohealth.model.dto;

import br.com.agrohealth.fazenda.DadosFazenda;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoUsuario(
		
		@NotNull
		Long id,
		String nome,
		@Email
		String email,
		@Pattern(regexp = "\\d{10,11}")
		String telefone,
		
		DadosFazenda endereco,
		
		DadosColheita colheita,
		
		DadosSensor sensor
		
		
		) {

	
	
}
