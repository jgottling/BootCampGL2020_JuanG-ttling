package com.globallogic.bootcampgl.vehiculo.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehiculoDTO {
	private int codigo;
	private String identificacion;
	private TipoDTO tipo;
	private ModeloDTO modelo;
	private LocalDate fechaProduccion;
}
