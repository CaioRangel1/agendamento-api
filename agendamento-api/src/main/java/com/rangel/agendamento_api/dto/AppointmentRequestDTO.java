package com.rangel.agendamento_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentRequestDTO {
    @NotNull(message = "Cliente é obrigatório")
    private Long clientId;

    @NotNull(message = "Serviço é obrigatório")
    private Long serviceTypeId;

    @NotNull(message = "Data e hora são obrigatórios")
    private LocalDateTime dateTime;
}
