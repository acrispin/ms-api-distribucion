package com.dsb.api.distribucion.service;

import com.dsb.api.commons.domain.distribucion.request.RuteoFiltroRequest;
import com.dsb.api.commons.domain.response.ResponseLegacy;
import com.dsb.api.distribucion.domain.Ruteo;
import com.dsb.api.distribucion.domain.RuteoWrapper;

public interface IRuteoService {

	ResponseLegacy<RuteoWrapper> obtenerRutas(RuteoFiltroRequest request, Integer estado, Integer pagina);
	ResponseLegacy<Ruteo> obtenerDetalleRuta(Integer idRuta);
	ResponseLegacy<Ruteo> obtenerDetalleGuia(Integer idGuia);
	ResponseLegacy<Ruteo> obtenerVehiculosRuta(RuteoFiltroRequest request, Integer pagina);
	ResponseLegacy<Ruteo> obtenerPosicionActual(Integer idVehiculo);
	ResponseLegacy<Ruteo> obtenerWaypoints(Integer idVehiculo);
	ResponseLegacy<Ruteo> obtenerDetalleWaypoint(Integer idVehiculo);
	ResponseLegacy<Ruteo> obtenerDetalleVehiculo(Integer idVehiculo);
	ResponseLegacy<String>enviarDetalleVehiculoCorreo();
	
}
