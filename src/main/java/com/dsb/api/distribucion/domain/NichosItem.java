package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class NichosItem implements Serializable {

	private static final long serialVersionUID = 3690454877687036873L;
	protected String columna;
    protected int nroColumnas;
    protected int idRack;
    protected String id;
    protected String nivel;
    protected int nroNiveles;
    protected boolean activo;
    protected List<UbicacionesItem> ubicaciones;

}