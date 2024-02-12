package com.clienteFactura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clienteFactura.models.Facturas;

@Repository
public interface FacturaRepository extends JpaRepository<Facturas, Long> {

}
