package com.clienteFactura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clienteFactura.models.Facturas;
import com.clienteFactura.services.FacturaServices;

@RestController
@RequestMapping
public class FacturaController {

    @Autowired
    private FacturaServices facturaServices;

    @GetMapping
    public List<Facturas> todo(){
        return facturaServices.todos();
        
    }
}
