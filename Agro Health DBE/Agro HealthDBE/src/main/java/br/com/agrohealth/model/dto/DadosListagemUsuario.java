package br.com.agrohealth.model.dto;

import br.com.agrohealth.model.entity.Usuario;

public record DadosListagemUsuario(
		String nome,
		String email

	) {
	
	public DadosListagemUsuario(Usuario usuario) {
		this(
				usuario.getNome(), 
				usuario.getEmail()
				
			);
	}
	
}
