package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProveedoresItem implements Serializable {

    private static final long serialVersionUID = -7181864310750882137L;
    protected String descripcion;
    protected boolean esCertificacionBpdyt;
    protected int id;
    protected List<ModalidadesItem> modalidades;
    protected String nombre;
    protected int idUnidadTransporte;
    protected boolean activo;
}