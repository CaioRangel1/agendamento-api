package com.rangel.agendamento_api.repository;

import com.rangel.agendamento_api.entity.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, Long> {
}
