package com.clienteFactura.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clienteFactura.models.Clientes;
import com.clienteFactura.services.ClienteService;


    @RestController
    @RequestMapping("/api")

public class ControllerCliente {    

    @Autowired
    private ClienteService clienteService;    



    @GetMapping("cliente")
    public List<Clientes> todos(){
        return clienteService.todos();
    }
    
    @GetMapping("cliente/{id}")
    public Optional<Clientes> byId(@PathVariable(name = "id") Long id){
        return clienteService.byId(id);
    } 

    @PostMapping("/cliente/crear")
    public Clientes crear(@RequestBody Clientes clientes){
        return clienteService.crear(clientes);
    }

    @PostMapping("cliente/{id}")
    public Clientes modificar(@RequestBody Clientes clientes, @PathVariable Long id){
        Clientes.setIdClientes(id);
        return clienteService.crear(clientes);
    }

    @DeleteMapping("cliente/delete/{id}")
    public void delete(@PathVariable Long id){
        clienteService.borrar(id);
    }






}
