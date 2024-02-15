package com.clienteFactura.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.clienteFactura.models.Clientes;
import com.clienteFactura.services.ClienteService;

@RestController
@RequestMapping(path = "/cliente")

public class ControllerCliente {

    @Autowired
    ClienteService clienteService;



    @GetMapping
    public List<Clientes> todos(){
        return clienteService.todos();
    }

    @GetMapping("{id}")
    public Optional<Clientes> byId(@PathVariable Long id){
        return clienteService.byId(id);
    }

    @PostMapping("crear")
    public Clientes crear(@RequestBody Clientes clientes){
        return clienteService.crear(clientes);
    }

    @PutMapping("modificar")
    public Clientes modificar(@RequestBody Clientes clientes){
        return clienteService.modificar(clientes);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        clienteService.borrar(id);
    }






}

