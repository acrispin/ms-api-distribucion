package com.dsb.api.distribucion.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Ruteo implements Serializable {

    private static final long serialVersionUID = 1048362679758585750L;

    protected Long idRuta;
    protected String codigo;
    protected LocalDateTime salidaProgramadae;
    protected Boolean esEntrega;
    protected String placaVehiculo;
    protected String duracionEstimada;
    protected String kilometroPorRecorrer;
    protected Double volumenTotal;
    protected Double peso;
    private Integer estado;
    protected LocalDateTime inicioRuta;
    protected LocalDateTime ultimoTracking;
    protected String tiempoEjecucion;
    protected String kilometroRecorrido;
    protected String tiempoRuta;
}
