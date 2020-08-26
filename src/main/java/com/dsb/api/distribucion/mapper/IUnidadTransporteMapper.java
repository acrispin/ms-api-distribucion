package com.dsb.api.distribucion.mapper;

import com.dsb.api.commons.domain.response.ResponseBase;
import com.dsb.api.distribucion.domain.ProveedoresItem;
import com.dsb.api.distribucion.domain.RacksItem;
import com.dsb.api.distribucion.domain.UnidadTransporte;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUnidadTransporteMapper {

    ResponseBase insertUnidadTransporte(
            @Param("json") String json,
            @Param("usuario") String usuario
    );

    ResponseBase updateUnidadTransporte(
            @Param("json") String json,
            @Param("usuario") String usuario
    );

    UnidadTransporte selectById(
            @Param("id") Integer id
    );

    List<ProveedoresItem> selectProveedoresByUt(
            @Param("idUt") Integer idUnidadTransporte
    );

    List<RacksItem> selectRacksByUt(
            @Param("idUt") Integer idUnidadTransporte
    );

}
