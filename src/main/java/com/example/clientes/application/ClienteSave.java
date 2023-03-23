package com.example.clientes.application;

import com.example.clientes.domain.entities.Cliente;
import com.example.clientes.domain.service.ClienteSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ClienteSave {
  private ClienteSaveService clienteSaveService;
  public Cliente saveCliente(Cliente cliente){
    return clienteSaveService.save(cliente);
  }
}
