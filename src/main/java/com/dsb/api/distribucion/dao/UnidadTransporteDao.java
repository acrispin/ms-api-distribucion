package com.dsb.api.distribucion.dao;

import com.dsb.api.commons.db.dao.DaoApplication;
import com.dsb.api.commons.db.dao.enums.EConnectionType;
import com.dsb.api.commons.domain.response.ResponseBase;
import com.dsb.api.distribucion.domain.ProveedoresItem;
import com.dsb.api.distribucion.domain.RacksItem;
import com.dsb.api.distribucion.domain.UnidadTransporte;
import com.dsb.api.distribucion.mapper.IUnidadTransporteMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Log4j2
public class UnidadTransporteDao extends DaoApplication<UnidadTransporte, IUnidadTransporteMapper> {

    @Override
    protected Class<UnidadTransporte> getClassType() {
        return UnidadTransporte.class;
    }

    @Override
    protected Logger getLogger() {
        return log;
    }

    @Override
    protected EConnectionType getConnectionType() {
        return EConnectionType.DEFAULT;
    }

    @Override
    protected Class<IUnidadTransporteMapper> getMapperType() {
        return IUnidadTransporteMapper.class;
    }

    public ResponseBase insertUnidadTransporte(
            String json,
            String usuario
    ) {
        return executeDml("insertUnidadTransporte", json, usuario);
    }

    public ResponseBase updateUnidadTransporte(
            String json,
            String usuario
    ) {
        return executeDml("updateUnidadTransporte", json, usuario);
    }

    public List<ProveedoresItem> selectProveedoresByUt(int idUnidadTransporte) {
        return queryList("selectProveedoresByUt", idUnidadTransporte);
    }

    public List<RacksItem> selectRacksByUt(int idUnidadTransporte) {
        return queryList("selectRacksByUt", idUnidadTransporte);
    }

}
