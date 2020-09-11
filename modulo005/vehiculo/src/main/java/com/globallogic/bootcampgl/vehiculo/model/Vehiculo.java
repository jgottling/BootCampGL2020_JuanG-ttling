package com.globallogic.bootcampgl.vehiculo.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vehiculo_id", nullable=false, unique=true)
	private int codigo;
	
	@Column(name="vehiculo_identificacion")
	private String identificacion;

	@JoinColumn(name = "tipo_id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
	private Tipo tipo;
	
	@JoinColumn(name = "modelo_id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
	private Modelo modelo;
		
	@Column(name="vehiculo_fecha_produccion", nullable=false)
	private LocalDate fechaProduccion;
}
