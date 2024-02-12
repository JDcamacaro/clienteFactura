package com.clienteFactura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clienteFactura.models.Clientes;
import com.clienteFactura.services.ClienteService;

    @RestController
    @RequestMapping

public class ControllerCliente {    

    @Autowired
    private ClienteService clienteService;


    @GetMapping
    public List<Clientes> todos(){
        return clienteService.todos();
    }
    
    @GetMapping("/{id}")
    public Clientes byId(@PathVariable Long id){
        return clienteService.byId(id);
    } 

    @PostMapping
    public Clientes crear(@RequestBody Clientes clientes){
        return clienteService.crear(clientes);
    }


}
