package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ModalidadesItem implements Serializable {

    private static final long serialVersionUID = 336268966108672820L;
    protected int idTipoModalidadServicio;
    protected double costo;
    protected int id;
    protected int idProveedorUnidadTransporte;
}
