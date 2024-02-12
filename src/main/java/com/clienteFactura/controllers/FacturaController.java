package com.clienteFactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clienteFactura.services.FacturaServices;

@RestController
@RequestMapping
public class FacturaController {

    @Autowired
    private FacturaServices facturaServices;

    
}
