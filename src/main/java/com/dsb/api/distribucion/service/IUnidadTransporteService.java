package com.dsb.api.distribucion.service;

import com.dsb.api.commons.domain.response.ResponseApi;
import com.dsb.api.commons.domain.response.ResponseBase;
import com.dsb.api.distribucion.domain.UnidadTransporte;

public interface IUnidadTransporteService {

    ResponseBase crearUnidadTransporte(
            UnidadTransporte unidad,
            String ip
    );

    ResponseBase actualizarUnidadTransporte(
            UnidadTransporte unidad,
            String ip
    );

    ResponseApi<UnidadTransporte> obtenerUnidadTransporte(
            int id
    );

}
