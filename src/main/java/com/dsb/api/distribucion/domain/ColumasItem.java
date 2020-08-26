package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ColumasItem implements Serializable {

    private static final long serialVersionUID = -3630081622213971832L;
    protected int idRack;
    protected double ancho;
    protected String id;
    protected int index;
}
