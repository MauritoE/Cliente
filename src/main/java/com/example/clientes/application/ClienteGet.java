package com.example.clientes.application;

import com.example.clientes.domain.entities.Cliente;
import com.example.clientes.domain.service.ClienteGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGet {
  private final ClienteGetService clienteGetService;
  public Cliente getCliente(String documento){
    return clienteGetService.getCliente(documento);
  }
}
