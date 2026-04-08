package com.rangel.agendamento_api.service;

import com.rangel.agendamento_api.config.JwtService;
import com.rangel.agendamento_api.dto.AuthRequestDTO;
import com.rangel.agendamento_api.dto.AuthResponseDTO;
import com.rangel.agendamento_api.entity.User;
import com.rangel.agendamento_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthResponseDTO login(AuthRequestDTO dto){
        User user = userRepository.findByEmail(dto.getEmail());

        if(user == null){
            throw new RuntimeException("Usuário não encontrado");
        }

        if(!passwordEncoder.matches(dto.getPassword(), user.getPassword())){
            throw new RuntimeException("Senha incorreta");
        }

        String token = jwtService.generateToken(user.getEmail());
        return new AuthResponseDTO(token);
    }
}
