package com.example.clientes.infrastructure.mapper;

import com.example.clientes.domain.entities.Cliente;
import com.example.clientes.infrastructure.dto.ClienteDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper{
  ClienteDto toDto(Cliente cliente);
  Cliente toEntity(ClienteDto clienteDto);
}
