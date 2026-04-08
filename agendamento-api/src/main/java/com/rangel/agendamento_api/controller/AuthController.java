package com.rangel.agendamento_api.controller;

import com.rangel.agendamento_api.dto.AuthRequestDTO;
import com.rangel.agendamento_api.dto.AuthResponseDTO;
import com.rangel.agendamento_api.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody @Valid AuthRequestDTO dto){
        AuthResponseDTO response = authService.login(dto);
        return ResponseEntity.ok(response);
    }
}
