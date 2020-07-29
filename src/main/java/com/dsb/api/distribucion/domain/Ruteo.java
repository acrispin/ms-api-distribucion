package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Ruteo implements Serializable {

    private static final long serialVersionUID = 8878020162588669011L;

    protected String correo;
    protected String clave;
    protected String tipo;
    protected String usuario;

}
