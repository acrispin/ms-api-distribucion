package com.dsb.api.distribucion.mapper;

import com.dsb.api.commons.domain.response.ResponseBase;
import org.apache.ibatis.annotations.Param;

public interface IUnidadTransporteMapper {

    ResponseBase insertUnidadTransporte(
            @Param("json") String json,
            @Param("usuario") String usuario
    );

    ResponseBase updateUnidadTransporte(
            @Param("json") String json,
            @Param("usuario") String usuario
    );

}
