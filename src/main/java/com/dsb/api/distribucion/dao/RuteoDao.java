package com.dsb.api.distribucion.dao;

import com.dsb.api.commons.db.dao.DaoApplication;
import com.dsb.api.commons.db.dao.enums.EConnectionType;
import com.dsb.api.distribucion.domain.Ruteo;
import com.dsb.api.distribucion.mapper.IRuteoMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

@Log4j2
public class RuteoDao extends DaoApplication<Ruteo, IRuteoMapper> {

    @Override
    protected Class<Ruteo> getClassType() {
        return Ruteo.class;
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
    protected Class<IRuteoMapper> getMapperType() {
        return IRuteoMapper.class;
    }

}
