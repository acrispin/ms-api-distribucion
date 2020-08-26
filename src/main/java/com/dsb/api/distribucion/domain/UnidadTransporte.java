package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UnidadTransporte implements Serializable {

    private static final long serialVersionUID = 5819403713853159712L;
    protected int id;
    protected double tonelajeBruto;
    protected String color;
    protected boolean esRevisionTecnica;
    protected String modelo;
    protected boolean esRackInterno;
    protected String marca;
    protected boolean esPermisoMtc;
    protected double altura;
    protected boolean esPropio;
    protected boolean esUnidadBpdyt;
    protected double volumenNeto;
    protected String serie;
    protected int idTipoUnidad;
    protected String soat;
    protected String usuario;
    protected double tonelajeNeto;
    protected double volumenBruto;
    protected int ejes;
    protected int anio;
    protected String placa;
    protected boolean activo;
    protected String ip;
    protected List<ProveedoresItem> proveedores;
    protected List<RacksItem> racks;

}