package com.rangel.agendamento_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
