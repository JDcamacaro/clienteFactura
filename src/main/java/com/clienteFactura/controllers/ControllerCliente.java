package com.clienteFactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clienteFactura.services.ClienteService;

    @RestController
    @RequestMapping

public class ControllerCliente {    

    @Autowired
    private ClienteService clienteService;


    @GetMapping
    


}
