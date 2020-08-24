package com.dsb.api.distribucion.service;

import com.dsb.api.commons.domain.response.ResponseBase;
import com.dsb.api.distribucion.domain.UnidadTransporte;

public interface IUnidadTransporteService {

    ResponseBase crearUnidadTransporte(
            UnidadTransporte unidad
    );

    ResponseBase actualizarUnidadTransporte(
            UnidadTransporte unidad
    );
}