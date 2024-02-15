package com.clienteFactura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clienteFactura.models.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long> {


}

