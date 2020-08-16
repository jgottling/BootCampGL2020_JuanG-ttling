package com.globallogic.bootcampgl.vehiculo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "modelo")
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="modelo_id", nullable=false, unique=true)
	private int codigo;
	
	@Column(name="modelo_marca", nullable=false)
	private String marca;
	
	@Column(name="modelo_nombre", nullable=false)
	private String nombre;
}
