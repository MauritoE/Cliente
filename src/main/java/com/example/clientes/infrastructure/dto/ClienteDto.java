package com.example.clientes.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ClienteDto {
  private String nombre;
  @Id
  private String documento;
  private String estado;
}
