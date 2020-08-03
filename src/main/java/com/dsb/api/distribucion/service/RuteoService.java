package com.dsb.api.distribucion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsb.api.commons.domain.distribucion.request.RuteoFiltroRequest;
import com.dsb.api.commons.domain.response.ResponseLegacy;
import com.dsb.api.distribucion.domain.Ruteo;
import com.dsb.api.distribucion.domain.RuteoWrapper;

import brave.Tracer;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class RuteoService implements IRuteoService {

    @Autowired
    private Tracer tracer;

	@Override
	public ResponseLegacy<RuteoWrapper> obtenerRutas(RuteoFiltroRequest request, Integer estado, Integer pagina) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseLegacy<Ruteo> obtenerDetalleRuta(Integer idRuta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseLegacy<Ruteo> obtenerDetalleGuia(Integer idGuia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseLegacy<Ruteo> obtenerVehiculosRuta(RuteoFiltroRequest request, Integer pagina) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseLegacy<Ruteo> obtenerPosicionActual(Integer idVehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseLegacy<Ruteo> obtenerWaypoints(Integer idVehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseLegacy<Ruteo> obtenerDetalleWaypoint(Integer idVehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseLegacy<Ruteo> obtenerDetalleVehiculo(Integer idVehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseLegacy<String> enviarDetalleVehiculoCorreo() {
		// TODO Auto-generated method stub
		return null;
	}


}
