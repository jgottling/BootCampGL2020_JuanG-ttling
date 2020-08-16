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
@Table(name = "tipo")
public class Tipo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="tipo_id", nullable=false, unique=true)
	private int codigo;
	
	@Column(name="tipo_categoria", nullable=false)
	private String categoria;
	
	@Column(name="tipo_puertas", nullable=false)
	private String puertas;
}
