package com.rangel.agendamento_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ServiceTypeResponseDTO {
    private Long id;
    private String name;
    private Integer duration;
    private BigDecimal price;
}
