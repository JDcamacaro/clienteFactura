package com.clienteFactura.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity

public class Facturas {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String producto;

@ManyToOne
@JoinColumn(name = "clientes_id")
private Clientes clientes;

}
