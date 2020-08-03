package com.dsb.api.distribucion.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class RuteoWrapper implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected List<Ruteo> listaRutas;
	
	protected Integer totalElementos;
	protected Integer paginaActual;
	protected Integer totalpaginas;
}
