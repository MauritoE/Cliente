package com.example.clientes.infrastructure.adapter;

import com.example.clientes.domain.entities.Cliente;
import com.example.clientes.domain.service.ClienteSaveService;
import com.example.clientes.infrastructure.Repository.ClienteRepository;
import com.example.clientes.infrastructure.mapper.ClienteMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteSaveAdapter implements ClienteSaveService {

  private final ClienteRepository clienteRepository;
  private final ClienteMapper clienteMapper;

  public Cliente save(Cliente cliente){
    return clienteMapper.toEntity(clienteRepository.save(clienteMapper.toDto(cliente)));
  }
}
