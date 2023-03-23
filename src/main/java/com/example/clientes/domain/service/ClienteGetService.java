package com.example.clientes.domain.service;

import com.example.clientes.domain.entities.Cliente;

public interface ClienteGetService {
  Cliente getCliente(String documento);
}
