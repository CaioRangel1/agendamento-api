package com.rangel.agendamento_api.repository;

import com.rangel.agendamento_api.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDateTime(LocalDateTime dateTime);
}
