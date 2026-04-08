package com.rangel.agendamento_api.dto;

import com.rangel.agendamento_api.entity.AppointmentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AppointmentResponseDTO {
    private Long id;
    private String clientName;
    private String serviceTypeName;
    private LocalDateTime dateTime;
    private AppointmentStatus status;
}
