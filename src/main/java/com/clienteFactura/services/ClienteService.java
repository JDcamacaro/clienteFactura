package com.clienteFactura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clienteFactura.models.Clientes;
import com.clienteFactura.repository.ClienteRepository;

@Service

public class ClienteService {

    @Autowired
    public ClienteRepository clienteRepository;


    public List<Clientes> todos(){
        return clienteRepository.findAll();
    }

    public Clientes byId(Long id){
        return clienteRepository.getReferenceById(id);
    }

    public Clientes crear(Clientes clientes){
        return clienteRepository.save(clientes);
    }

    public Clientes modificar(Clientes clientes){
        return clienteRepository.save(clientes);
    }

    public void borrar(Long id){
         clienteRepository.deleteById(id);
    }
}
