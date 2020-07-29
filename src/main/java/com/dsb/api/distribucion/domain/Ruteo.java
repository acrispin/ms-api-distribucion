package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Ruteo implements Serializable {

    private static final long serialVersionUID = 1048362679758585750L;

    protected String correo;
    protected String clave;
    protected String tipo;
    protected String usuario;

}
