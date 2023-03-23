package com.example.clientes.infrastructure.api.controller;

import com.example.clientes.application.ClienteGet;
import com.example.clientes.application.ClienteSave;
import com.example.clientes.domain.entities.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
  private final ClienteSave clienteSave;
  private final ClienteGet clienteGet;
  @PostMapping
  public ResponseEntity<Cliente> addProducto(@RequestBody Cliente cliente) {
    return new ResponseEntity<>(clienteSave.saveCliente(cliente), HttpStatus.CREATED);
  }
  @GetMapping
  public ResponseEntity<Cliente> getCliente(@RequestParam String documento) {
    return new ResponseEntity<>(clienteGet.getCliente(documento), HttpStatus.OK);
  }
}
