package com.dsb.api.distribucion.service;

import brave.Tracer;
import com.dsb.api.commons.domain.response.ResponseApi;
import com.dsb.api.commons.domain.response.ResponseBase;
import com.dsb.api.commons.util.basic.ErrorUtil;
import com.dsb.api.commons.util.basic.JsonUtil;
import com.dsb.api.distribucion.dao.UnidadTransporteDao;
import com.dsb.api.distribucion.domain.ProveedoresItem;
import com.dsb.api.distribucion.domain.RacksItem;
import com.dsb.api.distribucion.domain.UnidadTransporte;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class UnidadTransporteService implements IUnidadTransporteService {

    @Autowired
    private Tracer tracer;

    @Override
    public ResponseBase crearUnidadTransporte(UnidadTransporte unidad, String ip) {
        ResponseBase response = new ResponseBase();
        try {
            unidad.setIp(ip);
            String json = new JsonUtil().getJsonFromObjet(unidad);
            if (log.isDebugEnabled()) {
                log.debug("crearUnidadTransporte INI");
                log.debug("crearUnidadTransporte: " + unidad);
                tracer.currentSpan().tag("api.data.in", json);
            }
            response = new UnidadTransporteDao().insertUnidadTransporte(json, unidad.getUsuario());
            response.setResultado(response.getError() == 0);
            response.setEstado(ResponseBase.STATUS_CREADO);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            response.setMensaje(ex.getMessage());
            response.setEstado(ResponseBase.STATUS_EXCEPTION);
            tracer.currentSpan().tag("api.error", new ErrorUtil().generateStackTrace(ex));
        }
        if (log.isDebugEnabled()) {
            log.debug("crearUnidadTransporte FIN");
            tracer.currentSpan().tag("api.data.out", new JsonUtil().getJsonFromObjet(response));
        }
        return response;
    }

    @Override
    public ResponseBase actualizarUnidadTransporte(UnidadTransporte unidad, String ip) {
        ResponseBase response = new ResponseBase();
        try {
            if (unidad.getId() <= 0) {
                throw new IllegalArgumentException("Error en identificador de unidad de transporte.");
            }
            unidad.setIp(ip);
            String json = new JsonUtil().getJsonFromObjet(unidad);
            if (log.isDebugEnabled()) {
                log.debug("actualizarUnidadTransporte INI");
                log.debug("actualizarUnidadTransporte: " + unidad);
                tracer.currentSpan().tag("api.data.in", json);
            }
            response = new UnidadTransporteDao().updateUnidadTransporte(json, unidad.getUsuario());
            response.setResultado(response.getError() == 0);
            response.setEstado(ResponseBase.STATUS_MODIFICADO);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            response.setMensaje(ex.getMessage());
            response.setEstado(ResponseBase.STATUS_EXCEPTION);
            tracer.currentSpan().tag("api.error", new ErrorUtil().generateStackTrace(ex));
        }
        if (log.isDebugEnabled()) {
            log.debug("actualizarUnidadTransporte FIN");
            tracer.currentSpan().tag("api.data.out", new JsonUtil().getJsonFromObjet(response));
        }
        return response;
    }

    @Override
    public ResponseApi<UnidadTransporte> obtenerUnidadTransporte(int id) {
        ResponseApi<UnidadTransporte> response = new ResponseApi<>();
        try {
            if (id <= 0) {
                throw new IllegalArgumentException("Error en identificador de unidad de transporte.");
            }
            if (log.isDebugEnabled()) {
                log.debug("obtenerUnidadTransporte INI");
                log.debug("obtenerUnidadTransporte: " + id);
                tracer.currentSpan().tag("api.data.in", String.valueOf(id));
            }
            UnidadTransporteDao dao = new UnidadTransporteDao();
            UnidadTransporte ut = dao.selectById(id);
            if (ut == null) {
                response.setMensaje("Unidad de transporte no encontrado.");
                if (log.isDebugEnabled()) {
                    log.debug("obtenerUnidadTransporte FIN");
                    tracer.currentSpan().tag("api.data.out", new JsonUtil().getJsonFromObjet(response));
                }
                return response;
            }
            List<ProveedoresItem> pro = dao.selectProveedoresByUt(id);
            List<RacksItem> racks = dao.selectRacksByUt(id);
            ut.setProveedores(pro);
            ut.setRacks(racks);
            response.setData(ut);
            response.setId(0);
            response.setResultado(true);
            response.setEstado(ResponseBase.STATUS_OK);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            response.setMensaje(ex.getMessage());
            response.setEstado(ResponseBase.STATUS_EXCEPTION);
            tracer.currentSpan().tag("api.error", new ErrorUtil().generateStackTrace(ex));
        }
        if (log.isDebugEnabled()) {
            log.debug("obtenerUnidadTransporte FIN");
            tracer.currentSpan().tag("api.data.out", new JsonUtil().getJsonFromObjet(response));
        }
        return response;
    }

}
