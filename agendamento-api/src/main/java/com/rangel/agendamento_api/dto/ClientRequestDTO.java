package com.rangel.agendamento_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ClientRequestDTO {
    @NotBlank(message="Nome é obrigatório")
    private String name;

    @Email(message = "Email inválido")
    @NotBlank(message="Email é obrigatório")
    private String email;

    private String phone;
}
