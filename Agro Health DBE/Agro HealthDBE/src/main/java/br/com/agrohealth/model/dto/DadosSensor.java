package br.com.agrohealth.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosSensor(
		
		@Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
		String data_sensor,
		
		@NotBlank
		String tipo_sensor,
		
		@NotBlank
		String id_sensor
		
		) {

}
