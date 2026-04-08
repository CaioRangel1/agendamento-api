package com.rangel.agendamento_api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ServiceTypeRequestDTO {
    @NotBlank(message = "Nome é obrigatório")
    private String name;

    private Integer duration;

    private BigDecimal price;
}
