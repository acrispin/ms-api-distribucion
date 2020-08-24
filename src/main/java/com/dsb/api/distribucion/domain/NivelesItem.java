package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class NivelesItem implements Serializable {

    private static final long serialVersionUID = 7987234550982689031L;
    protected boolean esDivision;
    protected int idRack;
    protected String id;
    protected double alto;
}
