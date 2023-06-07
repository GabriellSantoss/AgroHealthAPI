package br.com.agrohealth.fazenda;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosFazenda(
		@NotBlank
		String nome,
		@NotBlank
		String localizacao,
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String tamanho,
		@NotBlank
		String cidade,
		@NotBlank
		String uf,
		String numero,
		String complemento
	) {}
