package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RacksItem implements Serializable {

    private static final long serialVersionUID = 9158531346892547639L;
    protected String codigo;
    protected double volumen;
    protected double ancho;
    protected double profundidad;
    protected int id;
    protected double alto;
    protected int idUnidadTransporte;
    protected boolean activo;
    protected List<ColumasItem> columas;
    protected List<NivelesItem> niveles;
    protected List<NichosItem> nichos;
}