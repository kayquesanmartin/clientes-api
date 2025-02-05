package io.github.kayquesanmartin.clientesapi.repository;

import io.github.kayquesanmartin.clientesapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    List<Cliente> findByNome (String nome);
}