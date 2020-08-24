package com.dsb.api.distribucion.dao;

import com.dsb.api.commons.db.dao.DaoApplication;
import com.dsb.api.commons.db.dao.enums.EConnectionType;
import com.dsb.api.commons.domain.base.Base;
import com.dsb.api.commons.domain.response.ResponseBase;
import com.dsb.api.distribucion.mapper.IUnidadTransporteMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

@Log4j2
public class UnidadTransporteDao extends DaoApplication<Base, IUnidadTransporteMapper> {

    @Override
    protected Class<Base> getClassType() {
        return Base.class;
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
}
