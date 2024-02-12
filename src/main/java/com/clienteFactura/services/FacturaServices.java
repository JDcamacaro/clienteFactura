package com.clienteFactura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clienteFactura.models.Facturas;
import com.clienteFactura.repository.FacturaRepository;

@Service

public class FacturaServices {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<Facturas> todos(){
        return facturaRepository.findAll();
    }


    public Facturas byId(Long id){
        return facturaRepository.getReferenceById(id);
    }

}
