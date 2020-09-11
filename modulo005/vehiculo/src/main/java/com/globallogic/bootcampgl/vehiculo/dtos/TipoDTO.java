package com.globallogic.bootcampgl.vehiculo.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDTO {
	private int codigo;
	private String categoria;
	private String puertas;
}
