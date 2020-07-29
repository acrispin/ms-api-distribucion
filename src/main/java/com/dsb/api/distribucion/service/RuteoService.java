package com.dsb.api.distribucion.service;

import brave.Tracer;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class RuteoService implements IRuteoService {

    @Autowired
    private Tracer tracer;


}
