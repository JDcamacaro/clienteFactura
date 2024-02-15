package com.clienteFactura.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clienteFactura.models.Clientes;
import com.clienteFactura.repository.ClienteRepository;


@Service

public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;




    public List<Clientes> todos(){
        return clienteRepository.findAll();        
    }

    //@SuppressWarnings("null")
    public Optional<Clientes> byId(Long id){
        return clienteRepository.findById(id);
    }

    //@SuppressWarnings("null")
    public Clientes crear(Clientes clientes){
        return clienteRepository.save(clientes);
    }

    //@SuppressWarnings("null")
    public Clientes modificar(Clientes clientes){
        return clienteRepository.save(clientes);
    }

    //@SuppressWarnings("null")
    public void borrar(Long id){
         clienteRepository.deleteById(id);
    }
}
