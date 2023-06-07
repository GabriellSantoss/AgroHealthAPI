package br.com.agrohealth.fazenda;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String nome;
	private String localizacao;
	private String tamanho;

	public Endereco() {
	}
	
	public Endereco(DadosFazenda dados) {
		this.nome = dados.nome();
		this.localizacao = dados.localizacao();
		this.tamanho = dados.tamanho(); }
		
	
	public void atualizarInformacoes(DadosFazenda dados) {
	    if (dados.nome() != null) {
	        this.nome = dados.nome();
	    }
	    if (dados.localizacao() != null) {
	        this.localizacao = dados.localizacao();
	    }
	    if (dados.tamanho() != null) {
	        this.tamanho = dados.tamanho();
	    }
	 
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
