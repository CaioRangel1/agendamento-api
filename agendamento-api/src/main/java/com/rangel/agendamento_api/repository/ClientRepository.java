package com.rangel.agendamento_api.repository;

import com.rangel.agendamento_api.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);
    boolean existsByEmail(String email);
}