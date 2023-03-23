package com.example.clientes.infrastructure.Repository;

import com.example.clientes.infrastructure.dto.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends JpaRepository<ClienteDto, String>,
    CrudRepository<ClienteDto, String> {

}
