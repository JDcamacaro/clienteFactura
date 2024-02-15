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

    public List<Facturas> todasFact(){
        return facturaRepository.findAll();
    }


    @SuppressWarnings("null")
    public Facturas idFact(Long id){
        return facturaRepository.getReferenceById(id);
    }

    @SuppressWarnings("null")
    public Facturas crearFact(Facturas facturas){
        return facturaRepository.save(facturas);
    }

    @SuppressWarnings("null")
    public void borrarFact(Long id){
        facturaRepository.deleteById(id);
    }

}
