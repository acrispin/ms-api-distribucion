package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class UbicacionesItem implements Serializable {

    private static final long serialVersionUID = -5120393310470502010L;
    protected long id;
    protected int idRack;
    protected double ancho;
    protected double alto;
    protected String idNicho;
    protected int idUnidadTransporte;
}
