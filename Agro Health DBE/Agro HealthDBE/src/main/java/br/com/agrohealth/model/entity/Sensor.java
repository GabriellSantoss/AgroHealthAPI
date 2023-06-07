package br.com.agrohealth.model.entity;

import br.com.agrohealth.model.dto.DadosSensor;
import jakarta.persistence.Embeddable;

@Embeddable
public class Sensor {

	private String data_sensor;
	private String tipo_sensor;
	private String id_sensor;

	public Sensor() {

	}

	public Sensor(DadosSensor dados) {
		this.data_sensor = dados.data_sensor();
		this.tipo_sensor = dados.tipo_sensor();
		this.id_sensor = dados.id_sensor();
	}

	public void atualizarInformacoes(DadosSensor dados) {
		if (dados.data_sensor() != null) {
			this.data_sensor = dados.data_sensor();
		}
		if (dados.tipo_sensor() != null) {
			this.tipo_sensor = dados.tipo_sensor();
		}
		if (dados.id_sensor() != null) {
			this.id_sensor= dados.id_sensor();
		}

	}

	public String getData_sensor() {
		return data_sensor;
	}

	public void setData_sensor(String data_sensor) {
		this.data_sensor = data_sensor;
	}

	public String getTipo_sensor() {
		return tipo_sensor;
	}

	public void setTipo_sensor(String tipo_sensor) {
		this.tipo_sensor = tipo_sensor;
	}

	public String getId_sensor() {
		return id_sensor;
	}

	public void setId_sensor(String id_sensor) {
		this.id_sensor = id_sensor;
	}
}