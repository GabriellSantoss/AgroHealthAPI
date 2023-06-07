package br.com.agrohealth.model.entity;

import br.com.agrohealth.fazenda.Endereco;
import br.com.agrohealth.model.dto.DadosAtualizacaoUsuario;
import br.com.agrohealth.model.dto.DadosCadastroUsuario;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "usuarios")
@Entity(name = "Usuario")
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
	@Embedded
	private Endereco endereco;
	
	@Embedded
	private Colheita colheita;
	
	@Embedded
	private Sensor sensor;
	
	private Boolean ativo;

	public Usuario() {
	}
	
	public Usuario(DadosCadastroUsuario dados) {
		this.ativo = true;
		this.nome = dados.nome();
		this.email = dados.email();
		this.telefone = dados.telefone();
		this.endereco = new Endereco(dados.endereco());
		this.colheita = new Colheita(dados.colheita());
		this.sensor = new Sensor(dados.sensor());
	}
	
	public void atualizarInformacoes(DadosAtualizacaoUsuario dados) {
		if (dados.nome() != null) {
			this.nome = dados.nome();
		}
		if (dados.email() != null) {
			this.email = dados.email();
		}
		if (dados.telefone() != null) {
			this.telefone = dados.telefone();
		}
		
		if (dados.endereco() != null) {
			this.endereco.atualizarInformacoes(dados.endereco());
		}
		
		if(dados.colheita() != null) {
			this.colheita.atualizarInformacoes(dados.colheita());
		}
		
		if(dados.sensor() != null) {
			this.sensor.atualizarInformacoes(dados.sensor());
		}
	}
	
	public void excluir() {
		this.ativo = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Colheita getColheita() {
		return colheita;
	}

	public void setColheita(Colheita colheita) {
		this.colheita = colheita;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	

	
	
}
