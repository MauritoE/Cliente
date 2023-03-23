package com.example.clientes.infrastructure.adapter;

import com.example.clientes.domain.entities.Cliente;
import com.example.clientes.domain.service.ClienteGetService;
import com.example.clientes.infrastructure.Repository.ClienteRepository;
import com.example.clientes.infrastructure.dto.ClienteDto;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGetAdapter implements ClienteGetService{

  private final ClienteRepository clienteRepository;

  public Cliente getCliente(String documento) {
    Optional<ClienteDto> clienteDto = clienteRepository.findById(documento);
    return clienteDto.map(this::buildCliente).orElse(null);
  }


  private Cliente buildCliente(ClienteDto usuario){
    return new Cliente(usuario.getNombre(), usuario.getDocumento(), usuario.getEstado());
  }
}
