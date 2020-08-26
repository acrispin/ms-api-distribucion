package com.dsb.api.distribucion.controller;

import com.dsb.api.commons.domain.response.ResponseApi;
import com.dsb.api.commons.domain.response.ResponseBase;
import com.dsb.api.distribucion.domain.UnidadTransporte;
import com.dsb.api.distribucion.service.IUnidadTransporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/unidad-transporte")
public class UnidadTransporteController {

    @Autowired
    public IUnidadTransporteService unidadTransporteService;

    @PostMapping("")
    public ResponseBase crearUnidadTransporte(
            @RequestBody UnidadTransporte unidad, HttpServletRequest request) {
        return unidadTransporteService.crearUnidadTransporte(unidad, request.getRemoteAddr());
    }

    @PutMapping("")
    public ResponseBase actualizarUnidadTransporte(
            @RequestBody UnidadTransporte unidad, HttpServletRequest request) {
        return unidadTransporteService.actualizarUnidadTransporte(unidad, request.getRemoteAddr());
    }

    @GetMapping(path = "/{id}")
    public ResponseApi<UnidadTransporte> obtenerUnidadTransporte(@PathVariable int id) {
        return unidadTransporteService.obtenerUnidadTransporte(id);
    }

}
