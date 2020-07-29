package com.dsb.api.distribucion.controller;

import com.dsb.api.distribucion.domain.Ruteo;
import com.dsb.api.distribucion.service.IRuteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/ruteo")
public class RuteoController {

    @Autowired
    public IRuteoService ruteoService;

    @PostMapping("/rutas")
    public List<Ruteo> obtenerUsuarioLogin(
            @RequestBody Ruteo ruteo, HttpServletRequest request) {
        return null;
    }


}
